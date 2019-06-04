package Thread;

import Bottoni.b1Evento;

public class Thread2 extends Thread{

    @Override
    public void run() {
        try{

            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("Secondo Thread ha lanciato un'eccezione");
        }
        new b1Evento();
    }
}
