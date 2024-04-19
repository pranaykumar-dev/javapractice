package basics;
import java.util.*;

public class Basics {
    public static int multiply (int a1,int b1){
        int c = a1 *b1;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a ");
        int pro =multiply(21,76);
        System.out.println("a*b is="+pro);
         
        int a = sc.nextInt();
        System.out.print("enter b ");
        int b = sc.nextInt();
        math a1 =new math();
        System.out.println("add of a,b = "+a1.add(a,b));
        System.out.print("enter m ");
         
        int m = sc.nextInt();
        System.out.print("enter n ");
        int n = sc.nextInt();
        diff d1 = new diff();
        System.out.println("sub of m,n is = "+d1.sub(m,n));
        
    }
}class math{
    int add(int a,int b){
        int c= a + b;
        return c;

    }
}class diff{
    int sub(int m,int n){
        int o = m - n;
        return o;

    }
}
