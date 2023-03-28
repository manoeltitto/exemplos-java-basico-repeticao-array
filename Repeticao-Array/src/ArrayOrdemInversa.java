
public class ArrayOrdemInversa {
    
public static void main(String[] args)  throws Exception{

    int[] vetor = {0, 2, 5, 6, 11, 99};

    for(int i=0; i<vetor.length; i++){
        System.out.println(vetor[i]);
    }
    
System.out.println("");
System.out.println("Ordem Inversa");

    for(int i=vetor.length-1; i>-1; i--){
        System.out.println(vetor[i]);
    }

System.out.println("");
    int count = 0;
    while(count < vetor.length){
        System.out.println(vetor[count]);
        count++;
    }

}
}
