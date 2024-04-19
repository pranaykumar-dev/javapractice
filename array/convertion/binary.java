package convertion;
 public class binary {
    public static void dec(int bin){
        int mynum = bin;
        int pow=0;
        int dec=0;
        while(bin>0){
            int lastdig = bin%10;
            dec =dec +(lastdig *(int) Math.pow(2,pow));
            pow++;
            bin=bin/10;
            
        }System.out.println("the decimal of "+mynum+" is "+dec);
    } 
    public static void main(String[] args) {
        dec(11);
    }
}
