/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.ejerciciopolimorfismo;

import ec.edu.espoch.ejerciciopolimorfismo.clases.Avion;
import ec.edu.espoch.ejerciciopolimorfismo.clases.Carros;
import ec.edu.espoch.ejerciciopolimorfismo.clases.Motos;
import ec.edu.espoch.ejerciciopolimorfismo.clases.Vehiculos;

/**
 *
 * @author mundo
 */
public class EjercicioPolimorfismo {

    public static void main(String[] args) {
        Vehiculos carro = new Carros();
        Vehiculos moto = new Motos();
        Vehiculos avion = new Avion();
        
        System.out.println("Calculo de distancia para un carro: ");
        System.out.println("Distancia (Solo velocidad): "+carro.calcularDistancia(150.5f));
        System.out.println("Distancia (Velocidad y tiempo): "+carro.calcularDistancia(150.5f,    1.30f));
        System.out.println("Distancia (con eficiencia): "+carro.calcularDistancia(150.5f, 1.30f, 0.8f));
        
        System.out.println("Metodos Polimorfismo dinamico:");
        
        Vehiculos[] vehiculos = {carro,moto,avion};
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i].transportar());
        }
    }
}
