import org.junit.Assert;
import org.junit.Test;

public class MatematicasTest {
    @Test
    public void testSuma_2_mas_2() {
        int resultado = Matematicas.suma(2, 2);
        Assert.assertEquals(4, resultado);
    }

    @Test
    public void testSuma_12_mas_menos3() {
        int resultado = Matematicas.suma(12, -3);
        Assert.assertEquals(9, resultado);
    }

    @Test
    public void testSuma_121_mas_37() {
        // Preparar valores
        int sumando1 = 121;
        int sumando2 = 37;
        int resultadoEsperado = 158;
        // Ejecutar función a probar
        int resultadoObtenido = Matematicas.suma(sumando1,sumando2);
        // Comprobar resultado
        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
