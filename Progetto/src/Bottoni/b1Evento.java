package Bottoni;

import SviluppoPopolazione.EvoluzionePopolazione;
import Utili.Data;
import Grafica.MostraGrafico;

public class b1Evento {

    public b1Evento(){

        new EvoluzionePopolazione().nascitaFigli(Data.matriceMaschi, Data.matriceFemmine);

        //Disegna su un nuovo frame
        MostraGrafico grafico = new MostraGrafico();
        grafico.riempiGrafico(Data.matriceMaschi, "Maschi", Data.frame);
        grafico.riempiGrafico(Data.matriceFemmine, "Femmine", Data.frame);
        grafico.riempiGrafico(Data.matriceFigli, "Figli", Data.frame);

        //DIsegna sullo stesso frame
        /*g0D.riempiGrafico(matriceMaschi, "Maschi");
        g0D.riempiGrafico(matriceFemmine, "Femmine");
        g0D.riempiGrafico(matriceFigli, "Figli");*/


    }
}
