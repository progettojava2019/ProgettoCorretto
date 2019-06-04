package Thread;

import Bottoni.*;

public class provaMainThread extends Thread {

    public static void main(String[] args) {

        new provaMainThread();
    }


    public provaMainThread(){


        Thread t = new Thread(this, "Primo Thread");

        new b0Evento();
        System.out.println("Creo");

        t.run();
    }

    @Override
    public void run() {
        try{
            Thread.sleep(1000);

            while(true) {
                new b1Evento();
                Thread.sleep(1000);

                new b2Evento();
                Thread.sleep(1000);

                new b3Evento();
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println("Thread creo ha lanciato un'eccezione");
        }

    }
}
