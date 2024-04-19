package array;
import java.util.*;
public class subarray{
 
    public static void sub(int n[]) {
       int ts=0;
        for(int i =0; i<n.length; i++){
            int start = i;
            for(int j=i; j<n.length; j++){
                 
                int end = j;
                for(int k=start; k<=end; k++){

                    System.out.print(n[k]+" ");

                }System.out.println();

            }  System.out.println();  
            ts++; 


        } System.out.println("total="+ts);
        
    }

    public static void main(String args[]) {
        int n[]={1,5,10,15,20};
         
        sub(n);
    }
}

