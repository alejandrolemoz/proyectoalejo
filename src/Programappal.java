
import java.util.Scanner;// importamos la libreria scanner para leer por consola

import javax.swing.JOptionPane;// importamos la esta liberia para poder usar cuadors de dialogos en el menu

public class Programappal { // asi llammos a la clase priciapl donde llamamos todos los metodos

    public static void main(String args[]) { // esta clase contiene el metodo principal
        Scanner Leer = new Scanner(System.in); // declaramos una variable leer de la clase scanner
        Operlista op1 = new Operlista();// instanciamos un objecto de la clase operlista
        int opc; // una variable declarada opc para  tener guardado las opcines
        String p;// una variable de tipo cadene  para opoder sacar el mensaje por panel
        /* @ autor  hecho por alejandro lemos gomez
        este es el programa principal donde  mediante un menu llamamos a  cada subprograma
 */
        do { // para este  programa se implemento  un mientras que
            // cada uno de esto numeros   representa  un subprogama en forma de menu
            p = JOptionPane.showInputDialog("menu\n"
                    + "1.crear lista\n"
                    + "2. Imprimir Lista\n"
                    + " 3. impares \n"
                    + "4. mayor y menor \n"
                    + "5. eliminar \n"
                    + "6. promedio\n"
                    + "7. repetir\n"
                    + "8.numeros primos\n"
                    + "9.salir"
            ); // fin del menù

            opc = Integer.parseInt(p); // capture la opcion
            switch (opc) { // el swicht se prende mientras sea un numero
                case 1: // caso  uno me llama el metodo Crear_lista de la clase operlista mediante el objecto creado op1 
                    System.out.println("creando la lista: ");
                   op1.Crear_Lista();
                    break;// detener o romper el  la condicion
                case 2:// caso  dos me llama el metodo Imprimir_lista de la clase operlista mediante el objecto creado op1 
                    System.out.println("los datos de la lista son:");
                    op1.Imprimir_Lista();

                    break;// detener o romper el  la condicion
                case 3:// caso  3 me llama el metodo impare_imprimir de la clase operlista mediante el objecto creado op1 

                    System.out.println("los números impares de la lista son:");

                    op1.impares_impimir();
                    break;// detener o romper el  la condicion
                case 4:// caso  4 me llama el metodo mayo_menor de la clase operlista mediante el objecto creado op1 
                    op1.mayor_menor();
                    break;// detener o romper el  la condicion
                case 5:// caso  5 me llama el metodo eliminar qwue le envio un valor como parametro de la clase operlista mediante el objecto creado op1 
                    op1.eliminar(2);
                    break;// detener o romper el  la condicion
                case 6:// caso  6 me llama el metodo promedio de la clase operlista mediante el objecto creado op1 
                    System.out.println(op1.promedio());
                    break;// detener o romper el  la condicion
                default:
                case 7:// caso  7 me llama el metodo repetir de la clase operlista mediante el objecto creado op1 
                    op1.repetir();
                    break;// detener o romper el  la condicion

                case 8:// caso  8 me llama el metodo lista_primos de la clase operlista mediante el objecto creado op1 
                    System.out.println("los numeros primos de la lista son:");
                    op1.lista_primos();
                    break;// detener o romper el  la condicion
                case 9: // caso  9 sale del sistema
                    System.out.println("saliendo  del sistema");

            }
        } while (opc != 9); // mientra la opcion  se difentere a 9
    }// fin de metodo main  o principal donde llamo todo los subprogramas
}
