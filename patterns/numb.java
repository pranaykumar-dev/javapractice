package patterns;
import java.util.*;
public class numb {
    public static void number(int n){
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }System.out.println();
        } 
    }public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");

        int number1=sc.nextInt();
        number(number1);


    }
    
}
