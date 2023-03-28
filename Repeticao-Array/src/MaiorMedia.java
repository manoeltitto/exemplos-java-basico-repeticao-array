import java.util.Scanner;

public class MaiorMedia {
     public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    int numero;
    int count =  0;
    int maiorValor = 0;
    float somaMedia = 0;

    do{
    System.out.println("Digite um valor... ");
    numero = sc.nextInt();
    count++;
    somaMedia += numero;
    if(numero > maiorValor) 
    maiorValor = numero;

    }while(count < 5);
    System.out.println("Maior valor digitado: " + maiorValor);
    System.out.println("Soma dos valores digitados: " + somaMedia);
    System.out.println("Média dos valores digitados: " + somaMedia/count);
}
}
