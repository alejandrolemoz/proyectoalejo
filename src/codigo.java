//  Desarrollo por el Ing. alejandro lemos gomez  con la cedula 1037975649. 
// Este Programa esta implementado En Poo

import java.util.Scanner;
// Esta libreria sirve para leer por consola un dato
import javax.swing.JOptionPane; // liberia para  poder usar cuadro de dialogos 

/**
 *
 * @author alejandro
 */
public class codigo {  //esta clase  es la clase dondo hacemos todas las operaciones con la lista

    private Nodo cabeza = null;

    /**
     *
     */
    public void Crear_Lista() {// 1. crear lista de n nodos
        Scanner sc = new Scanner(System.in); //creamos un variable de tipo scanner
        String p; // creamos  una variable p de tipo cadena
        String R;// creamos  una variable p de tipo cadena

        Nodo ult = null; // el nodo de la lista comienza en nulo por que no esta apuntado a nada
        p = JOptionPane.showInputDialog("Desea crea un nuevo nodo  en la lista (S/N)"); // guardando el mensaje en la variable de tipo cadena
        R = (p);// capturamos en la variable R  la variable p
        while (R.equalsIgnoreCase("s")) { //  se evalua la respues en un ciclo mientras sea s
            Nodo n = new Nodo(); // si respuesta e igual  a S reservamos un espasi en memoria para un nuevo nodo
            if (n == null) { // evalua el nodo si es ugual a null  entra
                System.out.println("No Hay Espacio en Memoria");// saca este mensaje

            } else { // sino es verdadero
                p = JOptionPane.showInputDialog("Ingrese Valor al Nodo:"); // saca el mensaje por medio de un panel
                n.dato = Integer.parseInt(p); // capturar el mensaje
                if (cabeza == null) { // validamos si  la lista esta vacia
                    cabeza = n; // si la lista esta vacia asignale el nuevo nodo n.
                } else {
                    ult.liga = n; // sino significa que  hay al menos un nodo
                }
                ult = n; // utimo asignemele n
                p = JOptionPane.showInputDialog("Desea crea un nuevo nodo  en la lista (S/N)");// saca el mensaje en un panel
                R = (p);// capturamos en la variable R  la variable p
            }

        }

    } // finalizamos el metodo crear lista

    /**
     *
     */
    public void Imprimir_Lista() { // insertar valores a la lista
        Nodo p = cabeza; // de tipo  de  la clase Nodo la variable p la igualamos a la cabeza

        if (p == null) { // validamos que la lista esta vacia o no esta vacia
            System.out.println("la lista esta vacia"); // muestra el mensaje por consola
        } else {
            while (p != null) { // sino al menos hay un nodo entonces me recorre con un mientras

                System.out.print(p.getDato() + "->"); // imprime cada nodo
                p = p.getLiga(); // que p avance
            }

        }
        System.out.println("null"); // cuando  termina toda la lista
    }

    /**
     *
     */
    public void impares_impimir() { //  2. imprime los numeros impares de la lista

        Nodo p = cabeza; // de tipo  de  la clase Nodo la variable p la igualamos a la cabeza
        int cont = 0; // cont inicializa en cero
        while (p != null) {// si p es diferente a nulo que me recorra
            if (p.dato % 2 != 0) { // evalua cada  posicion en la lista que si son impares  o no
                System.out.println(p.getDato()); // imprime por consola el dato
            }

            p = p.getLiga();// que p avance
        }

    }

    /**
     *
     */
    public void mayor_menor() { //4. determina el mayor y el menor  valor de la lista

        Nodo p = cabeza;// de tipo  de  la clase Nodo la variable p la igualamos a la cabeza
        int mayor = 0; // mayor inicializa en cero guarda los mayores de la lista
        int menor = 0;//menor inicializa en cero guarda los menores de la lista
        boolean primer = true; //  una variable  que evalua si es mayo o menor

        while (p != null) { // si la lista no esta vacia recorremela con p
            if (primer == true) { // evalua e primer nodo
                mayor = p.getDato();// aga mayor el primer dato
                primer = false; // el primero no es mayor

            } else {
                if (mayor < p.getDato()) { //compara con los demas datos de la lista
                    mayor = p.getDato(); // y mayor lo hace igual al nodo

                } else {
                    menor = p.getDato(); // sino ese dato es el menor

                }
                p = p.getLiga(); // p avance en la lista
            }
        }
        JOptionPane.showMessageDialog(null, "El mayor es " + mayor + "el menor es:" + menor); //saca lista en un panel
    } // finalizo el metodo mayor_menor

    /**
     *
     */
    public void repetir() { // 8.imprimir los valores que mas se repiten en la lista

        Nodo p = cabeza;// de tipo  de  la clase Nodo la variable p la igualamos a la cabeza
        Nodo auxiliar = p.liga;// de tipo  de  la clase Nodo la variable auxiliar y la inicilizamos co el sugundo datos para comparar
        int cntr = 0; // de tipo entero la  la  variable cntr que me va a decir cuantos repetidos hoay en la lista

        while (p == p.liga) { // estamos comparando  el primer nodo con los demas
            if (p == p.liga) { // compara cada dato con el auxiliar
                cntr++; // incremeta el contador cada vez que hay uno repetido
            }
            auxiliar = auxiliar.getLiga(); // auxiliar se mueve de posicion
            p = p.getLiga();// p se mueve de posicion
        }

        cntr = p.dato;// el dato que mas se repitio en la lista

        System.out.println("el valor que mas se repite en la  lista es:" + cntr);// me imprime el dato mas repetido

    }

    /**
     *
     * @param valor
     */
    public void eliminar(int valor) { // 9.eliminar un  valor de terminado de la lista en este caso seria numero 2 ya 
        // que lo resivimos por parametro
        Nodo ant = cabeza; // de tipo  de  la clase Nodo la variable ant la igualamos a la cabeza
        Nodo p = cabeza;// de tipo  de  la clase Nodo la variable p la igualamos a la cabeza
        Nodo aux; // de tipo de la clase nodo la variable aux para guardar el valor
        if (p == null) { // si es igual a nulo
            JOptionPane.showMessageDialog(null, "lista vacia");// saca el mensaje

        } else {
            if (cabeza.getDato() == valor) { //si no empieza a evaluar cada dato
                aux = p;//  a aux  llevele p
                cabeza = cabeza.liga;// la cabeza se mueve
                p.liga = null; // a la liga del nodo agamela null
            } else {

                while (p != null && valor != p.getDato()) { // evalua que p sea diferente de nulo y el valor a  eliminar sea diferente a datos
                    ant = p; //aga anterion  igual a p para que  ant tenga una direccion

                    p = p.getLiga();// p se mueva al siguinte nodo
                }
            }
            if (p == null) { // evalua que el dato este
                JOptionPane.showMessageDialog(null, "el valor no exixte"); // y me imprime esto en una ventana

            } else {
                ant.liga = p.getLiga(); // sino anterio muevase
                p = null; // y p  agamelo nulo

            }

            Imprimir_Lista(); // aca llamamos al metodo imprimir lista para conprovar que si elimino
        }
    }

    double promedio() { //3. calcular el promedio de los valores de la lista
        Nodo p = cabeza;// de tipo  de  la clase Nodo la variable p la igualamos a la cabeza
        int sum = 0;//  de tipo entero la  variable sum que necesitamos para que me guarde el total de suma de datos en la lista
        float prom = 0;// de tipo flotante la variable prom donde va a guadar el promedi de la lista
        int contn = 0; // de tipo entero una variable cntn que va a contar el numero de nodo ya que se necesita para el promedio
        while (p != null) { // evalua  mientra es diferente de nulo recorra

            sum = (p.getDato() + sum); // sum es igual a la suma de cada dato de la lista
            contn = contn + 1;
            p = p.getLiga(); // p avanza al siguiente nodo
        }

        prom = sum / contn; // prom va  hacer igual ala suma  de los nosdos sobre el numero de nodo que hayan en la lista
        System.out.println("el promedio es:" + prom); // me imprime el promedio
        return prom; // retorna el promedio

    }

    void numer_primo(int num) {//para  saber los numeros primos
        int cont = 0; // cantidad de numeros que  al dividir da  0
        for (int i = num; i >= 1; i--) // 
        {

            if (num % i == 0) {
                cont++;
            }

        }
        if (cont <= 2) { //  es  la cantidad de numeros  que al sacar el valor al modo da cero
            System.out.print(num);//imprime la variable que tiene guardado numero primo
        }

    }

    void lista_primos() {
        Nodo p = cabeza;
        while (p != null) {
            numer_primo(p.dato);
            p = p.getLiga();
        }

    }
}
