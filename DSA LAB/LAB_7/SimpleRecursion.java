import java.util.Scanner;

class SimpleRecursion{

    int i = 0;

   void Acce(int n ){
    if(n<=0)
    return;
    else {
        Acce(n-1);
        System.out.print(n+" ");
    }
   }
    void Dece(int n){
        if(n<=0)
    return;
    else {
        System.out.print(n+" ");
        Dece(n-1);
    }
    }

    void ArrayFor(int a[],int i){
        
        if(i==a.length){
            return ;
        }
        else {
            System.out.print(a[i]+" ");
            ArrayFor( a, i+1);
            
        }
    }
    void ArrayBack(int a[],int i){
        
        if(i==a.length){
            return ;
        }
        else {
            
            ArrayBack( a, i+1);
            System.out.print(a[i]+" ");
        }
    }



    public static void main(String[] args)
    {
        SimpleRecursion sm = new SimpleRecursion();
        Scanner s1 = new Scanner (System.in);
       
        System.out.print("Enter Number : ");
        int k = s1.nextInt();
        System.out.println("Accending Order using Recursion upto : " +k);
        sm.Acce(k);

        System.out.println("\nDecending Order using Recursion upto : " +k);
        sm.Dece(k);

        
        int arr[] = {1,2,3,4,5};

        System.out.println("\nArray Forward Using Recursion.");
        sm.ArrayFor(arr,0);

        System.out.println("\nArray Backward Using Recursion.");
        sm.ArrayBack(arr,0);
    
    }

}