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
* La clase Libro sería el Originator del patrón, la cual va a crear mementos
* cada vez que el titulo de un libro cambie.
*/
public class Libro {
    private String titulo;
    
    //Este es el metodo que se encarga de crear un memento y guardando en él, el estado de un Libro.
    public Memento guardarEnMemento(){
        System.out.println("Originator: Guardando Memento...");
        return new Memento(titulo);
    }
    
    //Con este metodo se obtiene el estado que esta contenido dentro del memento que se pasa como parametro.
    public void restaurarDesdeMemento(Memento memento){
         titulo = memento.getTituloGuardado();
         System.out.println("Originator: Libro recuperado desde el memento: "+ titulo);

    }
    
    //Metodo get para obtener el titulo de un libro.
    public String getTitulo(){
        return titulo;
    }
    
    //Metodo set para asignar el titulo de un libro.
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
}
