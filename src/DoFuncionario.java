import java.util.ArrayList;
import java.util.Scanner;

public class DoFuncionario {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios=new ArrayList<>();
        Gerente gerente=new Gerente();
        Programador programador=new Programador();

        gerente.setNome("Adalberto");
        gerente.setSalario(2500);

        programador.setNome("Hebert");
        programador.setSalario(3800);

        funcionarios.add(gerente);
        funcionarios.add(programador);


        Scanner leia = new Scanner(System.in);
        int numero;
        int numero2;
        do {
            System.out.println("Digite 1 para consultar os dados do Gerente");
            System.out.println("Digite 2 para consultar os dados do Programador");
            System.out.println("Digite 0 para encerrar o programa");
            numero = leia.nextInt();
        if (numero==1) {
            System.out.println("Nome: " +gerente.getNome()+"\nSalário: R$" + gerente.salario);
            System.out.println("Digite 1 para aumentar o salário");
            System.out.println("Digite 0 para encerrar o programa");

            numero2 = leia.nextInt();
            if (numero2 == 1) {
                System.out.println("O salário do gerente agora é de R$" + gerente.aumentoSalario());
                break;
            }

            }
        if (numero==2) {
            System.out.println("Nome:  "+programador.getNome() +"\nSalário: R$" + programador.salario);
            System.out.println("Digite 1 para aumentar o salário");
            System.out.println("Digite 0 para encerrar o programa");

            numero2 = leia.nextInt();

            if (numero2 == 1) {
                System.out.println("O salário do programador agora é de R$" + programador.aumentoSalario());
                break;
            }
            }if(numero!=1 && numero!=2 && numero!=0&& numero!=3&& numero!=4){
            System.out.println("Numero invalido");
        }

        }while (numero!=0);
    }
}
