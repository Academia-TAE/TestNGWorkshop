package org.example;

import org.testng.annotations.*;

public class PurchaseProductTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Configurando la suite de pruebas...");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Configurando la clase de prueba para la compra de un producto...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Configurando el escenario para la compra de un producto...");
    }

    @Test
    public void testPurchaseProduct() {
        System.out.println("Paso 1: Seleccionar un producto al azar.");
        System.out.println("Paso 2: Agregar el producto al carrito.");
        System.out.println("Paso 3: Ingresar los datos personales.");
        System.out.println("Paso 4: Verificar que se llega a la página de 'Gracias por su compra'.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Limpiando después de la prueba de compra de un producto...");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Realizando acciones posteriores a la prueba de compra de un producto...");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Realizando acciones posteriores a la suite de pruebas...");
    }
}
