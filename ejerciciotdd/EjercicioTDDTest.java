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
    @Test
    public void testCadenaInvertida_2() {

        // arrange
        String texto = "Vamonos por ahi";
        
        String resultadoEsperado = "iha rop sonomaV";

        // act
        String resultadoReal = EjercicioTDD.invertirCadena(texto);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testPalindromo_1() {

        // arrange
        String texto = "reconocer";

        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = EjercicioTDD.palindromo(texto);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testPalindromo_2() {

        // arrange
        String texto = "papypap";

        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = EjercicioTDD.palindromo(texto);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testPalindromo_3() {

        // arrange
        String texto = "hola";

        boolean resultadoEsperado = false;

        // act
        boolean resultadoReal = EjercicioTDD.palindromo(texto);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testContarConsonantes_1() {

        // arrange
        String texto = "hola";

        int resultadoEsperado = 2;

        // act
        int resultadoReal = EjercicioTDD.contarConsonantes(texto);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testContarConsonantes_2() {

        // arrange
        String texto = "tristes";

        int resultadoEsperado = 5;

        // act
        int resultadoReal = EjercicioTDD.contarConsonantes(texto);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }
    @Test
    public void testContarConsonantes_3() {

        // arrange
        String texto = "hola";

        int resultadoEsperado = 5;

        // act
        int resultadoReal = EjercicioTDD.contarConsonantes(texto);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testMayuscula_1() {

        // arrange
        String texto = "HOLA";

        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = EjercicioTDD.mayuscula(texto);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testMayuscula_2() {

        // arrange
        String texto = "VAYA";

        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = EjercicioTDD.mayuscula(texto);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testMayuscula_3() {

        // arrange
        String texto = "hola";

        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = EjercicioTDD.mayuscula(texto);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }




}
