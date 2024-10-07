public class ICom {
    
    static void Four(int arr[]){
      
        if(arr[0]>arr[1])
        {
            int temp = arr[0];
            arr[0]=arr[1];
            arr[1]=temp;
        }

        if(arr[1]>arr[2])
        {
            int temp = arr[1];
            arr[1]=arr[2];
            arr[2]=temp;
        }
        if(arr[1]>arr[3])
        {
            int temp = arr[1];
            arr[1]=arr[3];
            arr[3]=temp;
        }
        if(arr[2]>arr[3])
        {
            int temp = arr[2];
            arr[2]=arr[3];
            arr[3]=temp;
        }
        if(arr[0]>arr[1])
        {
            int temp = arr[0];
            arr[0]=arr[1];
            arr[1]=arr[0];
        }

        }
    

    
    
    static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    


        public static void main(String[] args) {
            int array[]={5,1,2,6};
            Four(array);
            print(array);
           
    
            
        }
    }
