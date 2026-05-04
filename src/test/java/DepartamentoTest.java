import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void escolaridadeChefe(){
        Funcionario chefe = new Funcionario();
        Departamento departamento = new Departamento();
        Escolaridade escolaridade = new Escolaridade();

        escolaridade.setEscolaridade("nano");
        departamento.setChefia(chefe);
        chefe.setEscolaridade(escolaridade);

        assertEquals("nano", departamento.getEscolaridadeChefe());

    }

    @Test
    void escolaridadeChefeNula(){
        Funcionario chefe = new Funcionario();
        Departamento departamento = new Departamento();

        departamento.setChefia(chefe);

        assertThrows(NullPointerException.class, () -> departamento.getEscolaridadeChefe());


    }

}
