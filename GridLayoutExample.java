import java.awt.*;
import javax.swing.*;

class GridLayoutExample{

    JFrame f;

    JButton b = new JButton("Button 1");
    JButton b2 = new JButton("Button 2");
    JButton b3 = new JButton("Button 3");

    GridLayoutExample(){

        f = new JFrame();
        f.add(b);
        f.add(b2);
        f.add(b3);

        f.setLayout(new GridLayout(3,1));
        f.setSize(300,300);
        f.setVisible(true);




    }

    public static void main (String[] args){

        new GridLayoutExample();

    }
}