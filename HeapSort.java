public class HeapSort {
    public static void main(String[] args) {
        
    }
    public static void heapSort(int[] arr) {
        for (int i = arr.length/2-1; i >=0; i--) {
        } 
        for (int i = arr.length-1; i > 0 ; i--) {
            int temp = arr[0];
            arr[0] = arr [i];
            arr[i] = temp;
        }
    }        
}