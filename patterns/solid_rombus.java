package patterns;
import java.util.*;

public class solid_rombus {
    public static void rombus(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");

            }
            for(int j=1;j<=n;j++){
                System.out.print("*");

            }System.out.println();
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the value ");
       int a =sc.nextInt();
       rombus(a);

    }
    
}
