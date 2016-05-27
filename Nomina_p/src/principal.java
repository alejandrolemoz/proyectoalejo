
import java.awt.FlowLayout;
import javax.swing.JFrame;


public class principal {
    
    public static void main(String args[]){
        principal principal;
        principal = new principal();
    
     operaciones_ventana operaciones= new operaciones_ventana();
         JFrame ventana= new JFrame();
       operaciones.setSize(300,400);
        operaciones. setTitle("principal");
        operaciones.setResizable(true);
        operaciones.setLayout(new FlowLayout());
        operaciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        operaciones.setLocationRelativeTo(null);
      operaciones.setVisible(true); //
        
    }
    
}
