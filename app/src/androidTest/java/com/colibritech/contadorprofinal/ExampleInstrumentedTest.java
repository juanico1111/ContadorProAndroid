package com.colibritech.contadorprofinal;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Prueba instrumentada que se ejecutará en un dispositivo Android.
 * Verifica que el contexto de la aplicación es el esperado.
 *
 * @see <a href="http://d.android.com/tools/testing">Documentación sobre pruebas</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    /**
     * Prueba que el nombre del paquete de la aplicación es el esperado.
     * Obtiene el contexto de la aplicación y verifica que el nombre del paquete coincida con el esperado.
     */
    @Test
    public void useAppContext() {
        // Contexto de la aplicación bajo prueba.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.colibritech.contadorprofinal", appContext.getPackageName());
    }
}
