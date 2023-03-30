import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class RhEmpresa {
    public static void main(String[] args){


        DecimalFormat deci = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        int numFun;
        float medSal = 0;

        System.out.println("Digite o numero de funcionarios:");
        numFun = sc.nextInt();

        String [] nomeFunc = new String[numFun];
        int [] salFunc = new int[numFun];

        for(int i = 0; i < numFun; i++){

            sc.nextLine();

            System.out.println("Digite o nome do funcionario " + i + ":");
            nomeFunc[i] = sc.nextLine();


            System.out.println("Digite o salario do funcionario " + i + ":");
            salFunc[i] = sc.nextInt();

            medSal += salFunc[i];
        }

        Arrays.sort(salFunc);

        medSal =  medSal / numFun;

        System.out.println("O maior salario é: R$ " + deci.format(salFunc[numFun - 1]));
        System.out.println("A media salarial é de R$ " + medSal);


        System.out.println("Lista de funcionarios que recebem menos que a media salarial da empresa:");

        for(int i = 0; i < numFun;i++){

            if(salFunc[i] < medSal){
                System.out.println("ID: " + i+1 + " - Nome: " + nomeFunc[i] + "Salario: R$" + salFunc[i]);
            }


        }

        System.out.println("\nLista de funcionarios que recebem mais que a media salarial da empresa:");

        for(int i = 0; i < numFun;i++){

            if(salFunc[i] >= medSal){
                System.out.println("ID: " + i+1 + " - Nome: " + nomeFunc[i] + "Salario: R$" + salFunc[i]);
            }

        }

    }

}
