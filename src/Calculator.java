
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class close extends WindowAdapter {
    
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    
}


class cal implements ActionListener {
    
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
    
    TextField tf;
    
    String fv,sv,op;
    
    double fdv,sdv,tot;
    
    cal() {
        
        Frame f1 = new Frame();
        
        f1.setBackground(Color.yellow);  // Set background color
        f1.addWindowListener(new close()); // window close
        f1.setBounds(700, 250, 300, 400); // window opening position
        f1.setTitle("My Cal"); // Set Title
        
        MenuBar mbar = new MenuBar();
        
        MenuItem mi1 = new MenuItem("Standard");
        
        MenuItem mi2 = new MenuItem("Scientific");
        MenuItem mi3 = new MenuItem("Copy");
        MenuItem mi4 = new MenuItem("Paste");
        MenuItem mi5 = new MenuItem("Help");
        MenuItem mi6 = new MenuItem("About");
        
        Menu m1 = new Menu("File");
        m1.add(mi1);
        m1.add(mi2);
        
        Menu m2 = new Menu("Edit");
        m2.add(mi3);
        m2.add(mi4);
        
        Menu m3 = new Menu("View");
        m3.add(mi5);
        m3.add(mi6);
        
        mbar.add(m1);
        mbar.add(m2);
        mbar.add(m3);
        
        f1.setMenuBar(mbar);
        
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button(".");
        b12 = new Button("+");
        b13 = new Button("-");
        b14 = new Button("*");
        b15 = new Button("/");
        b16 = new Button("=");
        b17 = new Button("C");
        b18 = new Button("CE");
        
        Font font1 = new Font("Cambria Math", Font.BOLD, 10);
        Font font2 = new Font("Courier New", Font.BOLD, 11);
        
        b1.setFont(font1);
        b2.setFont(font1);
        b3.setFont(font1);
        b4.setFont(font1);
        b5.setFont(font1);
        b6.setFont(font1);
        b7.setFont(font1);
        b8.setFont(font1);
        b9.setFont(font1);
        b10.setFont(font1);
        b11.setFont(font2);
        b12.setFont(font2);
        b13.setFont(font2);
        b14.setFont(font2);
        b15.setFont(font2);
        b16.setFont(font2);
        b17.setFont(font2);
        b18.setFont(font2);
        
        tf = new TextField(25);
        
        Font font = new Font("Cambria Math", Font.BOLD, 14);
        
        tf.setFont(font);
        tf.setEditable(false);
        
        tf.setForeground(Color.black);
        tf.setBackground(Color.white);
        
        Panel p1 = new Panel();
        
        Panel p2 = new Panel();
        
        GridLayout g1 = new GridLayout(6, 5, 3, 3);
        
        p1.add(tf);
        
        p2.setLayout(g1);
        
        p2.setBackground(Color.white);
        
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        
        f1.add(p1,BorderLayout.NORTH);
        f1.add(p2,BorderLayout.CENTER);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        
        f1.setVisible(true);  // window visible
        
    }

    @Override
    public void actionPerformed(ActionEvent d) {
        
        Object o = d.getSource();
        
        if(o.equals(b1)){
            tf.setText(tf.getText() + b1.getLabel());
        } else if (o.equals(b2)) {
            tf.setText(tf.getText() + b2.getLabel());
        }else if (o.equals(b3)) {
            tf.setText(tf.getText() + b3.getLabel());
        }else if (o.equals(b4)) {
            tf.setText(tf.getText() + b4.getLabel());
        }else if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());
        }else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());
        }else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());
        }else if (o.equals(b8)) {
            tf.setText(tf.getText() + b8.getLabel());
        }else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        }else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());
        }else if (o.equals(b12)) {
            
            fv = tf.getText();
            tf.setText("");;
            
            op = b12.getLabel();
        }else if (o.equals(b13)) {
            
            fv = tf.getText();
            tf.setText("");;
            
            op = b13.getLabel();
        }else if (o.equals(b14)) {
            
            fv = tf.getText();
            tf.setText("");;
            
            op = b14.getLabel();
            
        }else if (o.equals(b15)) {
            
            fv = tf.getText();
            tf.setText("");;
            
            op = b15.getLabel();
            
        }else if (o.equals(b16)) {
            
            sv = tf.getText();
            
            fdv=Double.parseDouble(fv);
            sdv=Double.parseDouble(sv);
            
            if(op.equals("+")){
                
                tot = fdv+sdv;
                
            } else if(op.equals("-")) {
                
                tot = fdv-sdv;
                
            }else if(op.equals("*")) {
                
                tot = fdv*sdv;
                
            }else if(op.equals("/")) {
                
                tot = fdv/sdv;
                
            }
            
            tf.setText(tot+"");
            
        }
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


public class Calculator {
    
    public static void main(String[] args) {
        
        new cal();
        
    }
    
}
