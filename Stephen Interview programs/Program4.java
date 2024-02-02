import java.util.ArrayList;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = in.nextInt();
        String[] a = new String[n];
        System.out.println("Enter elements :");
        in.nextLine();
        for(int i=0 ; i<n ;i++){
            a[i] = in.nextLine();
        }
        System.out.println(groupAnagrams(a));
    }

    private static ArrayList<ArrayList<String>> groupAnagrams(String[] a) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            for(int j=0 ; j<res.size() ; j++){
                String s2 = res.get(j).get(0);
                if(isAnagram(a[i], s2)){
                    res.get(j).add(a[i]);
                    found = true;
                    break;
                }
            }
            if(!found){
                ArrayList<String> aStrings = new ArrayList<>();
                aStrings.add(a[i]);
                res.add(aStrings);
            }
        }
        return res;
    }

    private static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        int[] check = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            check[s1.charAt(i)-'a']++;
            check[s2.charAt(i)-'a']--;
        }
        for(int i : check){
            if(i != 0) return false;
        }
        return true;
    }


}
