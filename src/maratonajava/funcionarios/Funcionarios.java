package maratonajava.funcionarios;

public class Funcionarios {
    // Crie uma classe Funcionario com os seguintes atributos

    /*
    nome
    idade
    salario // três salários devem ser guardados

    Crie dois métodos

    1. Para imprimir os dados
    2. Para tirar a média dos salários e imprimir o resultado.
     */

    public String nome;
    public int idade;
    double [] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios){
            System.out.print(salario + " ");
        }
    }

    public void mediaSalarios(){
        if (salarios == null || salarios.length ==0){
            System.out.println("Nenhum salários informado!");
            return;
        }

        double num = 0;
        for (double salario : salarios){
            num += salario;
        }
        System.out.printf("\nA media do salario foi : %.2f", num/salarios.length);
    }
}
