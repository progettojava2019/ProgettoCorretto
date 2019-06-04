package Bottoni;

import Utili.Data;

import javax.swing.*;
import java.awt.*;

public class Bottoni extends JPanel {

    public Bottoni(){

        JButton b0 = new JButton("Inizio simulazione");
        b0.setEnabled(true);
        JButton b1 = new JButton("Nascita");
        b1.setEnabled(false);
        JButton b2 = new JButton("Lotta");
        b2.setEnabled(false);
        JButton b3 = new JButton("Crescita figli");
        b3.setEnabled(false);


        b0.setFont(new Font("Courier new", Font.BOLD, 30));
        add(b0);
        b0.addActionListener(e -> {

            new b0Evento();

            b0.setEnabled(false);
            b1.setEnabled(true);
        });



        b1.setFont(new Font("Courier new", Font.BOLD, 30));
        add(b1);
        b1.addActionListener(e -> {

            new b1Evento();

            b1.setEnabled(false);
            b2.setEnabled(true);

        });


        b2.setFont(new Font("Courier new", Font.BOLD, 30));
        add(b2);
        b2.addActionListener(e -> {

            new b2Evento();
            b2.setEnabled(false);
            //b3.setEnabled(true);
            if(Data.matriceFigli.getnRigheComplete() != 0)
                b3.setEnabled(true);
        });



        b3.setFont(new Font("Courier new", Font.BOLD, 30));
        add(b3);
        b3.addActionListener(e -> {

            new b3Evento();
            b3.setEnabled(false);
            b1.setEnabled(true);

        });


    }
}
