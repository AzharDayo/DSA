public class Factorial {

    static long ItreativeFact(int n ){
        long result=1;
        for ( int i = 1 ; i<=n ; i++ ){
            result *=i;
        }
        return result;
    }
    
    static long RecuFact(int n ){
        
        if (n <=1 ){
            return 1;
        }
        else {
        return n * RecuFact(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 20;

        long startTime = System.nanoTime();
        System.out.println("Factoraial of "+n + " Using Recursive is " + RecuFact(n));
        long endTime   = System.nanoTime();	//record the ending time 
        long totalTime = endTime - startTime;

        long startTime2 = System.nanoTime();	//record the starting time 
        System.out.println("Factoraial of "+n + " Using Itreative is " + ItreativeFact(n));
        long endTime2  = System.nanoTime();	//record the ending time 
        long totalTime2 = endTime2 - startTime2;

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
