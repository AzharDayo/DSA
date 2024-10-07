public class FirstSingleLatter {
    
    char CheckFirstSingleLatter(char  text[] ){
        final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        int count [] = new int [26];

        for (char c : text) {
           
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;  
            }
        }

        for (char c : text) {
            if (c >= 'a' && c <= 'z' && count[c - 'a'] == 1) {
                return c;  
            }
        }
        return'\0';

    }

    public static void main(String[] args) {

        FirstSingleLatter f1 = new FirstSingleLatter();
        final char arr[] = {'a','l','g','o','r','i','t','h','m'};
        System.out.println(f1.CheckFirstSingleLatter(arr));

    }
}
