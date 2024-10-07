import java.util.Stack;
public class Balanced_Brackets {
    
    boolean Is_Banlaced( String s1 ) {
        Stack <Character> stack = new Stack<>();

        char c1 [] = s1.toCharArray();
        for(char k : c1){
            if(k == '(' || k == '{'  || k =='['){
                stack.push(k);
            }
            else if (k == ')' || k == '}'  || k ==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char t = stack.pop();
                if((k ==')' && t != '(') || (k =='}' && t != '{') || (k ==']' && t != '[')){
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}



class Main{
    public static void main(String[] args) {

        Balanced_Brackets b1 = new Balanced_Brackets();
        String input = "({[a+b]+c}-1)";
    
        boolean result = b1.Is_Banlaced(input);

        System.out.println("Is the input String Balanaced : "+result);


    }
}