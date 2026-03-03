package academy.devdojo.maratonajava.introducao;

public class Exercicio01 {
    public static void main(String[] args) {
        double nota = 7.0;
        int presenca = 76;
        String resultado;

        if (nota < 0 || nota > 10) {
            resultado = "Nota invalida";
        } else if (presenca < 0 || presenca > 100) {
            resultado = "Presenca invalida";
        } else if (nota >= 7 && presenca >= 75) {
            resultado = "Aprovado";
        } else if (nota >= 5 && nota < 7 && presenca >= 75) {
            resultado = "Recuperacao";
        } else {
            resultado = "Reprovado";
        }

        System.out.println(resultado);
    }
}
