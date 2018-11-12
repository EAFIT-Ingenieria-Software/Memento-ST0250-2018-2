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

/*
* Este código muestra una fácil aplicación del patrón memento,
* en donde un objeto libro de la clase Libro creara mementos para guardar el titulo de un libro
* cada vez que ocurra un cambio en él. El mismo objeto podrá recuperar cualquier memento que se haya
* creado previamente y devolviendo el estado del libro a un estado anterior.
*/
public class MementoExample {
   /*
    *Metodo main donde se crean instancias de las clases Caretaker y Libro, para luego operar
    *con los mementos. 
    */
   public static void main(String[] args) {
       
        Caretaker caretaker = new Caretaker();//Se crea una instancia de Caretaker
        Libro libro = new Libro();  //Se crea una instancia de Libro, la cual será el generador de mementos.
        libro.setTitulo("The contract"); //Modificación del titulo de libro
        libro.setTitulo("El contrato"); //Otra modificación al estado de libro
        caretaker.addMemento(libro.guardarEnMemento()); //Se crea un memento para guardar el titulo y se agrega el memento a la lista
        libro.setTitulo("El contrato 2");//Se vuelve a modificar el titulo del libro.
        caretaker.addMemento(libro.guardarEnMemento()); //Se crea un nuevo memento para esta vez guardar el nuevo titulo creado.
        libro.setTitulo("El contrato: Sello final"); 
        caretaker.addMemento(libro.guardarEnMemento());
        
        libro.restaurarDesdeMemento(caretaker.getMemento(1) ); //El objeto libro modifica el titulo con el titulo que se guardo
                                                               // en el memento número 1.  
                                                               
     }
}
