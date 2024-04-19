package sorting;

public class insertion {
    public static void insert(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev = i-1;
            //finding correct posstion
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1]=arr[prev];
                prev--;
            }arr[prev+1]=curr;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }public static void main(String[] args) {
        int arr[]={8,9,4,3,2,6};
        insert(arr);
        print(arr);
    }
    
}
