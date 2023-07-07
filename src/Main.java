import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Contador contador1= new Contador(); //objeto 1
        System.out.println(Contador.contador);
        Contador contador2 = new Contador();//objeto 2
        System.out.println(Contador.contador);

        Contador contador3 = null;
        Contador contador4; // = null
        int numero;

        long creditCardNumber = 1234_5678_9012_3456L;

        System.out.println(creditCardNumber);

        String palavraComAcento = "Sí Señor";
        System.out.println(palavraComAcento);
        System.out.println("S\u00ED Se\u00F1or");

        int[] vetor = new int[10];



        vetor[0] = 1;
        vetor[1] = 2;
        //....
        vetor[9] = 10;

        System.out.println(vetor[0]);
        vetor[0] = 2;
        System.out.println(vetor[0]);


        int[] vetor2 = {2,1,0,3,5,10,89,9};
        System.out.println("Meu vetor tem: " + vetor2.length + " posições.");
        int i;
        for (i=0; i < vetor2.length ; i++){
            System.out.println("Na posição " + i + " temos o valor " + vetor2[i]);
        }

        Arrays.sort(vetor2); //0,1,2...,89 ordena vetor

        System.out.println("Depois de ordenar");

        for (i=0; i < vetor2.length ; ++i){
            System.out.println("Na posição " + i + " temos o valor " + vetor2[i]);
        }

        int[] vetor3 = Arrays.copyOfRange(vetor2, 3,7); //copiar da posição 1 até a posição 2
        System.out.println("Meu vetor tem: " + vetor3.length + " posições.");

        int j;
        for (j=0; j < vetor3.length ; j++){
            System.out.println("Na posição " + j + " temos o valor " + vetor3[j]);
        }


        int posicao = Arrays.binarySearch(vetor2, 89); //busca
        System.out.println("\n O valor 89 está na posição: " + posicao);


        int numero1 = 7;
        int numero2 = 5;
        int calculo = soma(numero1,numero2); //passando variavel por parametro em um metodo

        System.out.println(calculo);
    }

    public static int soma(int i, int j){
        return i+j;
    }
}