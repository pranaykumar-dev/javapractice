package sorting;

public class selectionsort { 
    public static void select(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i]=temp;
            
        }
    }public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={2,8,9,6,0};
        select(arr);
        print(arr);
    }
    
}
