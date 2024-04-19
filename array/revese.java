package array;
import java.util.*;

 

public class revese {
    public static void rev(int numbers[]) {
        int f=0; int l=numbers.length-1;
        while(f<l){
            int temp = numbers[f];
            numbers[f]=numbers[l];
            numbers[l]= temp;
            f++;
            l--;
        }
        
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        rev(numbers);
        for(int i=0;i<=numbers.length-1;i++){
            System.out.print(numbers[i]+"  ");

        }System.out.println();
        
    }
    
}
