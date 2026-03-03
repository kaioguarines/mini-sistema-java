package academy.devdojo.maratonajava.introducao;

public class Exercicio02 {
    public static void main(String[] args) {
        int idade = 17;
        boolean temCarteira = true ;

        String resultado ;

        if (idade >= 18) {
            if (temCarteira ) {
                resultado = "Pode dirigir";
            } else {
                resultado = "Precisa tirar habilitacao";
            }
        }else {
            resultado = "Menor idade";
        }
        System.out.println(resultado);
    }
}
