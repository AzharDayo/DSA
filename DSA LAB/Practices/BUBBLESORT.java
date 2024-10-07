class BUBBLESORT{

    void BUBBLE(int a[]){

        for (int i = 0 ; i<a.length;i++){
            for (int j = 0 ; j<a.length-1-i; j++){
        
                if(a[j]>a[j+1]){
                 int temp = a[j];
                 a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    }

    void BUBBLE_EFFI(int a[]){

        for (int i = 0 ; i<a.length;i++){
            boolean check = true;
            for (int j = 0 ; j<a.length-1-i; j++){
                
                if(a[j]>a[j+1]){
                 int temp = a[j];
                 a[j]=a[j+1];
                a[j+1]=temp;
                check=false;
            }
            }
            if(check){
                break;
        }
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
        int array[]={1,4,2,5,3,2,6,1,4,2,5,3,2,6};
        BUBBLESORT s1 = new BUBBLESORT();
        s1.BUBBLE_EFFI(array);
        s1.print(array);

        
    }
}