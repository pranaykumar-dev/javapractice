package sorting;

public class bubble {
    public static void sort(int arr[]) {
        for(int turn=0;turn<arr.length-1;turn++){
            int swap=0;
            for(int j=0;j<arr.length-1-turn;j++){
                //swap
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap++;

            }System.out.println("number of swaps: "+swap);
        }
        
    }public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,5,6,7};
        sort(arr);
        print(arr);
    }
    
}
