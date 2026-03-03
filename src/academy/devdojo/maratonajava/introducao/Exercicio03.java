package academy.devdojo.maratonajava.introducao;

public class Exercicio03 {
    public static void main(String[] args) {
        double valorCompra = 120.0;
        boolean clienteVip = true;
        double desconto20 = 20.0;
        double desconto10 = 10.0;
        double desconto5 = 5.0;
        double valorFinal;
        if (valorCompra >= 100) {
            if (clienteVip) {
                valorFinal = valorCompra - (valorCompra * (desconto20 / 100));


            } else {
                valorFinal = valorCompra - (valorCompra * (desconto10 / 100));

            }
            System.out.println(valorFinal);


        } else {
            if (clienteVip) {
                valorFinal = valorCompra - (valorCompra * (desconto5 / 100));
            } else {
                valorFinal = valorCompra;
            }
            System.out.println(valorFinal);
        }
    }
}
