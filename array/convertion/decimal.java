package convertion;
public class decimal {
    public static void bin(int n) {
        int mybin=n;
        int pow=0;
        int bin1 =0;
        while(n > 0){
            int rim = n%2;
            bin1=bin1+(rim * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }System.out.println(mybin+"  "+bin1);
        
    }public static void main(String[] args) {
        bin(2);
         
    }
    
}
