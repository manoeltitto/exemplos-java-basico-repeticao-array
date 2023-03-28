import java.util.Scanner;

public class ExemploWhile_1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Digite o nome: ");
            nome = sc.next();

            if(nome.equals("0"))
            break;

            System.out.println("Digite idade:");
            idade = sc.nextInt();

        System.out.println("");
        System.out.println("Imprimindo dados");
        System.out.println(nome);
        System.out.println(idade);
        }
        

    }
}
