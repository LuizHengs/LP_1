import java.util.*;
import javax.swing.JOptionPane;

/* Exercício 7 – Operações com Matrizes
 * Aluno: Arthur Oliveira Ribeiro – Matricula: 20210066925
 * Aluno: Luiz Henrique dos Santos Souza – Matricula: 20220005790
 */

public class OperacoesMatrizes {

    public static void main (String[] args) {

        final int DIMENSAO  = 4;
        double[][] matriz = new double[DIMENSAO][DIMENSAO];
        int k = 0;

        for (int i = 0; i < DIMENSAO; i++)
            for (int j = 0; j < DIMENSAO; j++)
                matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + (k++ + 1) + "o elemento da matriz: ", "ELEMENTOS DA MATRIZ" , 1));


        MediaAbaixoDiagPrincipal(matriz, DIMENSAO);
        SomaAcimaDiagPrincipal(matriz, DIMENSAO);
        MediaDiagPrincipal(matriz, DIMENSAO);
        Menor(matriz, DIMENSAO);
        Soma(matriz, DIMENSAO);
    }

    //a

    public static void MediaAbaixoDiagPrincipal (double[][] matriz, final int DIMENSAO) {


        int j = 0, quant = 0;
        double soma = 0, media = 0;
        for (int i = 0; i < DIMENSAO; i++) {
            for (int k = 1; j - k >= 0; k++) {
                soma += matriz[i][j - k];
                quant++;
            }
            j++;
        }

        if (quant > 0)
            media = soma/quant;

        JOptionPane.showMessageDialog(null, "A MÉDIA aritmética dos elementos ABAIXO da diagonal principal é " + media);
    }

    //b

    public static void SomaAcimaDiagPrincipal (double[][] matriz, final int DIMENSAO) {


        int j = 0;
        double soma = 0;
        for (int i = 0; i < DIMENSAO; i++) {
            for (int k = 1; j + k < DIMENSAO; k++) {
                soma += matriz[i][j + k];
            }
            j++;
        }

        JOptionPane.showMessageDialog(null, "A SOMA dos elementos ACIMA da diagonal principal é " + soma);
    }

    //c

    public static void MediaDiagPrincipal (double[][] matriz, final int DIMENSAO) {


        int j = 0, quant = 0;
        double soma = 0, media = 0;
        for (int i = 0; i < DIMENSAO; i++) {
            soma += matriz[i][j];
            quant++;
            j++;
        }

        if (quant > 0)
            media = soma/quant;

        JOptionPane.showMessageDialog(null, "A MÉDIA aritmética dos elementos da diagonal principal é " + media);
    }

    //d

    public static void Menor (double[][] matriz, final int DIMENSAO) {

        double menor = 999999999;
        for (int i = 0; i < DIMENSAO; i++)
            for (int j = 0; j < DIMENSAO; j++)
                if (matriz[i][j] < menor)
                    menor = matriz[i][j];

        JOptionPane.showMessageDialog(null, "O menor dos elementos da matriz é " + menor);
    }

    //e

    public static void Soma (double[][] matriz, final int DIMENSAO) {

        double soma = 0;
        for (int i = 0; i < DIMENSAO; i++) {
            for (int j = 0; j < DIMENSAO; j++) {
                soma += matriz[i][j];
            }
        }

        JOptionPane.showMessageDialog(null, "A SOMA dos elementos da matriz é " + soma);
    }


}
