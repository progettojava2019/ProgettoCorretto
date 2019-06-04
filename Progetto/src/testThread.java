public class testThread implements Runnable{

    public void prova(){

        Thread t = new Thread(this, "Nuovo Thread");

        t.start();
    }


    public static void main(String[] args) {

        new testThread().prova();
    }

    @Override
    public void run() {

        //for(int i=0; i<3; i++) {
            System.out.println();
            try {
                System.out.println("E daje e daje e daje");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Thread principale interrotto");
            }
            System.out.println("E bombe e bombe e bombe");
        //}
    }
}
