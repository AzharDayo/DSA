class Qno1{

    public static void Arrange(int a []){
        int tempod=0;
        int tempev = 0;

        int odd[] = new int[a.length];
        int even[] = new int[a.length];

        for(int i=0 ; i<a.length; i++){
            if (a[i]%2==0){
                even[tempev++]=a[i];
            }
            else if (a[i]%2==1){
                odd[tempod++]=a[i];
            }
        }
        for (int b=0;b<odd.length ; b++)
        {   if(odd[b]==0){
            continue;
        }
            System.out.print(odd[b]+" ");
            }
        for (int c=0;c<even.length ; c++)
        {   if(even[c]==0){
            continue;
        }
            System.out.print(even[c]+" ");
        }}}
class Main{
    public static void main(String[] args) {
        
        Qno1 test = new Qno1();
        int Array[]={1,2 ,3 ,5, 7 ,2 ,2, 7, 8, 9};
        System.err.println("input");
        for (int i : Array) {
            System.out.print(i+" ");
        }
        System.out.println("\noutput");
        test.Arrange(Array);    
      }
}