import java.util.Scanner;

public class TabuadaFor {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Valor para tabuada ");
         int valor = sc.nextInt();

         for(int i = 0; i < 11; i++){
       
         System.out.println(i + " X " + valor +  " = " + valor * i);
         }
    }
    
}
