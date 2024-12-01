import org.junit.Assert;
import org.junit.Test;

public class AaavamosTest {

    @Test
    public void probandomañanaTest(){
        //arrange
        String texto1 = "Hola";
        String texto2 = "y adiós";
        String resultadoEsperado = "Hola y adiós";

        //act
        String resultadoReal = Aaavamos.probandoMañana(texto1,texto2);
        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
