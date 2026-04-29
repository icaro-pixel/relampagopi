import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImcTest {

    public Imc pessoa;

    @Test
    void calcularOImcBaixoH(){
    pessoa = new Imc();
    pessoa.setPeso(20.6f);
    assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    void calcularOImcNormalH(){
        pessoa = new Imc();
        pessoa.setPeso(26.4f);
        assertEquals("normal", pessoa.calcularImc());
    }
    @Test
    void calcularOImcUmPoucoAcimaH(){
        pessoa = new Imc();
        pessoa.setPeso(27.7f);
        assertEquals("um pouco acima", pessoa.calcularImc());
    }
    @Test
    void calcularOImcAcimaH(){
        pessoa = new Imc();
        pessoa.setPeso(31.0f);
        assertEquals("acima", pessoa.calcularImc());
    }
    @Test
    void calcularOImcObesoH(){
        pessoa = new Imc();
        pessoa.setPeso(50f);
        assertEquals("obeso", pessoa.calcularImc());
    }



    @Test
    void calcularOImcBaixoF(){
        pessoa = new Imc();
        pessoa.setPeso(19.0f);
        pessoa.setSexo("f");
        assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    void calcularOImcNormalF(){
        pessoa = new Imc();
        pessoa.setPeso(25.7f);
        pessoa.setSexo("f");
        assertEquals("normal", pessoa.calcularImc());
    }
    @Test
    void calcularOImcUmPoucoAcimaF(){
        pessoa = new Imc();
        pessoa.setPeso(27.2f);
        pessoa.setSexo("f");
        assertEquals("um pouco acima", pessoa.calcularImc());
    }
    @Test
    void calcularOImcAcimaF(){
        pessoa = new Imc();
        pessoa.setPeso(32.2f);
        pessoa.setSexo("f");
        assertEquals("acima", pessoa.calcularImc());
    }
    @Test
    void calcularOImcObesoF(){
        pessoa = new Imc();
        pessoa.setPeso(50f);
        pessoa.setSexo("f");
        assertEquals("obeso", pessoa.calcularImc());
    }

    @Test
    void pesoErrado(){
        pessoa = new Imc();
        assertThrows(IllegalArgumentException.class, () -> pessoa.setPeso(0));
    }
    @Test
    void alturaErrada(){
        pessoa = new Imc();
        assertThrows(IllegalArgumentException.class, () -> pessoa.setAltura(0));
    }


}