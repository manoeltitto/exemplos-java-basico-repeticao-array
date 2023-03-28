import java.util.Scanner;

/*Este é o exemplo que teste while vazio */

public class ExemploWhile_2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Digite o nome: ");
            nome = sc.nextLine(); //Essa linha precisa do comando nextLine 

            if(nome.isEmpty()){
            System.out.println("Encerrado programa linha vazia");
            break;
            }

            System.out.println("Digite idade:");
            idade = sc.nextInt();

        System.out.println("");
        sc.nextLine();//Esse nextLine() garente o consumo da linha deixada peo nextIntm
        
        }
        

    }
}
