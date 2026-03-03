package academy.devdojo.maratonajava.introducao;

public class Exercicio06 {
    public static void main(String[] args) {
        int [] numeros = new int[6];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        numeros[5] = 60;
        for (int i = 0; i < numeros.length; i++) {
           // System.out.println(numeros[i]);

        }
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        for (int i = 0; i < numbers.length; i++) {
           // System.out.println("Indice " + i + " = " + numbers[i]);

        }
        int[] soma = new int[3];
        soma[0] = 10;
        soma[1] = 10;
        soma[2] = 10;
        int resultado = 0;
        for (int i = 0; i < soma.length ; i ++) {
            resultado = resultado + soma[i];
        }
        System.out.println(resultado);
    }
}
