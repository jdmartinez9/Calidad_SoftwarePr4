package Practica;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        final int MAX_VEHICULOS = 100;
        Practica3.Vehiculo[] v = new Practica3.Vehiculo[MAX_VEHICULOS];

        int n;
        int posicion;
        float precioInferior = 100 ;
        float precioSuperior = 500 ;
        float porcentaje = 0;

        

        System.out.println("hola " );


        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Introduce el número de vehículos que hay. El máximo es: " + MAX_VEHICULOS);
            n = scanner.nextInt();
        } while (n <= 0 || n > MAX_VEHICULOS);

       for (int i = 0; i < n; i++) {
            Practica3.leerDatos(v[i]);
        }

        System.out.println("Los datos de los vehículos son:");
        for (int i = 0; i < n; i++) {
            Practica3.muestraVehiculoPantalla(v[i]);
        }

        posicion = Practica3.mayor(v, n);
        System.out.println("El coche que cuesta más es " + v[posicion].modelo);

        try {
            System.out.println("El número de vehículos que están en ese intervalo es " + Practica3.numVehiculosEnPrecio(v, n, precioInferior, precioSuperior));
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }

        try {
            System.out.println("Introduce un porcentaje entre 0 y 5");
            porcentaje = scanner.nextFloat();
            if (porcentaje < 0 || porcentaje > 5) {
                throw new IllegalArgumentException("El precio no está entre 0 y 5");
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }

        for (int i = 0; i < n; i++) {
            Practica3.PrecioSumar(v[i], porcentaje);
            System.out.println("Los precios incrementados son " + v[i].precio);
        }
    }
}
