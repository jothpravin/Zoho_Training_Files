import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String s = in.nextLine().toLowerCase();
        String res = getOccurrenceString(s);
        //String res = getOccurrence(s);
        //String res = getOccurrenceString1(s);
        System.out.println(res);
    }

    private static String getOccurrenceString(String s) {
        String res = "";
        for (int i = 0; i < s.length() ; i++) {
            boolean found = false;
            for (int j = 0; j < res.length() ; j+=2) {
                if(res.charAt(j) == s.charAt(i)){
                    res = res.substring(0, j+1) + (char)(res.charAt(j+1)+1) + res.substring(j+2);
                    found = true;
                    break;
                }
            }
            if(!found)   res = res + s.charAt(i) + "1";
        }
        return res;
    }

   
    private static String getOccurrence(String s){
        String res = "";
        while(!s.equals("")) {
            int n = s.length();
            char c = s.charAt(0);
            s=s.replace(s.charAt(0)+"", "");
            int count = s.length();
            res = res + c + (n-count);
        }
        return res;
    }   

}