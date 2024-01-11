package Practica;

import java.util.Scanner;

public class Practica3 {
    /**
     * Clase que representa un vehículo.
     */

    float precioInferior = 100;

    public static void PrecioSumar(Vehiculo vehiculo, float porcentaje) {
    }

    public static class Vehiculo {
        String marca, modelo, matricula;
        int fecha;
        float precio;

        /**
         * Constructor de la clase Vehiculo.
         * @param f 
         * @param i 
         * @param string3 
         * @param string2 
         * @param string 
         */
        Vehiculo(String string, String string2, String string3, int i, float f) {
            // Constructor privado para evitar instanciación directa
        }
    }

    /**
     * Lee datos de un vehículo desde la entrada estándar.
     *
     * @param v El objeto Vehiculo en el que se almacenarán los datos.
     */
    public static void leerDatos(Vehiculo v) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Introduce la marca del vehículo:");
            v.marca = scanner.nextLine().trim();
        } while (v.marca.length() < 3 || v.marca.length() > 20);

        do {
            System.out.println("Introduce el modelo del vehículo:");
            v.modelo = scanner.nextLine().trim();
        } while (v.modelo.length() < 1 || v.modelo.length() > 30);

        do {
            System.out.println("Introduce la matrícula del vehículo:");
            v.matricula = scanner.nextLine().trim();
        } while (v.matricula.length() != 6);

        System.out.println("Introduce el año de fabricación del coche:");
        v.fecha = scanner.nextInt();

        do {
            System.out.println("Introduce el precio del coche:");
            v.precio = scanner.nextFloat();
        } while (v.precio <= 0);
    }

    /**
     * Muestra los datos de un vehículo en la pantalla.
     *
     * @param v El objeto Vehiculo cuyos datos se mostrarán.
     */
    public static void muestraVehiculoPantalla(Vehiculo v) {
        System.out.println(v.marca + " " + v.modelo + " " + v.matricula + " " + v.fecha + " " + v.precio);
    }

    /**
     * Encuentra el índice del vehículo con el precio más alto.
     *
     * @param v El array de Vehiculos.
     * @param n El número de vehículos en el array.
     * @return El índice del vehículo con el precio más alto.
     */
    public static int mayor(Vehiculo[] v, int n) {
        float maxPrecio = v[0].precio;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (v[i].precio > maxPrecio) {
                maxPrecio = v[i].precio;
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    /**
     * Cuenta el número de vehículos con precios en un rango dado.
     *
     * @param v              El array de Vehiculos.
     * @param n              El número de vehículos en el array.
     * @param precioInferior El precio inferior del rango.
     * @param precioSuperior El precio superior del rango.
     * @return El número de vehículos en el rango de precios.
     * @throws IllegalArgumentException Si los precios son incorrectos.
     */
    public static int numVehiculosEnPrecio(Vehiculo[] v, int n, float precioInferior, float precioSuperior) {
        int numeroVehiculos = 0;

        for (int i = 0; i < n; i++) {
            if (v[i].precio > precioInferior && v[i].precio < precioSuperior) {
                numeroVehiculos++;
            }
        }

       

        return numeroVehiculos;
    }


    /**
     * Incrementa el precio de un vehículo en un porcentaje dado.
     *
     * @param v          El objeto Vehiculo cuyo precio se incrementará.
     * @param d El porcentaje de incremento.
     */
    public static void precioSumar(Vehiculo v, double d) {
        v.precio += v.precio * d;
    }

}






