public class Professor extends Pessoa{

    private int titulacao = 0;

    public String getTitulacao() {
        String titulo = "" ;
        if(titulacao == 0) {
            titulo = "Graduado";
        }else {
            if (titulacao == 1) {
                titulo = "Especialista";
            }else {
                if (titulacao == 2){
                    titulo = "Mestre";
                } else {
                   if(titulacao == 3) {titulo = "Doutor";} else {
                       throw new IllegalArgumentException("invalido"); // mudar pro throw erro
                   }
                }
            }
        }

        return titulo;
    }

    public void setTitulacao(int titulacao) {
        this.titulacao = titulacao;
    }

    public String info(){
        String inf = "";

        inf = inf + getNome() + " " + getTitulacao();

        return inf;
    }
}
