public class AlunoGraduacao extends Aluno{

    @Override
    public boolean foiAprovado() {
        return ((getNota1() + getNota2()) / 2) >= 7;
    }

}
