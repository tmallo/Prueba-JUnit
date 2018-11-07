package Saludo;

import junit.framework.Assert;
import org.junit.Test;

public class SaludadorTest{

    /*
    @Test
    public void saludarFalla() {
    
        Saludador saludador = new Saludador();
        String resultado = saludador.saludar();        
        Assert.assertEquals("chau", resultado); //deberia fallar
    }
    */
    

    @Test
    public void saludarFuncionaCorrectamente() {
    
        Saludador saludador = new Saludador();
        String resultado = saludador.saludar();        
        Assert.assertEquals("hola", resultado); //deberia estar bien
    }
}
