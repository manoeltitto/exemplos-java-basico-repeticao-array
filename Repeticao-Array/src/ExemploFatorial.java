
import java.util.Scanner;

public class ExemploFatorial {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite valor para Fatorial; ");
        int numero = sc.nextInt();
        int resultado = 1;

        /*for(int i = 1; i <= numero; i++){
            resultado =  resultado *i;
            System.out.println("i = "+ i+ " Resultado "+resultado);
        }*/ // este exemplo está correto

        for(int i = numero; i > 0; i--){
            System.out.println(resultado + "(i) X "+ i);
            resultado =  resultado *i;
           
        }

      System.out.println(" ");
      System.out.println("Fatorial de " + numero + " = "+ resultado);

    }
    
}