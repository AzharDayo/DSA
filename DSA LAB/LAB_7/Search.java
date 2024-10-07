class Search{

    static void IterativeSearch(int n , int a[]){

        for(int i = 0 ; i<a.length ; i++){
            if(n==a[i]){
                System.out.println("Element "+a[i]+" Found at Index : "+i);
                return;
            }
        }
        System.out.println("Element Not Found In Array!");
    }

    public static int recursiveSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return recursiveSearch(arr, target, index + 1);
    }

public static void main(String[] args) {
    int arr[]= {1,2,3,4,5,6,};
    int[] arr2 = {1, 2, 3, 4, 5};
    int target = 3;

    long startTime = System.nanoTime();
    int result = recursiveSearch(arr, target, 0);
    long endTime = System.nanoTime();
    long totaltime = endTime - startTime;
    if (result != -1) {
        System.out.println("Element found at index: " + result);
    } else {
        System.out.println("Element not found.");
    }

  

    long startTime2 = System.nanoTime();
    IterativeSearch(3,arr);
    long endTime2 = System.nanoTime();
    long totaltime2 = endTime2 - startTime2;
        
        
    if(totaltime>totaltime2){
        System.out.println("Itreative Approch is better ");
    }
    else if (totaltime<totaltime2){
        System.out.println("Recursive Approch is better ");
    }
    else {
        System.out.println("Both Are taken Same time.");
    }

}



}