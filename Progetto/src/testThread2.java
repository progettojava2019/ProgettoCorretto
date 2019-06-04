import SviluppoPopolazione.CreazionePopolazione;
import Utili.Matrice;

public class testThread2 implements Runnable{

    public Matrice matriceMaschi = new Matrice();
    //private CreazionePopolazione g0 = new CreazionePopolazione();


    public static void main(String[] args) {
        new testThread2().prova();
    }


    public void prova(){


        Thread t = new Thread(this, "Thread");
        t.start();
    }




    @Override
    public void run() {


        try {
            int numMaschiIniziali = 3;
            //g0.creaSoggetti(matriceMaschi, "Maschi", numMaschiIniziali);
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Matrice Maschi");
        matriceMaschi.stampaMatrice();
    }
}
