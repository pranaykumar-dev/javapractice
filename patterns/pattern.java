package patterns;
import java.util.*;
public class pattern {
    public static void hollow_rectangle(int rows, int colms){
        //outer loop
        for (int i=1;i<=rows;i++){
            //inner loop
            for(int j=1;j<=colms;j++){
                if ( i==1|| i==rows||j==1||j==colms) {
                   System.out.print("*"); 
                }else{
                    System.out.print(" ");
                 }
            }System.out.println();
        }
 
    }
    public static void inverted_rectangle(int n){
        //outer bounders
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
                //stars
            }for(int j=1;j<=i;j++){
                System.out.print("*");

            }System.out.println();
 
        } 
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows you want to print =");

        int hollow_rectangle1= sc.nextInt();
        System.out.print("enter the colums you want to =");
        int hollow_rectangle2=sc.nextInt();
        hollow_rectangle(hollow_rectangle1,hollow_rectangle2);

         
        System.out.print("enter the n value= ");
        int inverted_rectangle1 = sc.nextInt();
        System.out.println(inverted_rectangle1); 
        inverted_rectangle(inverted_rectangle1);
    }
    
}
