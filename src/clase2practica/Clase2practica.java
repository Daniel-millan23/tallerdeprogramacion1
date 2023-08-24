/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2practica;

/**
 *
 * @author pmora
 */
public class Clase2practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  /** Persona persona1 = new Persona(); 
    Persona persona2 = new Persona();
    persona1.nombre = "Roberto";
    persona2.nombre = "Juan";
    persona1.MostrarNombre();
    persona2.MostrarNombre();
    persona1.ValidarEdad(22); */

    Cuenta cuentaNueva = new Cuenta();
    cuentaNueva.setCuenta("1234");
    String numeroCuenta = cuentaNueva.getCuenta();
    System.out.println("El numero de cuenta es: " + numeroCuenta);
    }
    
}
