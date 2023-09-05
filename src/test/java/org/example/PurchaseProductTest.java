package org.example;

import java.util.logging.Logger;
import java.util.logging.Level;

import org.testng.annotations.*;

public class PurchaseProductTest {
    private static final Logger logger = Logger.getLogger(PurchaseProductTest.class.getName());

    @BeforeSuite
    public void beforeSuite() {
        logger.log(Level.INFO, "Configurando la suite de pruebas...");
    }

    @BeforeClass
    public void beforeClass() {
        logger.log(Level.INFO, "Configurando la clase de prueba para la compra de un producto...");
    }

    @BeforeMethod
    public void beforeMethod() {
        logger.log(Level.INFO, "Configurando el escenario para la compra de un producto...");
    }

    @Test
    public void testPurchaseProduct() {
        logger.log(Level.INFO, "Paso 1: Seleccionar un producto al azar.");
        logger.log(Level.INFO, "Paso 2: Agregar el producto al carrito.");
        logger.log(Level.INFO, "Paso 3: Ingresar los datos personales.");
        logger.log(Level.INFO, "Paso 4: Verificar que se llega a la página de 'Gracias por su compra'.");
    }

    @AfterMethod
    public void afterMethod() {
        logger.log(Level.INFO, "Limpiando después de la prueba de compra de un producto...");
    }

    @AfterClass
    public void afterClass() {
        logger.log(Level.INFO, "Realizando acciones posteriores a la prueba de compra de un producto...");
    }

    @AfterSuite
    public void afterSuite() {
        logger.log(Level.INFO, "Realizando acciones posteriores a la suite de pruebas...");
    }
}
