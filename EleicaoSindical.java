public class EleicaoSindical {
    public static void main(String[] args){

        int total,brancos= 500,nulos = 500,votosA = 3000,votosB = 2500,votosC = 3500;
        float percenA,percenB,percenC, percenNulos, percenBrancos;

        total = votosA + votosB + votosC + nulos + brancos;
        System.out.println(total);
        System.out.println("Resultado da Eleição para Sindico:\n");
        System.out.println("Candidato A:\n");


        percenA = ( votosA * 100) / total;
        System.out.println("-Votos validos: " + votosA);
        System.out.println("-Percentual de votos: "+ percenA + "%");

        System.out.println("Candidato B:\n");
        percenB = ( votosB * 100) / total;

        System.out.println("-Votos validos: " + votosB);
        System.out.println("-Percentual de votos: "+ percenB + "%");

        System.out.println("Candidato C:\n");
        percenC = ( votosC * 100) / total;

        System.out.println("-Votos validos: " + votosC);
        System.out.println("-Percentual de votos: "+ percenC + "%");

        System.out.println("\nVotos nulos: " + nulos);
        System.out.println("Votos brancos: " + brancos+"\n");

        percenNulos = (nulos * 100) / total;
        percenBrancos = (brancos * 100) / total;
        System.out.println("-Percentual de votos nulos: "+ percenNulos + "%");
        System.out.println("-Percentual de votos brancos: "+ percenBrancos+ "%");








    }
}
