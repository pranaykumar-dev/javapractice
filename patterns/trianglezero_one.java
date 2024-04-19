package patterns;
import java.util.*;
public class trianglezero_one {
    public static void zero_one(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }System.out.println();
        }
    }public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the number ");
       int one=sc.nextInt();
       zero_one(one);

    }
    
}
