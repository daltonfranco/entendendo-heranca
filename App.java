import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        // jeito com scanner

        System.out.print("Digite seu nome: ");
        aluno.setNome(sc.nextLine());

        System.out.print("Digite seu cpf: ");
        aluno.setCpf(sc.nextLine());

        System.out.print("Digite seu endereço: ");
        aluno.setEndereco(sc.nextLine());

        System.out.print("Digite seu curso: ");
        aluno.setCursos(sc.nextLine());

        System.out.print("Digite a nota da p1: ");
        aluno.setNota1(sc.nextDouble());

        System.out.print("Digite a nota da p2: ");
        aluno.setNota2(sc.nextDouble());

        aluno.verificaAprovado();

        // jeito sem scanner

        /*aluno.setNome("Ademir da silva Camargo");
        aluno.setCpf("31234556770");
        aluno.setEndereco("Centenario 280");
        aluno.setTelefone("12311233");
        aluno.setCursos("Ensino Medio");
        aluno.setNota1(9.0);
        aluno.setNota2(5.8);*/

        System.out.println("O aluno(a) " + aluno.getNome() + " tem as notas da p1 e p2, respectivamente, " + aluno.getNota1() + " e " + aluno.getNota2());
        System.out.print("Sua media é " + aluno.calculaMedia() + " sendo assim, ele está:" );

        if(aluno.verificaAprovado() == true){
            System.out.println(" Aprovado");
        }else{
            System.out.println(" reprovado");
        }



    }
}
