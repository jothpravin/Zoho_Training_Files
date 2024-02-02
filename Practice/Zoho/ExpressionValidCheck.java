import java.util.*;

public class ExpressionValidCheck 
{
    public static void main(String[] args) 
    {
        String inputSentence = "((a&&b)(c&d))";
        
        char[] arr = inputSentence.toCharArray();
        
        //System.out.println(Arrays.toString(arr));
        
        int[] check = new int[arr.length];
        int j=0;
        boolean flag = true;
        
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] == '(')
            {
               //System.out.println((j-1)+" ");
               check[j++] = 1; 
            }
            else if((arr[i] >= 'a' && arr[i] <= 'z'))
            {
                continue;
            }
            else if((arr[i] == '&' || arr[i] == '|') && !isValid(arr, i, arr[i]))
            {
                flag = false;
            }
            else if(arr[i] == ')' && check[j-1]==1 && j>0)
            {
                check[j-1] = 0;
                j--;
            }
        }
        
        //System.out.println(checkarr(check)+" "+flag+" "+j);
        if(checkarr(check) && flag)
        {
            System.out.print("Valid String :"+inputSentence);
        }
        else
        {
            System.out.print("Invalid String");
        }
        
        //System.out.print(Arrays.toString(check));
        
        
        
    }
    
    private static boolean checkarr(int [] arr)
    {
        for(int c : arr)
        {
            if(c==1)
                return false;
        }
        return true;
    }
    
    private static boolean isValid(char []arr, int index, char value)
    {
        if (index > 0 && index < arr.length - 1) 
        {
            char prevChar = arr[index - 1];
            char nextChar = arr[index + 1];
            return (Character.isLetter(prevChar) || prevChar == value )&&
                    (Character.isLetter(nextChar) || nextChar == value);
        }
        return false;
    }

}

