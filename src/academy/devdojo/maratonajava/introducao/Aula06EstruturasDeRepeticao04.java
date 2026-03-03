package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de  uma moto, descubra em quantas ele pode ser parcelado
    //Condicao valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 16000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+parcela+" R$"+valorParcela);
        }
    }
}
