import org.junit.Assert;
import org.junit.Test;

public class ComparacionesEnterosTest {
    @Test
    public void testSonIguales() {
        // arrange
        int num1 = 2;
        int num2 = 2;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.sonIguales(num1, num2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testEsMayor() {
        // arrange
        int num1 = 5;
        int num2 = 2;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.esMayor(num1, num2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testEsMayor_5_5() {
        // arrange
        int num1 = 5;
        int num2 = 5;
        boolean resultadoEsperado = false;

        // act
        boolean resultadoReal = ComparacionesEnteros.esMayor(num1, num2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testEsMayor_5_7() {
        // arrange
        int num1 = 5;
        int num2 = 7;
        boolean resultadoEsperado = false;

        // act
        boolean resultadoReal = ComparacionesEnteros.esMayor(num1, num2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testEsMenor_2_Y_5() {
        // arrange
        int num1 = 2;
        int num2 = 5;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.esMenor(num1, num2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testEsMenor_2_Y_2() {
        // arrange
        int num1 = 2;
        int num2 = 2;
        boolean resultadoEsperado = false;

        // act
        boolean resultadoReal = ComparacionesEnteros.esMenor(num1, num2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testEsMenor_2_Y_0() {
        // arrange
        int num1 = 2;
        int num2 = 0;
        boolean resultadoEsperado = false;

        // act
        boolean resultadoReal = ComparacionesEnteros.esMenor(num1, num2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testEsDivisible_6_y_2() {
        // arrange
        int num1 = 6;
        int num2 = 2;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.esDivisible(num1, num2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testEsDivisible_6_y_0() {
        // arrange
        int num1 = 6;
        int num2 = 0;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.esDivisible(num1, num2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testalMenosUnoPositivo() {
        // arrange
        int num1 = 2;
        int num2 = -2;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.alMenosUnoPositivo(num1, num2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testalMenosUnoPositivo_2_y_6() {
        // arrange
        int num1 = 4;
        int num2 = 5;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.alMenosUnoPositivo(num1, num2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSonAmbosPares() {
        // arrange
        int num1 = 4;
        int num2 = 8;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.sonAmbosPares(num1, num2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSumaEsPar() {
        // arrange
        int num1 = 0;
        int num2 = 0;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.sumaEsPar(num1, num2);
        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }
}
