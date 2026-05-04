import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void FuncionarioPais(){
        Funcionario funcionario = new Funcionario();
        Departamento departamento = new Departamento();
        Empresa empresa = new Empresa();
        Grupo grupo = new Grupo();
        Pais pais = new Pais();

        pais.setName("brasil");

        funcionario.setAlocacao(departamento);
        departamento.setEmpresa(empresa);
        empresa.setGrupo(grupo);
        grupo.setSede(pais);


        assertEquals("brasil", funcionario.getPaisAlocacao());
    }

    @Test
    void FuncionarioPaisNuloUm(){
        Funcionario funcionario = new Funcionario();
        Departamento departamento = new Departamento();
        Empresa empresa = new Empresa();
        Grupo grupo = new Grupo();
        Pais pais = new Pais();

        funcionario.setAlocacao(departamento);
        departamento.setEmpresa(empresa);
        empresa.setGrupo(grupo);



        assertThrows(NullPointerException.class, () -> funcionario.getPaisAlocacao());

    }

    @Test
    void FuncionarioPaisNuloDois(){
        Funcionario funcionario = new Funcionario();
        Departamento departamento = new Departamento();

        funcionario.setAlocacao(departamento);

        try{
            funcionario.getPaisAlocacao();
            fail("deu bosta");
        } catch (NullPointerException e) {
            assertEquals("nulo", e.getMessage());
        }


    }

    @Test
    void EstadoFilialCoordena(){

        Funcionario funcionario = new Funcionario();
        Filial filial = new Filial();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();

        estado.setName("minas");

        funcionario.setCoordeno(filial);
        filial.setCidade(cidade);
        cidade.setEstado(estado);

        assertEquals("minas", funcionario.getEstadoFilialTrabalho());


    }
    @Test
    void EstadoFilialCoordenaNulo(){

        Funcionario funcionario = new Funcionario();

        assertThrows(NullPointerException.class, () -> funcionario.getEstadoFilialTrabalho());


    }

}