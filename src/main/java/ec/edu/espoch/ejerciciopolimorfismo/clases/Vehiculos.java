/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.ejerciciopolimorfismo.clases;

/**
 *
 * @author mundo
 */
public abstract class Vehiculos {
    
    public abstract String transportar();
    
    public float calcularDistancia(float velocidad){
        return velocidad*1;
    }
    
    public float calcularDistancia(float velocidad, float Tiempo ){
       return velocidad*Tiempo;
    }
    
    public float calcularDistancia(float velocidad, float Tiempo, float constante ){
       return velocidad*Tiempo*constante;
    }
    
}
