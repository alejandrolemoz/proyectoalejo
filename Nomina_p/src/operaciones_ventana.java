import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JButton;


public class operaciones_ventana extends JFrame {  
    private   JButton jbtBorrar;
    private JButton jbtAgregar;
    private JButton jbtcerrar;

    
  
        
     JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
   
    
     
     public operaciones_ventana(){
     
    p1.add(jbtAgregar = new JButton("Agregar"),BorderLayout.CENTER);
    p1.add(jbtBorrar=new JButton("borrar"),BorderLayout.NORTH);
    p1.add(jbtcerrar=new JButton("cerrar"),BorderLayout.SOUTH); 
   add(p1);
   
 
      
      
     
     }
}

