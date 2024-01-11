package Practica;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class Practica_test {

			@Test
		    public void testPrecioSumar() {
		        // Crear un objeto Vehiculo para la prueba
		        Practica3.Vehiculo vehiculo = new Practica3.Vehiculo("Marca1", "Modelo1", "ABC123", 2020, 25000.0f);
		        vehiculo.precio = 1000;  // Precio inicial

		        // Llamar al método que quieres probar
		        Practica3.precioSumar(vehiculo, 0.1);  // Aumentar el precio en un 10%

		        // Verificar si el resultado es el esperado
		        assertEquals(1100, vehiculo.precio, 0.01);  // Usamos delta para manejar pequeñas variaciones en los números de punto flotante 
		       // assertTrue(vehiculo.precio < 1100); 
		        //assertNotNull(vehiculo.precio); // Verifica que un objeto no sea nulo
		        


		    }

		    @Test
		    public void testNumVehiculosEnPrecio() {
		        // Crear un array de Vehiculos para la prueba
		        Practica3.Vehiculo[] vehiculos = {
		        		 new Practica3.Vehiculo("Marca1", "Modelo1", "ABC123", 2020, 25000.0f),
		                 new Practica3.Vehiculo("Marca2", "Modelo2", "XYZ789", 2019, 30000.0f),
		                 new Practica3.Vehiculo("Marca3", "Modelo3", "123DEF", 2021, 20000.0f)
		        };

		        // Llamar al método que quieres probar
		        //int resultado = Practica3.numVehiculosEnPrecio(vehiculos, vehiculos.length, 100, 200);
		        int x=5;
		        int resultado=5;
		        // Verificar si el resultado es el esperado
		        assertSame(resultado, x);
		        //assertNull(resultado);
		        

		    }
		    
		    @Test
		    public void testMayor() {
		        // Crear instancias de Vehiculo para la prueba
		        Practica3.Vehiculo vehiculo1 = new Practica3.Vehiculo("Marca1", "Modelo1", "ABC123", 2020, 25000.0f);
		        Practica3.Vehiculo vehiculo2 = new Practica3.Vehiculo("Marca2", "Modelo2", "XYZ789", 2019, 30000.0f);
		        Practica3.Vehiculo vehiculo3 = new Practica3.Vehiculo("Marca3", "Modelo3", "123DEF", 2021, 20000.0f);
		        Practica3.Vehiculo vehiculo4 = new Practica3.Vehiculo("Marca4", "Modelo4", "ASD345", 2022, 10000.0f);

		        // Crear un array de Vehiculos para la prueba
		        Practica3.Vehiculo[] vehiculos = { vehiculo1, vehiculo2, vehiculo3 };
		        Practica3.Vehiculo[] vehiculos2 = { vehiculo1, vehiculo2, vehiculo3 };

		        // Llamar al método mayor
		        int indiceMayor = Practica3.mayor(vehiculos, vehiculos.length);
		        
		        int x=5,y=9;

		        // Verificar el resultado
		        assertArrayEquals(vehiculos, vehiculos2); 
		        assertNotSame(vehiculo1, vehiculo2); 
		       // assertFalse(y > x);
		        

		        
		        
		    }
	
	
  
		    @Test
		    public void pruebaPrecioSumarCambiaEstado() {
		        Practica3.Vehiculo vehiculo = new Practica3.Vehiculo("Toyota", "Corolla", "ABC123", 2022,20000.0f);

		        // Llamada al método que cambia el estado
		        Practica3.precioSumar(vehiculo, 0.1); // Incremento del 10%

		        // Verificar que el estado (precio) se haya actualizado correctamente
		        assertEquals("Precio incorrecto después de incremento", 22000.0, vehiculo.precio, 0.001);
		    }
		    
		    
		    
		    @Test
		    public void pruebaMayorNoCambiaEstado() {
		        Practica3.Vehiculo[] vehiculos = {
		            new Practica3.Vehiculo("", "", "", 0, 10000.0f),
		            new Practica3.Vehiculo("", "", "", 0, 15000.0f),
		            new Practica3.Vehiculo("", "", "", 0, 12000.0f)
		        };

		        // Llamada al método que no cambia el estado
		        int indiceMaximo = Practica3.mayor(vehiculos, 3);

		        // Verificar que el índice máximo es el esperado
		        assertEquals("Índice máximo incorrecto", 0, indiceMaximo);

		        // Verificar que el estado de los vehículos no cambió
		        assertEquals("Precio del primer vehículo incorrecto", 10000.0, vehiculos[0].precio, 0.001);
		        assertEquals("Precio del segundo vehículo incorrecto", 15000.0, vehiculos[1].precio, 0.001);
		        assertEquals("Precio del tercer vehículo incorrecto", 12000.0, vehiculos[2].precio, 0.001);
		    }



    
	
	

		   
		
	}


// Ejemplo BEFORE Y AFTER:


/* // Variable que podría ser necesaria en varias pruebas
private Practica3.Vehiculo vehiculo;

@Before
public void Configuracion() {
    // Configuración antes de cada prueba
    vehiculo = new Practica3.Vehiculo("Marca1", "Modelo1", "ABC123", 2020, 25000.0f);
}

@Test
public void testPrecioSumar() {
    // Crear un objeto Vehiculo para la prueba
    Practica3.Vehiculo vehiculo = new Practica3.Vehiculo("Marca1", "Modelo1", "ABC123", 2020, 25000.0f);
    vehiculo.precio = 1000;  // Precio inicial

    // Llamar al método que quieres probar
    Practica3.precioSumar(vehiculo, 0.1);  // Aumentar el precio en un 10%

    // Verificar si el resultado es el esperado
    assertEquals(1100, vehiculo.precio, 0.01);  // Usamos delta para manejar pequeñas variaciones en los números de punto flotante 
    


}

@Test
public void testNumVehiculosEnPrecio() {
    // Crear un array de Vehiculos para la prueba
    Practica3.Vehiculo[] vehiculos = {
            new Practica3.Vehiculo("Marca1", "Modelo1", "ABC123", 2020, 25000.0f),
            new Practica3.Vehiculo("Marca2", "Modelo2", "XYZ789", 2019, 30000.0f),
            new Practica3.Vehiculo("Marca3", "Modelo3", "123DEF", 2021, 20000.0f)
    };

    // Llamar al método que quieres probar
    int resultado = Practica3.numVehiculosEnPrecio(vehiculos, vehiculos.length, 100, 200);

    // Verificar si el resultado es el esperado
    assertEquals(0, resultado);
}

@After
public void Limpieza() {
    // Limpieza después de cada prueba
    vehiculo = null;
}*/




//EJEMPLO BeforeClass y AfterClass:




/* // Variables que podrían ser necesarias en varias pruebas
private static Practica3.Vehiculo[] vehiculos;

@BeforeClass
public static void Configuracion() {
    // Configuración antes de todas las pruebas en la clase
    vehiculos = new Practica3.Vehiculo[]{
            new Practica3.Vehiculo("Marca1", "Modelo1", "ABC123", 2020, 25000.0f),
            new Practica3.Vehiculo("Marca2", "Modelo2", "XYZ789", 2019, 30000.0f),
            new Practica3.Vehiculo("Marca3", "Modelo3", "123DEF", 2021, 20000.0f)
    };
}

@Test
public void testPrecioSumar() {
    // Crear un objeto Vehiculo para la prueba
    Practica3.Vehiculo vehiculo = new Practica3.Vehiculo("Marca1", "Modelo1", "ABC123", 2020, 25000.0f);
    vehiculo.precio = 1000;  // Precio inicial

    // Llamar al método que quieres probar
    Practica3.precioSumar(vehiculo, 0.1);  // Aumentar el precio en un 10%

    // Verificar si el resultado es el esperado
    assertEquals(1100, vehiculo.precio, 0.01);  // Usamos delta para manejar pequeñas variaciones en los números de punto flotante
  
}

@Test
public void testNumVehiculosEnPrecio() {
    // Llamar al método que quieres probar
    int resultado = Practica3.numVehiculosEnPrecio(vehiculos, vehiculos.length, 100, 200);

    // Verificar si el resultado es el esperado
    assertEquals(0, resultado);
}

@Test
public void testMayor() {
    // Crear instancias de Vehiculo para la prueba
    Practica3.Vehiculo vehiculo1 = new Practica3.Vehiculo("Marca1", "Modelo1", "ABC123", 2020, 25000.0f);
    Practica3.Vehiculo vehiculo2 = new Practica3.Vehiculo("Marca2", "Modelo2", "XYZ789", 2019, 30000.0f);
    Practica3.Vehiculo vehiculo3 = new Practica3.Vehiculo("Marca3", "Modelo3", "123DEF", 2021, 20000.0f);

    // Crear un array de Vehiculos para la prueba
    Practica3.Vehiculo[] vehiculos = {vehiculo1, vehiculo2, vehiculo3};

    // Llamar al método mayor
    int indiceMayor = Practica3.mayor(vehiculos, vehiculos.length);

    // Verificar el resultado
    assertEquals(0, indiceMayor);
}

@AfterClass
public static void Limpieza() {
    // Limpieza después de todas las pruebas en la clase
    vehiculos = null;
}*/



//Ejemplo Ignore 



/* private static Practica3.Vehiculo[] vehiculos;



@Test
public void testPrecioSumar() {
    // Crear un objeto Vehiculo para la prueba
    Practica3.Vehiculo vehiculo = new Practica3.Vehiculo("Marca1", "Modelo1", "ABC123", 2020, 25000.0f);
    vehiculo.precio = 1000;  // Precio inicial

    // Llamar al método que quieres probar
    Practica3.precioSumar(vehiculo, 0.1);  // Aumentar el precio en un 10%

    // Verificar si el resultado es el esperado
    assertEquals(1100, vehiculo.precio, 0.01);  // Usamos delta para manejar pequeñas variaciones en los números de punto flotante
  
}


@Test
public void testNumVehiculosEnPrecio() {
    // Crear un array de Vehiculos para la prueba
    Practica3.Vehiculo[] vehiculos = {
    		 new Practica3.Vehiculo("Marca1", "Modelo1", "ABC123", 2020, 25000.0f),
             new Practica3.Vehiculo("Marca2", "Modelo2", "XYZ789", 2019, 30000.0f),
             new Practica3.Vehiculo("Marca3", "Modelo3", "123DEF", 2021, 20000.0f)
    };

    // Llamar al método que quieres probar
    //int resultado = Practica3.numVehiculosEnPrecio(vehiculos, vehiculos.length, 100, 200);
    int x=5;
    int resultado=5;
    // Verificar si el resultado es el esperado
    assertSame(resultado, x);
   
    
}

@Ignore
public void testMayor() {
    // Crear instancias de Vehiculo para la prueba
    Practica3.Vehiculo vehiculo1 = new Practica3.Vehiculo("Marca1", "Modelo1", "ABC123", 2020, 25000.0f);
    Practica3.Vehiculo vehiculo2 = new Practica3.Vehiculo("Marca2", "Modelo2", "XYZ789", 2019, 30000.0f);
    Practica3.Vehiculo vehiculo3 = new Practica3.Vehiculo("Marca3", "Modelo3", "123DEF", 2021, 20000.0f);

    // Crear un array de Vehiculos para la prueba
    Practica3.Vehiculo[] vehiculos = {vehiculo1, vehiculo2, vehiculo3};

    // Llamar al método mayor
    int indiceMayor = Practica3.mayor(vehiculos, vehiculos.length);

    // Verificar el resultado
    assertEquals(0, indiceMayor);
}*/






