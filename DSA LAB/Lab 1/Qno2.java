public class Qno2 {
    void noDp(int a[][],int b[]){
        int z=0;
        int num;
        for (int row = 0 ; row<4 ; row++){
            for(int col=0 ; col<5 ; col++ ){
                 num=a[row][col];
                //  System.out.println(num);
                boolean isdup=false;
                for(int i = 0 ;i<20 ;i++){
                    if (num==b[i]) {
                        isdup=true;
                        break;
                    }
                }
                if (!isdup) {
                    
                        b[z++] = num;
            }
        } }}
    public static void main(String[] args) {
        int arr2d[][] = {{1,3,5,7,9},{2,4,6,8,2},{2,3,4,5,6},{3,4,5,6,7,}};
        int arr1d[]=new int[20];

        Qno2 test = new Qno2();
        System.out.println("From 2D array");
        for(int i = 0 ; i <arr2d.length ; i++){
            for(int j = 0 ; j<arr2d[i].length ; j++){
                System.out.print(arr2d[i][j]+"  ");
            }
            System.out.println();
        }
        test.noDp(arr2d, arr1d);
        System.out.println("\nInto Single");
        for(int i=0;i<20;i++){
            if(arr1d[i]==0){
                continue;
            }
            else
            System.out.print(arr1d[i]+" ");
        }
    }
}
