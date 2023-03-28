import java.util.Scanner;

public class Par_Impar {

    public static void main (String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;

        System.out.println("Quantidade de números  ");
        quantidadeNumeros = sc.nextInt();
        int pares = 0, impares = 0, count = 0;
        
        do{
            System.out.println("Números.. ");
            numero = sc.nextInt();
            count++;

            if(numero % 2 == 0)
            pares++;
            else
            impares++;

        }while(count < quantidadeNumeros);

        System.out.println("Quantidade de números Pares " + pares);
        System.out.println("Quantidade de números Impares " + impares);
    }
    
}
