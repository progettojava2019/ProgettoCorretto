package Bottoni;

import SviluppoPopolazione.EvoluzionePopolazione;
import Utili.Data;
import Grafica.MostraGrafico;

public class b3Evento {


    public b3Evento(){

        new EvoluzionePopolazione().crescitaFigli(Data.matriceFigli);

        //Disegna su un nuovo frame
        MostraGrafico grafico = new MostraGrafico();
        grafico.riempiGrafico(Data.matriceMaschi, "Maschi", Data.frame);
        grafico.riempiGrafico(Data.matriceFemmine, "Femmine", Data.frame);
        grafico.riempiGrafico(Data.matriceFigli, "Figli", Data.frame);

    }
}
