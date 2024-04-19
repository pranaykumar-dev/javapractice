package patterns;
import java.util.*;

public class floyid_number {
    public static void floyid(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }System.out.println();

        }
    }public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number ");
        int floyid1=sc.nextInt();
        floyid(floyid1);
    }
    
}
