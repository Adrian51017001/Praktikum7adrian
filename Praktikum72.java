/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum72;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;


/**
 *
 * @author ADRIAN H. SUWARDI
 */
public class Praktikum72 extends JFrame {

    /**
     * @param args the command line arguments
     */
    
public Praktikum72 () {
    FlowLayout flowLayout = new FlowLayout (FlowLayout.CENTER, 5, 10);
    
    Container container = getContentPane();
    
    container.setLayout(flowLayout);
    
    container.add(new JButton ("Tombol 1"));
    container.add(new JButton ("Tombol 2"));
    container.add(new JButton ("Tombol 3"));
    container.add(new JButton ("Tombol 4"));
    container.add(new JButton ("Tombol 5"));
    
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Praktikum72 jendela = new Praktikum72 ();
       jendela.setTitle("Kelas DemoFlowLayout");
       jendela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jendela.setSize(390, 120);
       jendela.setVisible(true);
    }
    
}
