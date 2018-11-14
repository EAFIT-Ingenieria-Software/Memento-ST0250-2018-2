# Patrón de Diseño Memento
Santiago Castrillon Galvis <br/>
Jhon Edinson Rodriguez <br/>
Jose Alejandro Roman <br/>


## 1. Explicación de la problemática



## 2. Modelo de clases
![diagrama de clases](https://user-images.githubusercontent.com/33042735/48372654-42c84b00-e68d-11e8-808a-8df41917d02d.jpeg)

## 3. Lenguaje de Programación
Java

## 4. Descripción del código
La clase originadora es en este nuestra clase Libro y esta define el estado de todos los objetos libros que sean instanciados de allí. Libro depende de la clase Memento ya que utiliza los metodos de esta ultima, con la clase Memento se generan los mementos que guardan el estado de un libro cada vez se necesite. Por ultimo tenemos la clase Caretaker que tiene una relación de agregación con Memento ya que posee una lista de mementos en donde se guardan estos mementos cuando son generados, tiene los metodos de agregar a la lista y de retornar un memento de una posición de la lista para cuando un objeto libro quiera retornar su estado a uno anterior.

## 5. Referencias Bibliográficas
http://migranitodejava.blogspot.com/2011/06/memento.html
