import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test

    void testandoCidadeEstado(){

        Estado mg = new Estado();
        mg.setNomeEstado("minas");
        Cidade jaca = new Cidade();
        jaca.setEstado(mg);

        assertEquals("minas", jaca.getNomeEstado());





    }





}