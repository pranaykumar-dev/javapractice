package array;
import java.util.*;

public class get {
    public static int getlargest(int number[]) {
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest =Integer.MAX_VALUE; //+infinity
        for(int i=0;i < number.length;i++){
            // for largest
            if(largest < number[i]){
                largest = number[i]; 


                //for smallest
            }if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println(+smallest);
        return largest;
        
    }
    public static void main(String[] args) {
        int number[] = {1,3,5,8};
        System.out.println(getlargest(number));

    }
    
}
