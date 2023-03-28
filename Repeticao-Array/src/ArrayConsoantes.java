/* recebe caracterees para preencher um array de 6 pocições
 * e verificar se a letra é vogal ou consoante. 
 * Utilizar equalsIgnoreCase para ignorar 
 */

import java.util.Scanner;

public class ArrayConsoantes {

    public static void main(String[] args) throws Exception{

       Scanner sc = new Scanner(System.in); 

    String[] consoantes = new String[6];
    int quantidadeConsoantes = 0;

    int count = 0;

    do{
        System.out.println("Letra: ");
        String letra = sc.next();

        if(!(letra.equalsIgnoreCase("a")||
             letra.equalsIgnoreCase("e")||
             letra.equalsIgnoreCase("i")||
             letra.equalsIgnoreCase("o")||
             letra.equalsIgnoreCase("u"))){
        consoantes[count] = letra;
        quantidadeConsoantes++;
        }

        count++;
    }while(count < consoantes.length);
    System.out.println("");

    System.out.println("Imprimindo as consoantes..........");
    for(String consoante: consoantes){
        if(consoante != null)
        System.out.print(consoante + " ");
        }
        System.out.println("");

    System.out.println("Quantidade de consoantes : " + quantidadeConsoantes);
    
}
}