public class SELECTION_SORT {
    
    void SORTING(int arr[]){
        for(int i=0 ; i<arr.length;i++){
            int min=arr[0];
            for(int j = 0 ; j<arr.length;j++){
                if (arr[j]<min){
                    min=arr[j];
                }
            }
            arr[i]=min;

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
            int array[]={5,1,2,6,3,7,4,8};
            SELECTION_SORT s1 = new SELECTION_SORT();
            s1.SORTING(array);
            s1.print(array);
    
            
        }
    }
