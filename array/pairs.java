package array;

public class pairs {
    public static void pair(int numbers[]){
        int tp=0;
        for (int i=0;i<numbers.length;i++){
             
            int current=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                 
                System.out.print("("+current+","+numbers[j]+")");
                tp++;
            }System.out.println();
             

        }System.out.println(tp);
         
        
    }
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6};
        pair(numbers);
         
    }
    
}
