import java.util.*;
import javax.swing.JOptionPane;

/* Exercício 5 – Clube de Campo
        * Aluno: Arthur Oliveira Ribeiro – Matricula: 20210066925
        * Aluno: Luiz Henrique dos Santos Souza – Matricula: 20220005790
*/

public class ClubeDeCampo {

    public static void main (String[] args) {

        int N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de pessoas cadastradas (entre 1 e 10): "));

        while (N < 1 || N > 10) {

            N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de pessoas cadastradas (ENTRE 1 e 10): ", "ERRO! DIGITE NOVAMENTE!", 1));

        }

        int[] ID = new int[N];
        float[] altura = new float[N];

        for (int i = 0; i < N; i++) {


            ID[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite agora a idade da " + (i + 1) + "a pessoa cadastrada: ", "IDADES" , 1));

            while (ID[i] < 0) {

                ID[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite agora a idade da " + (i + 1) + "a pessoa cadastrada: ", "ERRO! DIGITE NOVAMENTE!" , 1));

            }

            altura[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite agora a altura da " + (i + 1) + "a pessoa cadastrada: ", "ALTURAS" , 1));

            while (altura[i] <= 0) {

                altura[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite agora a altura da " + (i + 1) + "a pessoa cadastrada: ", "ERRO! DIGITE NOVAMENTE!" , 1));

            }
        }

        float[] soma = {0, 0, 0, 0};
        int[] quantidade = {0, 0, 0, 0};
        float[] media = {0, 0, 0, 0};

        for (int i = 0; i < N; i++) {

            if (ID[i] > 21) {
                soma[3] += altura[i];
                quantidade[3]++;
            } else if (ID[i] > 15) {
                soma[2] += altura[i];
                quantidade[2]++;
            } else if (ID[i] > 10) {
                soma[1] += altura[i];
                quantidade[1]++;
            } else {
                soma[0] += altura[i];
                quantidade[0]++;
            }
        }

        for (int i = 0; i < 4; i++)
            if (quantidade[i] > 0)
                media[i] = soma[i]/quantidade[i];


        JOptionPane.showMessageDialog(null,
                String.format("Alturas médias:\n\nFaixa 1: idade menor ou igual a 10 anos -> Media: %.2fm\n\nFaixa 2: idade maior que 10 e menor ou igual a 15 anos -> Media: %.2fm\n\nFaixa 3: : idade maior que 15 e menor ou igual a 21 anos -> Media: %.2fm\n\nFaixa 4: : idade maior que 21 anos -> Media: %.2fm\n\n",
                        media[0],
                        media[1],
                        media[2],
                        media[3]));

    }

}
