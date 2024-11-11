import org.junit.Assert;
import org.junit.Test;

public class OperacionesMixtasTest {
    @Test
    public void testBooleanComoTexto() {
        // arrange
        boolean valor = false;
        String resultadoEsperado = "falso";
        // act
        String resultadoReal = OperacionesMixtas.booleanComoTexto(valor);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
        

    }

    
    @Test
    public void testCambiarTextoAMayusculas() {

        // arrange
        String texto = "hola como Estamos";
        boolean mayuscula = true;
        String resultadoEsperado = "HOLA COMO ESTAMOS";

        // act
        String resultadoReal = OperacionesMixtas.cambiarTextoAMayusculas(texto, mayuscula);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testCambiarTextoAMayusculas_a_minuscula() {

        // arrange
        String texto = "hola como Estamos";
        boolean mayuscula = false;
        String resultadoEsperado = "hola como estamos";

        // act
        String resultadoReal = OperacionesMixtas.cambiarTextoAMayusculas(texto, mayuscula);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testConcatenarNumeroTexto() {

        // arrange
        int num = 2;
        String texto = "Hola";
        String resultadoEsperado = "2 Hola";

        // act
        String resultadoReal = OperacionesMixtas.concatenarNumeroTexto(num, texto);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

        
    }

    @Test
    public void testConcatenarNumeroTexto_5_Jeje() {

        // arrange
        int num = 5;
        String texto = "Jeje";
        String resultadoEsperado = "5 Jeje";

        // act
        String resultadoReal = OperacionesMixtas.concatenarNumeroTexto(num, texto);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

        
    }

    @Test
    public void testConcatenarTextos() {

        // arrange
        String texto1 = "Xaxa4";
        String texto2 = "pam pam";
        String resultadoEsperado = "Xaxa4 pam pam";

        // act
        String resultadoReal = OperacionesMixtas.concatenarTextos(texto1, texto2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    
    }

    @Test
    public void testConcatenarTextos_Hola_David() {

        // arrange
        String texto1 = "Hola";
        String texto2 = "David";
        String resultadoEsperado = "Hola David";

        // act
        String resultadoReal = OperacionesMixtas.concatenarTextos(texto1, texto2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testDescripcionConFloat() {

        // arrange
        float num1 = 7.24f;
        float num2 = 354.56f;
        String resultadoEsperado = "Los valores son: 7.24€ y 354.56€";

        // act
        String resultadoReal = OperacionesMixtas.descripcionConFloat(num1, num2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testDescripcionNumero_7() {

        // arrange
        int num = 7;
        String resultadoEsperado = "El número es positivo";

        // act
        String resultadoReal = OperacionesMixtas.descripcionNumero(num);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testDescripcionNumero_0() {

        // arrange
        int num = 0;
        String resultadoEsperado = "El número es cero";

        // act
        String resultadoReal = OperacionesMixtas.descripcionNumero(num);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testDescripcionNumero_menos_4() {

        // arrange
        int num = -4;
        String resultadoEsperado = "El número es negativo";

        // act
        String resultadoReal = OperacionesMixtas.descripcionNumero(num);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }


    @Test
    public void testFormatearNumero() {

        // arrange
        float num = 17.89945f;
        int decimales = 2;
        String resultadoEsperado = "17,90";

        // act
        String resultadoReal = OperacionesMixtas.formatearNumero(num, decimales);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testFormatearNumero_29_punto4562_3() {

        // arrange
        float num = 29.4562f;
        int decimales = 3;
        String resultadoEsperado = "29,456";

        // act
        String resultadoReal = OperacionesMixtas.formatearNumero(num, decimales);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }
}
