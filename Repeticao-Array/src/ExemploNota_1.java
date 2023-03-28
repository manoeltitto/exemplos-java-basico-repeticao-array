import java.util.Scanner;

public class ExemploNota_1 {

    public static void main(String[] args)throws Exception{

        Scanner sc = new Scanner(System.in);

        int  nota = 0;
        System.out.println("Digite nota: ");
        nota = sc.nextInt();

            while(nota < 0 || nota > 10){
                System.out.println("Digite uma nota válida..... ");
                nota = sc.nextInt();
            }


    }
   
}
