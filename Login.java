import java.awt.*;
import java.awt.event.*;


class Login extends Frame{
//Menu
    MenuBar mb = new MenuBar();
    Menu menu = new Menu("Menu");
    Menu submenu = new Menu("Submenu");
    MenuItem i1 = new MenuItem("Item 1");
    MenuItem i2 = new MenuItem("Item 2");
    MenuItem i3 = new MenuItem("Item 3");
    MenuItem i4 = new MenuItem("Item 4");
    MenuItem i5 = new MenuItem("Item 5");

//dialog
    Frame f = new Frame("So");
    private Dialog d = new Dialog(f,"Example",true);
    Button b1 = new Button("Close");
    Label l1 = new Label("Hello Dialog"); 

//Label and Text field
    Label label6 = new Label("Rollno:");
    TextField rollno = new TextField();

    Label label1 = new Label("Username");
    TextField name = new TextField();

    Label label2 = new Label("Review");
    TextArea area = new TextArea();
    
    Label label3 = new Label("Favourite lanuage");
    Checkbox checkbox1 = new Checkbox("Java ",true);
    Checkbox checkbox2 = new Checkbox("Python");
    Checkbox checkbox3 = new Checkbox("Php");

    Label label4 = new Label("Gender");
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox checkbox4 = new Checkbox("Male",cbg,true);
    Checkbox checkbox5 = new Checkbox("Female",cbg,false);

    Canvas canvas = new Canvas();

    Label something = new Label("Something");
    Choice c = new Choice();

    Label something2 = new Label("Something2");
    List c2 = new List();

    Button b = new Button("Give review");

    PopupMenu popupmenu = new PopupMenu("Edit");
    MenuItem cut = new MenuItem("Cut");
    MenuItem copy = new MenuItem("Copy");
    MenuItem paste = new MenuItem("Paste");


    Login(){

        Image icon = Toolkit.getDefaultToolkit().getImage("folder.png");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        d.setLayout(new FlowLayout());
        d.add(b1);
        d.add(l1);

        submenu.add(i4);
        submenu.add(i5);

        menu.add(submenu);
        mb.add(menu);

        label6.setBounds(50,40,100,30);
        rollno.setBounds(50,70,200,30);
        
        label1.setBounds(50,100,100,30);
        name.setBounds(50,130,200,30);
        
        label2.setBounds(50,160,100,30);
        area.setBounds(50,190,300,100);
        
        label3.setBounds(50,300,100,30);
        
        checkbox1.setBounds( 70, 320,50,50);
        checkbox2.setBounds(70, 350,50,50);
        checkbox3.setBounds(70, 380,50,50);

        canvas.setBackground(Color.GRAY);
        canvas.setSize(100,100);
        canvas.setBounds(70,400,100,100);
        
        label4.setBounds(220,300,100,30);
        checkbox4.setBounds(240,320,50,50);
        checkbox5.setBounds(240, 350,60,50);
        
        something.setBounds(50,520,100,30); 
        c.setBounds(50,550,75,75);
        c.add("Item 1");
        c.add("Item 2");
        
        something2.setBounds(220,520,100,30); 
        c2.setBounds(240,550,75,75);
        c2.add("Item 1");
        c2.add("Item 2");
        c2.add("Item 3");
        
        b.setBounds(50,600,80,30);

        cut.setActionCommand("Cut");
        copy.setActionCommand("Copy");
        paste.setActionCommand("Paste");

        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);

        
        add(label6);
        add(rollno);
        
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(something);

        add(name);
        add(area);

        add(checkbox1);
        add(checkbox2);
        add(checkbox3);
        add(checkbox4);
        add(checkbox5);

        add(c);
        add(c2);

        ActionListener Button = (ActionEvent e)->d.setVisible(true); 
        ActionListener Buttond = (ActionEvent e)->d.setVisible(false); 
        

        
        b.addActionListener(Button); 
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent w){
                dispose();
            }
        }); 
        
        b1.addActionListener(Buttond);
        add(b);

        d.setSize(300,300);    
        // d.setVisible(true);  

        

        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                popupmenu.show(e.getComponent(),e.getX(),e.getY());
            }
        });


        add(popupmenu);
        
        setIconImage(icon);
        setMenuBar(mb);
        setSize(500,700);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        Login form = new Login();
    }


}