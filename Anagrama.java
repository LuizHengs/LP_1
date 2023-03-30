import java.util.*;
import javax.swing.JOptionPane;

/* Exercício 8 – Anagrama
 * Aluno: Arthur Oliveira Ribeiro – Matricula: 20210066925
 * Aluno: Luiz Henrique dos Santos Souza – Matricula: 20220005790
 */

public class Anagrama {

    public static void main (String[] args) {

        String c1;
        boolean serah = false;
        int index;
        StringBuilder frase1 = new StringBuilder(), frase2 = new StringBuilder();
        frase1.append(JOptionPane.showInputDialog(null, "Digite uma frase qualquer: ", "Vamos ver se é anagrama - Frase 1", 1).toLowerCase());
        frase2.append(JOptionPane.showInputDialog(null, "Digite uma outra frase qualquer para compararmos: ", "Vamos ver se é anagrama - Frase 2", 1).toLowerCase());

        removerEspacos(frase1);
        removerEspacos(frase2);

        if (frase1.length() != frase2.length())
            JOptionPane.showMessageDialog(null, "Não é anagrama, porque os tamanhos das Strings são diferentes ");
        else {
            int j = 0;
            int continuar = 1;
            for (int i = 0; i < frase1.length(); i++) {
                continuar = 1;
                j = 0;
                c1 = Character.toString(frase1.charAt(i));
                index = frase2.indexOf(c1);

                if (index < 0)
                    break;
                else {
                    for (int k = 0; k < frase2.length(); k++)
                        if (c1.charAt(0) != frase2.charAt(k) || continuar == 0)
                            frase2.setCharAt(j++, frase2.charAt(k));
                        else
                            continuar = 0;

                    frase2.delete(j, frase2.length());
                }

            }
        }

        if (frase2.length() == 0)
            serah = true;

        if (serah)
            JOptionPane.showMessageDialog(null, "É anagrama!");
        else
            JOptionPane.showMessageDialog(null, "Não é anagrama");
    }

    public static void removerEspacos (StringBuilder sb) {
        int indicadorReal = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (!Character.isWhitespace(sb.charAt(i)))
                sb.setCharAt(indicadorReal++, sb.charAt(i));
        }

        sb.delete(indicadorReal, sb.length());

    }

}
