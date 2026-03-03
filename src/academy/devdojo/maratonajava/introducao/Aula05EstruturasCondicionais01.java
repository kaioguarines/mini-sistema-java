package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade =16;
        boolean isAutorizadoCompraBebida = idade >= 18;
        // !

        if(isAutorizadoCompraBebida == false){
            System.out.println("pode comprar bebida alcoolica");
        }else{
            System.out.println("Nao autorizado a comprar bebida alcoolica");
        }
    }
}

