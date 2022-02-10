import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    MyFrame(String s){
        super (s);
        setSize(400, 200);
        setVisible(true);
        Panel panel = new Panel();
        add(new TextField("Выполнила Необутова Наталья :)"), BorderLayout.NORTH);
        add(panel);
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.pink);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                System.exit (0);
            }
        });
    }
    public static void main(String[] args){
        new MyFrame("Моя программа");
    }
}
