
import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args){

Random random = new Random();

int[] numerosAleatorios = new int[20];

for(int i = 0; i < numerosAleatorios.length; i++ ){
    int numero = random.nextInt(100);
    numerosAleatorios[i] = numero;
}

for(int aleatorios: numerosAleatorios)
System.out.print(" " + aleatorios);


System.out.println(" ");
System.out.println("Sucessores dos Números......");

for(int aleatorios: numerosAleatorios)
System.out.print(" "+ (aleatorios + 1));



    }
    
}
