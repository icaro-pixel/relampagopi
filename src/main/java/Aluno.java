public abstract class Aluno extends Pessoa {

    private String matricula = "";

    private float nota1 = 0;
    private float nota2 = 0;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    abstract public boolean foiAprovado();

    public String info(){
        String inf = "";
        inf = inf + getNome() + " " + getMatricula();

        if(foiAprovado()){
            inf = inf + " " + "Aprovado";
        } else {
            inf = inf + " " + "Reprovado";
        }


        return inf;
    }



}
