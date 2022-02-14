import java.util.Scanner;

public class CheckString {

    public static boolean containsAllLetters(String str){
        StringBuilder sb = new StringBuilder();
        sb.append("abcdefghijklmnopqrstuvwxyz");

        String[] s = str.split("");

        for(int i=0;i<str.length();i++){
            if(sb.indexOf(s[i])!=-1){
                int index=sb.indexOf(s[i]);
                sb.replace(index,index+1,"");
            }
            else{
                continue;
            }
        }

        if(sb.toString().length()==0){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        input = input.toLowerCase().replace(" ","");
        System.out.println(containsAllLetters(input));
    }
}

//Time complexity : O(n)
//Space Complexity : O(n)