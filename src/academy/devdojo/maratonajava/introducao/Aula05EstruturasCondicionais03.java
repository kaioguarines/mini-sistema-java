package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3500;
        double procentagem = (salario >= 5000) ? 0.27 : 0.15;
        double imposto = salario * procentagem;
        // (condicao) ? verdadeiro : falso

        System.out.println("Voce pagara R$ "+ imposto +" de imposto");
    }
}
