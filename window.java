import javax.swing.*;


class window {

     public static void main(String args[])
    {
        JFrame f = new JFrame();
        
        JButton b = new JButton("Click");
        b.setIcon(new ImageIcon("smartphone.png"));
        b.setBounds(70,100,80,30);

        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
}