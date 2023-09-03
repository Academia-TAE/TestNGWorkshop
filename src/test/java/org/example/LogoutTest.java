package org.example;

import org.testng.annotations.*;

public class LogoutTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Configurando la suite de pruebas...");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Configurando la clase de prueba para cerrar sesión...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Configurando el escenario para cerrar sesión...");
    }

    @Test
    public void afterLogOut() {
        System.out.println("Paso 1: Intentar cerrar sesión.");
        System.out.println("Paso 2: Verificar que se redirige correctamente a la página de inicio de sesión.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Limpiando después de la prueba de cerrar sesión...");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Realizando acciones posteriores a la prueba de cerrar sesión...");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Realizando acciones posteriores a la suite de pruebas...");
    }
}
