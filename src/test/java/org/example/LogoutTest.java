package org.example;

import java.util.logging.Logger;
import java.util.logging.Level;

import org.testng.annotations.*;

public class LogoutTest {
    private static final Logger logger = Logger.getLogger(LogoutTest.class.getName());

    @BeforeSuite
    public void beforeSuite() {
        logger.log(Level.INFO, "Configurando la suite de pruebas...");
    }

    @BeforeClass
    public void beforeClass() {
        logger.log(Level.INFO, "Configurando la clase de prueba para cerrar sesión...");
    }

    @BeforeMethod
    public void beforeMethod() {
        logger.log(Level.INFO, "Configurando el escenario para cerrar sesión...");
    }

    @Test
    public void afterLogOut() {
        logger.log(Level.INFO, "Paso 1: Intentar cerrar sesión.");
        logger.log(Level.INFO, "Paso 2: Verificar que se redirige correctamente a la página de inicio de sesión.");
    }

    @AfterMethod
    public void afterMethod() {
        logger.log(Level.INFO, "Limpiando después de la prueba de cerrar sesión...");
    }

    @AfterClass
    public void afterClass() {
        logger.log(Level.INFO, "Realizando acciones posteriores a la prueba de cerrar sesión...");
    }

    @AfterSuite
    public void afterSuite() {
        logger.log(Level.INFO, "Realizando acciones posteriores a la suite de pruebas...");
    }
}
