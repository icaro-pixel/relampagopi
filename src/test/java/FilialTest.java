import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {

    @Test
    void nomeDiretorFilial(){

        Filial filial = new Filial();
        Empresa empresa = new Empresa();
        Funcionario diretor = new Funcionario();

        diretor.setName("Ricardo");
        filial.setEmpresa(empresa);
        empresa.setDiretor(diretor);

        assertEquals("Ricardo", filial.getNomeDiretor() );

    }

    @Test
    void nomeDiretorNulo(){

        Filial filial = new Filial();

        assertThrows(NullPointerException.class, () -> filial.getNomeDiretor());

    }

}