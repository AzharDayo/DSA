public class Fabonacci {
    
    static void IterativeFabo(int n ){
        int a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<n-1;i++)
        {
            int result=a+b;
            a=b;
            b=result;
            System.out.print(result+" ");
        }
    }
    static int RecuFabo(int n){

        if(n==0 || n==1)
            return n;
        else
        {
            return RecuFabo(n-1)+RecuFabo(n-2);
        }
    }

    public static void main(String[] args) {
        //IterativeFabo(16);
        long startTime = System.nanoTime();	//record the starting time 
        System.out.println("Fabbonaci : "+RecuFabo(6));
        long endTime   = System.nanoTime();	//record the ending time 
        long totalTime = endTime - startTime;//c
        System.out.println("Total Time Using Recursion : "+totalTime);
        
        long startTime2 = System.nanoTime();	//record the starting time 
        IterativeFabo(6);
        long endTime2  = System.nanoTime();	//record the ending time 
        long totalTime2 = endTime2 - startTime2;//c
        System.out.println("\nTotal Time Using Ietrative Approch : "+totalTime);

        if(totalTime>totalTime2){
            System.out.println("Itreative Approch is better ");
        }
        else if (totalTime<totalTime2){
            System.out.println("Recursive Approch is better ");
        }
        else {
            System.out.println("Both Are taken Same time.");
        }
    }
}
 