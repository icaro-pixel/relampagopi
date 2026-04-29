public class Imc {

    private String sexo;
    private float peso;
    private float altura;

    public Imc() {
        this.peso = 50;
        this.altura = 1.0f;
        this.sexo = "m";
    }


    public void setPeso(float peso) {
        if (peso <= 0){
            throw new IllegalArgumentException("invalido");
        }
        this.peso = peso;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setAltura(float altura) {
        if (altura <= 0){
            throw new IllegalArgumentException("invalido");
        }
        this.altura = altura;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setSexo(String sexo) {
        if (sexo.equals("a")) {
            throw new IllegalArgumentException("invalido");
        }
        if (sexo.equals("b")) {
            throw new IllegalArgumentException("invalido");
        }
        this.sexo = sexo;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String calcularImc() {
        float imc = this.peso / (this.altura * this.altura);
        String resultado = "";

        if (sexo.equals("m")) {
            if (imc < 20.7) {
                resultado = "abaixo do peso";
            } else {
                if (imc < 26.4) {
                    resultado = "normal";
                } else {
                    if (imc < 27.8) {
                        resultado = "um pouco acima";
                    } else {
                        if (imc < 31.1) {
                            resultado = "acima";
                        } else {
                            resultado = "obeso";
                        }
                    }
                }
            }
        }
        if (sexo.equals("f")) {
            if (imc < 19.1f) {
                resultado = "abaixo do peso";
            } else {
                if (imc < 25.8f) {
                    resultado = "normal";
                } else {
                    if (imc < 27.3f) {
                        resultado = "um pouco acima";
                    } else {
                        if (imc < 32.3f) {
                            resultado = "acima";
                        } else {
                            resultado = "obeso";
                        }
                    }
                }
            }
        }


        return resultado;
    }
}