package Thread;

import Bottoni.b2Evento;

public class Thread3 extends Thread{

    @Override
    public void run() {
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println("terzo Thread ha lanciato un'eccezione");
        }

        new b2Evento();

    }
}
