import java.util.Random;
import java.text.DecimalFormat;
import java.util.Arrays;
public class CensoAltura {
    public static void main(String[] args){

        char[] sexo = {'m','f'};
        double [] altura = new double[20];
        char [] sexoTabela = new char[20];
        int c = 0,d = 0;
        float mediaM =0, mediaF = 0,mediaMT,mediaFT,porcenM, porcenF;
        DecimalFormat deci = new DecimalFormat("0.00");

        for(int i = 0; i < 20; i++){
            Random random = new Random();
            sexoTabela[i] = sexo[random.nextInt(2)];
            altura[i] =  1 + Math.random() ;

            System.out.println("Sexo da pessoa " + i + " : "+ sexoTabela[i]+"");
            System.out.println("altura da pessoa " + i + " : "+ deci.format(altura[i])+"\n");

            if(sexoTabela[i] == 'm'){
                mediaM +=(altura[i]);
                c += 1;
            }
            else{
                mediaF +=(altura[i]);
                d += 1;
            }
        }
        mediaMT = mediaM / c;
        mediaFT = mediaF / d;
        porcenF = (d * 100) / 20;
        porcenM = (c * 100) / 20;

        Arrays.sort(altura);

        System.out.println("A menor altura do grupo é " + deci.format(altura[0]) + " e a maior é " + deci.format(altura[19]));
        System.out.println("A media das alturas dos homens é: " + deci.format(mediaMT));
        System.out.println("A media das alturas das mulheres é: "+ deci.format(mediaFT));
        System.out.println("O numero de homens na lista é de: " + c);
        System.out.println("O numero de mulheres na lista é de : "+ d);
        System.out.println("A porcentagem de homens do grupo é de : " + porcenM + "%");
        System.out.println("A porcentagem de mulheres do grupo é de: "+ porcenF + "%");

    }

}
