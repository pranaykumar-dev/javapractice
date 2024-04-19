package array;

public interface kadone {
    public static void kadones(int number[]){
        int ms=Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int cs=0;

        for(int i=0;i<number.length;i++){  
            if(small>number[i]){
                small=number[i];
            }System.out.println("smallest"+small);
            cs= cs+number[i];
            if(cs <0 ){
                cs = 0;

            }ms=Math.max(cs,ms);

        } System.out.println("max sum is: "+ms);
    }public static void main(String[] args) {
        int number[]={-1,-2 };
        kadones(number);
    }
    
}
