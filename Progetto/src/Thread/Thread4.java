package Thread;

import Bottoni.b3Evento;
import Utili.Data;

public class Thread4 extends Thread{

    @Override
    public void run() {
        try{
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println("quarto Thread ha lanciato un'eccezione");
        }
        System.out.println("cresco figli");
        new b3Evento();

    }
}

