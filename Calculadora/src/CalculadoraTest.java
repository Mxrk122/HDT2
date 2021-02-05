import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
    
public class CalculadoraTest {  

    @Test
    public void testCalculadora() {
        //Se instancia la clase y se llama al metodo a probar
        Calculadora c = new Calculadora();
        String obtenido = c.Calculo("5 3 + +");

        //Resultado esperado
        String resultado="No se puede operar, hay un error de signos";

        assertEquals(resultado, obtenido);
    }

    @Test
    public void testCalculadora2() {
        //Se instancia la clase y se llama al metodo a probar
        Calculadora c = new Calculadora();
        String obtenido = c.Calculo("5 3 + 4 5 6 8");

        //Resultado esperado
        String resultado="8.0";

        assertEquals(resultado, obtenido);
    }

    @Test
    public void testCalculadora3() {
        //Se instancia la clase y se llama al metodo a probar
        Calculadora c = new Calculadora();
        String obtenido = c.Calculo("4 8 3 * + ");

        //Resultado esperado
        String resultado="28.0";

        assertEquals(resultado, obtenido);
    }
}
    