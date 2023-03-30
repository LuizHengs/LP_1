import java.util.*;
import javax.swing.JOptionPane;

/* Exercício 6 – Calculadora
 * Aluno: Arthur Oliveira Ribeiro – Matricula: 20210066925
 * Aluno: Luiz Henrique dos Santos Souza – Matricula: 20220005790
 */

public class Calculadora {

    public static void main (String[] args) {

        int N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para fazer operações: ", "Este número é importante!" , 1));
        int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Funções:\n" +
                "1 – Dobro,\n" +
                "2 – Triplo, \n" +
                "3 – Metade, \n" +
                "4 – Quadrado, \n" +
                "5 – Cubo, \n" +
                "6 – Raiz Quadrada, \n" +
                "7 – Raiz Cúbica, \n" +
                "8 – Módulo, \n" +
                "9 – Inverso e \n" +
                "0 – Sair do Programa",
                "ESCOLHA A FUNÇÃO DA CALCULADORA", 1));

        switch (i) {

            case 1: Dobro(N); break;
            case 2: Triplo(N); break;
            case 3: Metade(N); break;
            case 4: Quadrado(N); break;
            case 5: Cubo(N); break;
            case 6: RaizQuadrada(N); break;
            case 7: RaizCubica(N); break;
            case 8: Modulo(N); break;
            case 9: Inverso(N); break;
            default: JOptionPane.showMessageDialog(null,"Você escolheu para encerrar o programa!", "SEM GRAÇA!", 1);  break;
        }
    }

    public static void Dobro (int N) {

        JOptionPane.showMessageDialog(null,"O dobro do número é " + (2 * N) + ", e o programa será encerrado agora");

    }

    public static void Triplo (int N) {

        JOptionPane.showMessageDialog(null,"O triplo do número é " + (3 * N) + ", e o programa será encerrado agora");

    }

    public static void Metade (int N) {

        JOptionPane.showMessageDialog(null,"A metade do número é " + (float)(N/2.0) + ", e o programa será encerrado agora");

    }

    public static void Quadrado (int N) {

        JOptionPane.showMessageDialog(null,"O quadrado do número é " + (Math.pow(N, 2)) + ", e o programa será encerrado agora");

    }

    public static void Cubo (int N) {

        JOptionPane.showMessageDialog(null,"O cubo do número é " + (Math.pow(N, 3)) + ", e o programa será encerrado agora");

    }

    public static void RaizQuadrada (int N) {

        JOptionPane.showMessageDialog(null,"A raiz quadrada do número é " + (float)(Math.sqrt(N)) + ", e o programa será encerrado agora");

    }

    public static void RaizCubica (int N) {

        JOptionPane.showMessageDialog(null,"A raiz cubica do número é " + (Math.pow(N, 1/3.0)) + ", e o programa será encerrado agora");

    }

    public static void Modulo (int N) {

        JOptionPane.showMessageDialog(null,"O modulo do número é " + (int)(Math.abs(N)) + ", e o programa será encerrado agora");

    }

    public static void Inverso (int N) {

        JOptionPane.showMessageDialog(null,"O inverso do número é " + (Math.pow(N, -1)) + ", e o programa será encerrado agora");

    }

}
