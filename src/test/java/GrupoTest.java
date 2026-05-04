import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {


    @Test
    void escolaridadePresidenteGrupo(){
        Funcionario presidente = new Funcionario();
        Escolaridade escolaridade = new Escolaridade();
        Grupo grupo = new Grupo();

        grupo.setPresidente(presidente);
        presidente.setEscolaridade(escolaridade);
        escolaridade.setEscolaridade("Ensino superior");

        assertEquals("Ensino superior", grupo.getEscolaridadePresidente());

    }

    @Test
    void escolaridadePresidenteNula(){
        Funcionario presidente = new Funcionario();
        Grupo grupo = new Grupo();
        grupo.setPresidente(presidente);


        assertThrows(NullPointerException.class, () -> grupo.getEscolaridadePresidente() );
    }


}