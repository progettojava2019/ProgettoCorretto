package Grafica;

import javax.swing.*;
import java.awt.*;

import static Utili.Data.*;

public class MyFrame extends JFrame {

    public MyFrame(String titolo) {
        super(titolo);
        this.dispose();
        this.setBounds(100, 100, numSquare * squareDimension + 2, numSquare * squareDimension + 110);
        this.setMinimumSize(new Dimension(numSquare * squareDimension + 2, numSquare * squareDimension + 23));
    }

}
