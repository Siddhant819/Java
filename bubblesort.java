package sorting;

public class bubblesort {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String[] args) {
    int arr[]={11,9,2,5,3};

    //bubblesort
    for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-1; j++){
            if(arr[j]>arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;
            }
        }
    }
 printArray(arr);   
}
    
}