public class Aluno extends Pessoa {

    private double nota1;
    private double nota2;
    private String cursos;

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public double getNota1(){
        return this.nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public double getNota2(){
        return this.nota2;
    }

    public void setCursos(String cursos){
        this.cursos = cursos;
    }

    public String getCursos(){
        return this.cursos;
    }


    public double calculaMedia(){

        return (this.nota1 + this.nota2) / 2.0;
        
    }

    public boolean verificaAprovado(){

        boolean condicao;

        if(calculaMedia() < 6.0){
            condicao = false;
        }else{
            condicao = true;
        }

        return condicao;
    }
}
