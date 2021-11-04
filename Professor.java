public class Professor extends Pessoa {
    
    private String departamento;
    private String nomeCurso;
    private double salario;
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso(){
        return this.nomeCurso;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }
    

    public double calculaSalarioLiquido(){
        return this.salario - (0.15*this.salario);
    }
}
