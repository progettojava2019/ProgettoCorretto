package Utili;

import Grafica.MyFrame;

public final class Data {


        public final static int numSquare = 40; //Numero di quadrati per lato
        public final static int squareDimension = 10; //dimensioni del singolo quadratino della grglia

        public final static int minimo = 0;
        public final static int massimo = (numSquare - 1) * squareDimension;

        public static int valMinimoControllato = (numSquare-1)*squareDimension/3; // = 30;
        public static int valMassimoControllato = (numSquare-1)*squareDimension*2/3;// = 60;



        /*
        Inzializzo le matrice di Maschi, Femmine e Figli
        */

        //Matrice di maschi (la dimensione è tale per cui non sarà mai piena)
        public final static Matrice matriceMaschi = new Matrice(numSquare*numSquare, 2);
        //Matrice di femmine (la dimensione è tale per cui non sarà mai piena)
        public static Matrice matriceFemmine = new Matrice(numSquare*numSquare, 2);
        //Matrice di figli (la dimensione è tale per cui non sarà mai piena)
        public static Matrice matriceFigli = new Matrice(numSquare*numSquare, 2);



        public final static MyFrame frame = new MyFrame("Sviluppo popolazione");

}
