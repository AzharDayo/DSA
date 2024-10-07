import java.lang.Math;
public class Sorting {
    
    void SELECTION_SORTING(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; 
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    void INSERTION_SORT(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    
    void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
    class Main{
        public static void main(String[] args) {
            Sorting s1 = new Sorting();
            int array[]={5,1,2,6,3,7,4,8};
            int array2[]={5,1,2,6,3,7,4,8};
            System.out.println("Original Array");
            s1.print(array);
            System.out.println("\nOriginal Array After Apply Selection Sort.");
            s1.SELECTION_SORTING(array);
            s1.print(array);
            System.out.println("\n\nOriginal Array");
            s1.print(array2);
            System.out.println("\nOriginal Array After Apply Insertion Sort.");
            s1.INSERTION_SORT(array2);
            s1.print(array);
            System.out.println();
       
       
       
        }}

    
            

