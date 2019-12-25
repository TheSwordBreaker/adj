import java.awt.*;
import javax.swing.*;

class FlowLayoutExample{

    JFrame f;

    JButton b = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");

   FlowLayoutExample(){

        f = new JFrame();
        f.add(b);
        f.add(b2);
        f.add(b3);

        // f.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        // f.setLayout(new FlowLayout(FlowLayout.LEFT));
        // f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        f.setLayout(new FlowLayout(FlowLayout.LEADING));
        // f.setLayout(new FlowLayout(FlowLayout.TRAILING));

        f.setSize(300,300);
        f.setVisible(true);




    }

    public static void main (String[] args){

        new FlowLayoutExample();

    }
}