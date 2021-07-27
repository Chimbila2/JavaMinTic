/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinta;

/**
 *
 * @author leobusta
 */
public class Perro {
    // Atributos

    public int edad;
    public String nombre;
    public String colorOjos;
// Constructor

    public Perro(int edad, String nombre, String colorOjos) {
        this.edad = edad;
        this.nombre = nombre;
        this.colorOjos = colorOjos;
    }
// Métodos
    public void ladrar() {
        System.out.println("Guau Guau");
    }

    public void saludar(boolean ladre) {
        System.out.println("Hola, mi nombre es " + this.nombre);
        if(ladre)
            this.ladrar();
    }
    public void quienEsMayor(Perro otroPerro) {
        if(this.edad > otroPerro.edad){
            System.out.println(otroPerro.nombre +" es menor que yo");
        } else  if(this.edad < otroPerro.edad){
            System.out.println(otroPerro.nombre +" es mayor que yo");
        } else 
            System.out.println(otroPerro.nombre +" tiene la misma edad que yo");
    }    
}
