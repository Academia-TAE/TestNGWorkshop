package org.example;

import java.util.logging.Logger;
import java.util.logging.Level;

import org.testng.annotations.*;

public class RemoveFromCartTest {
    private static final Logger logger = Logger.getLogger(RemoveFromCartTest.class.getName());

    @BeforeSuite
    public void setup() {
        logger.log(Level.INFO, "Configurando la suite de pruebas...");
    }

    @BeforeClass
    public void beforeClass() {
        logger.log(Level.INFO, "Configurando la clase de prueba para eliminar elementos del carrito...");
    }

    @BeforeMethod
    public void beforeTest() {
        logger.log(Level.INFO, "Configurando el escenario para eliminar elementos del carrito...");
    }

    @Test
    public void testRemoveFromCart() {
        logger.log(Level.INFO, "Paso 1: Agregar 3 elementos diferentes al carrito de compras.");
        logger.log(Level.INFO, "Paso 2: Ir a la página del carrito.");
        logger.log(Level.INFO, "Paso 3: Eliminar los elementos del carrito.");
        logger.log(Level.INFO, "Paso 4: Verificar que el carrito de compras esté vacío.");
    }

    @AfterMethod
    public void afterTest() {
        logger.log(Level.INFO, "Limpiando después de la prueba de eliminar elementos del carrito...");
    }

    @AfterClass
    public void teardown() {
        logger.log(Level.INFO, "Realizando acciones posteriores a la prueba de eliminar elementos del carrito...");
    }

    @AfterSuite
    public void afterSuite() {
        logger.log(Level.INFO, "Realizando acciones posteriores a la suite de pruebas...");
    }
}
