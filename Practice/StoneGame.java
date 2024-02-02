import java.util.*;

public class StoneGame {

    public static boolean canWin(int leap, int[] game) 
    {
        // Return true if you can win the game; otherwise, return false.
    	int n = game.length;
    	boolean check = false;
    	for(int i=0; i<n; i++)
    	{
    		if(game[i]==0)
    		{
    			check = true;
    			continue;
    		}
    		else if(game[i]==1)
    		{
    			i--;
    			i = i+leap;
    			if(i<n && game[i]==0)
    			{
    				check = true;
    			}
    			else if(i<n && game[i]==1)
    			{
    				check = false;
    				break;
    			}
    			else if(i>n)
    			{
    				check = true;
    			}
    		}
    	}
    	return check;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

