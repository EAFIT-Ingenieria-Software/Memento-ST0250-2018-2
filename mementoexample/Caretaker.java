/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementoexample;

/**
 *
 * @author Jhon Rodriguez
 * @author Alejandro Roman
 * @author Santiago Castrillon
 *
 */
//Importamos la libreria ArrayList de Java.
import java.util.ArrayList;

/*
*Esta va a ser la clase encargada de almacenar y preservar los
*mementos creados por la clase Libro.
*/
public class Caretaker{
    
    //Se crea la lista de tipo Memento para guardar objetos de este tipo
    private ArrayList<Memento> estados =  new ArrayList<Memento>();

    //Este metodo se encarga de agregar un memento a la lista de mementos.
    public void addMemento(Memento memento){
        estados.add(memento);
    }

    //Devuelve un objeto memento que esta en la posición index de la lista.
    public Memento getMemento(int index){
        return estados.get(index);
    }

}