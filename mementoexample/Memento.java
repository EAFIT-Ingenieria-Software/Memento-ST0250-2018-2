/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementoexample;

/**
 * @author Jhon Rodriguez
 * @author Alejandro Roman
 * @author Santiago Castrillon
 */

/*
* Esta es la clase donde se contruyen instancias de mementos cada vez
* que la clase Libro necesita guardar el estado anterior de un objeto Libro.
*/
public class Memento {
    private String titulo;
    
    //Constructor para crear el memento dado el titulo de un libro.
    public Memento(String titulo){
        this.titulo = titulo;
    
    }
    
    //Este metodo retorna el estado que se le ha asignado al memento creado desde un objeto Libro.
    public String getTituloGuardado(){
        return titulo;
    }
}
