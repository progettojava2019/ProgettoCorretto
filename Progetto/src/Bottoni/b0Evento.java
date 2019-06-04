package Bottoni;

import SviluppoPopolazione.CreazionePopolazione;
import Utili.Data;
import Grafica.MostraGrafico;

public class b0Evento {

    public static int inizioSimulazione = 0;

    public b0Evento(){

        CreazionePopolazione crea = new CreazionePopolazione();
        MostraGrafico grafico = new MostraGrafico();

        int numMaschiIniziali = 100;
        int numFemmineIniziali = 95;

        double numMaxIndividuiIniziali = Math.pow( (double) ((Data.valMassimoControllato - Data.valMinimoControllato)/Data.squareDimension + 1), 2);
        if(numMaschiIniziali+numFemmineIniziali < numMaxIndividuiIniziali) {
            crea.creaSoggetti(Data.matriceMaschi, numMaschiIniziali);
            crea.creaSoggetti(Data.matriceFemmine, numFemmineIniziali);
            inizioSimulazione ++;//Da qui in poi non uso più il random controllato
        }
        else {
            double numMax = numMaxIndividuiIniziali-1;
            System.out.println("Hai inserito troppi individui iniziali!! Il numero massimo consetito è: " + numMax);
        }


        grafico.riempiGrafico(Data.matriceMaschi, "Maschi", Data.frame);
        grafico.riempiGrafico(Data.matriceFemmine, "Femmine", Data.frame);
    }
}
