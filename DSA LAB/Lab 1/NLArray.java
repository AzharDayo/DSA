import java.io.File;  
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class NLArray {

    

        void ExtractBoundries(int arr[][]){
            for(int row = 0 ; row < arr.length ; row++){
                for (int col = 0 ; col<arr[row].length ; col++) {
                    if(row == 0 || row==(arr.length-1) || col ==0 || col==(arr[0].length)-1){
                        System.out.print(arr[row][col]+" ");
                    }
                    else {
                    System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        void CropCenter(int arr[][]){
            for(int row = 0 ; row < arr.length ; row++){
                for (int col = 0 ; col<arr[row].length ; col++) {
                    if(row == 0 || row==(arr.length-1) || col ==0 || col==(arr[0].length)-1){
                       System.err.print(" ");
                    }
                    else {
                        System.out.print(arr[row][col]+" ");
                    }
                }
                System.out.println();
            }
        }

      static void LineEx(String Path,int index , String STR[]){
            try (BufferedReader br = new BufferedReader(new FileReader(Path))) {
                String line;
                while ((line = br.readLine()) != null) { 
                    STR[index++] = line;            
                }
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
        }

    public static void main(String[] args) {
        
        NLArray nl = new NLArray();
        int arr1[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
       System.out.println("Before Boundry Extract");
       for(int row = 0 ; row<arr1.length ; row++){
        for(int col = 0 ; col<arr1[row].length ; col ++){
            System.out.print(arr1[row][col]+" ");
        }
        System.out.println();
       }
       System.out.println();

       System.out.println("After apply Boundry Extract");
       nl.ExtractBoundries(arr1);

       System.out.println("\nAfter Apply center Method");
       nl.CropCenter(arr1);
       







       
        String filePath = "text.txt";
        String STR[] = new String[1000];
        int index = 0;
        NLArray.LineEx(filePath, index, STR);
        System.out.println(STR[10]);
        System.out.println(STR[9]);
        
     
       
         
        
    }
}


 
         
      