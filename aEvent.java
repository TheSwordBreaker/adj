import java.awt.*;
import java.awt.event.*;


public class aEvent extends Frame {
    TextField tf = new TextField();
    Button b = new Button("click me");
    

    aEvent(){
        
        tf.setBounds(60+100,50,170,20);
        b.setBounds(120+80,100,80,30);
        
        b.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                tf.setText("hello");  
            }  
        });  
        
        add(b);
        add(tf);
        
        setSize(500,300);
        setLayout(null);
        setVisible(true);

        
    }

    public static void main(String args[]){
        aEvent a = new aEvent();
    }

    
}