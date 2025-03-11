package maratonajava.funcionarios;

public class ResultadoFuncionario {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();

        funcionarios.nome = "Mateus";
        funcionarios.idade = 23;
        funcionarios.salarios = new double[]{1700, 180, 2000};

        funcionarios.imprime();
        funcionarios.mediaSalarios();
    }
}
