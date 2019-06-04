package SviluppoPopolazione;

import Bottoni.b0Evento;
import Utili.Data;
import Utili.Matrice;
import Utili.MatriceSceriffo;
import Utili.Random;

public class CreazionePopolazione {



    public Matrice creaSoggetti(Matrice mat, int numSoggetti){

        MatriceSceriffo matriceSceriffo = new MatriceSceriffo();

        for(int i = 0; i < numSoggetti; i++){

            int x, y;
            if(b0Evento.inizioSimulazione == 0){
                x = new Random().randomizza(Data.valMinimoControllato, Data. valMassimoControllato);
                y = new Random().randomizza(Data.valMinimoControllato, Data. valMassimoControllato);
            } else{
                x = new Random().randomizza(Data.minimo, Data.massimo);
                y = new Random().randomizza(Data.minimo, Data.massimo);
            }

            //System.out.println("Nuovo soggetto : [" + x + ", " + y + "]");
            boolean controllore = true; //non cambia nulla se true o false, tanto il metodo in cui lo usa lo definisce tru

            if(matriceSceriffo.getnRigheComplete() != 0){
                controllore = new MatriceSceriffo().controlla(x, y, controllore);
            }

            if(controllore){
                mat.addRiga(x, y);
                matriceSceriffo.addRiga(x,y);
            } else{
                //System.out.println("Sono uno sceriffo e ho fatto il mio lavoro");
                i -= 1;
            }
        }

        //System.out.println("Matrice di controllo finale");
        //matriceSceriffo.stampaMatrice();

        return mat;
    }



}