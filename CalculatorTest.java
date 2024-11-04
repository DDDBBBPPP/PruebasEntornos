import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    //Aquí hacemos un ejemplo de suma solo.
    @Test
    public void testSuma_2_mas_23() {

         // Preparar valores
        int num1 = 2;
        int num2 = 23;
        int resultadoEsperado = 25;
        // Ejecutar función a probar
        int resultadoObtenido = Calculator.suma(num1,num2);
        // Comprobar resultado
        Assert.assertEquals(resultadoEsperado, resultadoObtenido);

    }
    // Vamos a hacer dos test de resta
    @Test
    public void testResta_7_menos_5() {

         // Preparar valores
         int num1 = 7;
         int num2 = 5;
         int resultadoEsperado = 2;
         // Ejecutar función a probar
         int resultadoObtenido = Calculator.resta(num1,num2);
         // Comprobar resultado
         Assert.assertEquals(resultadoEsperado, resultadoObtenido);

    }

    @Test
    public void testResta_14_menos_menos23() {

         // Preparar valores
         int num1 = 14;
         int num2 = -23;
         int resultadoEsperado = 37;
         // Ejecutar función a probar
         int resultadoObtenido = Calculator.resta(num1,num2);
         // Comprobar resultado
         Assert.assertEquals(resultadoEsperado, resultadoObtenido);

    }
    // Dos test a multiplicación con distintos valores
    @Test
    public void testMultiplicacion_4_por_7() {

         // Preparar valores
         int num1 = 4;
         int num2 = 7;
         int resultadoEsperado = 28;
         // Ejecutar función a probar
         int resultadoObtenido = Calculator.multiplicacion(num1,num2);
         // Comprobar resultado
         Assert.assertEquals(resultadoEsperado, resultadoObtenido);

    }

    @Test
    public void testMultiplicacion_2_por_menos14() {

         // Preparar valores
         int num1 = 2;
         int num2 = -14;
         int resultadoEsperado = -28;
         // Ejecutar función a probar
         int resultadoObtenido = Calculator.multiplicacion(num1,num2);
         // Comprobar resultado
         Assert.assertEquals(resultadoEsperado, resultadoObtenido);

    }
    // Dos test a la función división de la clase calculator con resultado entero.
    @Test
    public void testDivision_100_entre_5() {

         // Preparar valores
         int num1 = 100;
         int num2 = 5;
         int resultadoEsperado = 20;
         // Ejecutar función a probar
         int resultadoObtenido = Calculator.division(num1,num2);
         // Comprobar resultado
         Assert.assertEquals(resultadoEsperado, resultadoObtenido);

    }

    @Test
    public void testDivision_49_entre_6() {

         // Preparar valores
         int num1 = 49;
         int num2 = 6;
         int resultadoEsperado = 8;
         // Ejecutar función a probar
         int resultadoObtenido = Calculator.division(num1,num2);
         // Comprobar resultado
         Assert.assertEquals(resultadoEsperado, resultadoObtenido);

    }
}
