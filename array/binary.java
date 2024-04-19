package array;

public class binary {
    public static int bin(int number[], int key) {
        
    
        int start=0; int end=number.length-1;
        while(start<=end){
            int mid = (start+end)/2; 
            if(number[mid] == key){
                return mid; 
                 
            }else if(number[mid] < key){
                start= mid +1;
            }else{  
                end= mid -1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,6,8};
        int key=21;
        System.out.println( "at the index: "+bin(number, key));
    }
}   

