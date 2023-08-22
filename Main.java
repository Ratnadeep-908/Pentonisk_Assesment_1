import java.util.*;
import java.lang.*;
import java.io.*;
class Main 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        sc.close();
        Main ob = new Main();
        System.out.println(ob.length(s));
    }
    public int length(String s) 
    {

        int n = s.length();
 
        int a = 0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i; j < n; j++) 
            {
                if (check(s, i, j)) 
                {
                    a = Math.max(a, j - i + 1);
                }
            }
        }
 
        return a;
    }
    boolean check(String s, int start, int end) 
    {
        int[] chars = new int[128];
 
        for (int i = start; i <= end; i++) 
        {
            char c = s.charAt(i);
            chars[c]++;
            if (chars[c] > 1) 
            {
                return false;
            }
        }
        return true;
    }
}