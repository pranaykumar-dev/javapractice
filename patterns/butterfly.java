package patterns;
import java.util.*;
public class butterfly {
    public static void butter(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                //print star
                System.out.print("*");
            }
            // space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();

            //2nd half
        }for(int i=n;i>=1;i--){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();

        }
    }public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the input =");
        int butter1=sc.nextInt();
        butter(butter1);
         
    }    
    
}
