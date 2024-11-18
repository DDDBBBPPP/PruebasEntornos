package ejerciciotdd;

import org.junit.Assert;
import org.junit.Test;

public class EjercicioTDDTest {

    @Test
    public void testCadenaInvertida() {

        // arrange
        String texto = "amigo";
        
        String resultadoEsperado = "ogima";

        // act
        String resultadoReal = EjercicioTDD.invertirCadena(texto);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }
}
