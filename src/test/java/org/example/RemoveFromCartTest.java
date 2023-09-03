package org.example;

import org.testng.annotations.*;

public class RemoveFromCartTest {
    @BeforeSuite
    public void setup() {
        System.out.println("Configurando la suite de pruebas...");

    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Configurando la clase de prueba para eliminar elementos del carrito...");
    }

    @BeforeMethod
    public void beforeTest() {
        System.out.println("Configurando el escenario para eliminar elementos del carrito...");
    }

    @Test
    public void testRemoveFromCart() {
        System.out.println("Paso 1: Agregar 3 elementos diferentes al carrito de compras.");
        System.out.println("Paso 2: Ir a la página del carrito.");
        System.out.println("Paso 3: Eliminar los elementos del carrito.");
        System.out.println("Paso 4: Verificar que el carrito de compras esté vacío.");
    }


    @AfterMethod
    public void afterTest() {
        System.out.println("Limpiando después de la prueba de eliminar elementos del carrito...");
    }

    @AfterClass
    public void teardown() {
        System.out.println("Realizando acciones posteriores a la prueba de eliminar elementos del carrito...");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Realizando acciones posteriores a la suite de pruebas...");
    }
}
