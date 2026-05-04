import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarEscolaridadeDirecao(){

        Escolaridade escolaridade = new Escolaridade();
        Professor direcao = new Professor();
        escolaridade.setEscolaridadeInfo("Mestre");
        Escola escola = new Escola();
        direcao.setEscolaridade(escolaridade);
        escola.setDirecao(direcao);

        assertEquals("Mestre", escola.getDiretorEscolaridadeDescricao() );

    }

    @Test
    void deveRetornarSemEscolaridadeDirecao(){

        Professor direcao = new Professor();
        Escola escola = new Escola();

        assertThrows(NullPointerException.class, () -> escola.getDiretorEscolaridadeDescricao());

    }



}