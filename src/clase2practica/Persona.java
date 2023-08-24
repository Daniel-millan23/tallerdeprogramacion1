/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2practica;

/**
 *
 * @author pmora
 */
public class Persona {
    public String nombre;
    public int edad;
    public int altura;

    public void MostrarNombre(){
    System.out.println("Mi nombre es:" + this.nombre);
    }

    public int MostrarAltura(){
    return this.altura;
    }

    public void ValidarEdad(int edadValidar){
        if(edadValidar >= 18){
            System.out.println("Es Mayor de edad");
        }else{
            System.out.println("No es Mayor de edad");
        }
    }
    
}
