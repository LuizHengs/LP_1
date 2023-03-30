/* Exercício 1 – Tabuada
    * Aluno: Arthur Oliveira Ribeiro – Matricula: 20210066925
    * Aluno: Luiz Henrique dos Santos Souza – Matricula: 20220005790
*/


import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){

        System.out.println("Bem vindo(a) a tabuada! ");
        System.out.println("Selecione a operação abaixo:");
        System.out.println("1.Soma\n2.Subtração\n3.Multiplicação\n4.Divisão");

        int opcao, numero;
        Scanner sc = new Scanner(System.in);
        opcao = sc.nextInt();

        System.out.println("Selecione um numero entre 1 e 9");

        numero = sc.nextInt();
        switch (opcao) {
            case 1:
                Soma(numero);
                break;
            case 2:
                Subtracao(numero);
                break;
            case 3:
                Multiplicacao(numero);
                break;
            case 4:
                Divisao(numero);
                break;
        }


    }

    public static void Soma(int x){

        for(int i = 0; i < 10;i++){
            System.out.println((i + 1) + " + " + x + " = " + (i + 1 + x));
        }

    }

    public static void Subtracao(int x) {
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - " + x + " = " + (i + 1 - x));
        }
    }

        public static void Multiplicacao(int x){

            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + " * " + x + " = " + ((i + 1) * x));
            }
        }
    public static void Divisao(int x){
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " / " + x + " = " + ((float) (i + 1) / x));
        }
    }

}





