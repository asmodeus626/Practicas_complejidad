/*
 * Clase que va a representar un tour, es decir, una permutación de las ciudades.
 */
package genetico;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author emmanuel
 */
public class Tour {
    LinkedList<Integer> ciudades;
    
    public Tour(){
        ciudades = new LinkedList();
    }
    
    /**
     * Función que genera un tour aleatorio
     * @param tam tamaño del tour a generar
     */
    public void genTourAl(int tam){
        LinkedList<Integer> numeros = new LinkedList(); //Lista de la cual se va a sacar el tour.
        Random r = new Random();
        
        for(int i=0;i<tam;i++){
            numeros.add(i);
        }
        
        //En esta parte sacamos un elemento al azar de la lista de números y lo agregamos a ciudades.
        for(int i=0;i<tam;i++){
            Integer temp = numeros.remove(r.nextInt(numeros.size()));
            ciudades.add(temp);
        }
    }
    
    public static void main(String[] args){
        Tour t1 = new Tour();
        t1.genTourAl(51);
        
        System.out.println(t1.ciudades);
    }
}
