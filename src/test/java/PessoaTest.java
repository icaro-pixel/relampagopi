import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarDescricaoEscolaridade(){

        Escolaridade escolaridade = new Escolaridade();
        Pessoa pessoa = new Pessoa();
        pessoa.setEscolaridade(escolaridade);
        escolaridade.setEscolaridadeInfo("Mestrado");

        assertEquals("Mestrado", pessoa.getEscolaridadeDescricao());
    }

    @Test
    void deveRetornarSemEscolaridade(){

        Pessoa pessoa = new Pessoa();

        assertThrows(NullPointerException.class, () -> pessoa.getEscolaridadeDescricao());

    }




}