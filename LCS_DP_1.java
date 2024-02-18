import java.util.*;
import java.io.*;

public class LCS_DP_1
{
    public static void LCS(String s1,String s2,int[][] b,char[][] c,String[][] s)
    {
        for(int i=1;i<=s1.length();i++)
        {
            for(int j=1;j<=s2.length();j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    s[i][j] = s[i-1][j-1]+s2.charAt(j-1);
                    b[i][j] = b[i-1][j-1]+1;
                    c[i][j] = '\\';
                }
                else if(b[i-1][j]>=b[i][j-1])
                {
                    s[i][j] = s[i-1][j];
                    b[i][j] = b[i-1][j];
                    c[i][j] = '^';
                }
                else{
                    s[i][j] = s[i][j-1];
                    b[i][j] = b[i][j-1];
                    c[i][j] = '<';
                }
            }
        }
    }
    public static void main(String[] args)
    {
        try{
            Scanner sc = new Scanner(new File("/Users/CHaran/OneDrive/Desktop/UTA/DAA/Assignments/CSE5311-11-P2-Java-1002121090-1002111813/LCS1.txt"));
            String[] strings = new String[2];
            int k=0;
            while(sc.hasNextLine())
            {
                if(k>=2)
                {
                    throw new Exception("Only two strings need to be provided");
                }
                strings[k++] = sc.nextLine();
            }

            int[][] b = new int[strings[0].length()+1][strings[1].length()+1];
            char[][] c = new char[strings[0].length()+1][strings[1].length()+1];
            String[][] s = new String[b.length][b[0].length];
            for(int i=0;i<s.length;i++)
            {
                for(int j=0;j<s[0].length;j++)
                {
                    s[i][j]="";
                }
            }

            long startTime = System.nanoTime();
            LCS(strings[0],strings[1],b,c,s);
            long endTime = System.nanoTime();
            System.out.print("\n\t");
            for(int i=0;i<=strings[1].length();i++)
            {
                if(i==-1)
                {
                    System.out.print("\t");
                }
                if(i==0)
                {
                    System.out.print("  Y\t");
                }
                else{
                    System.out.print("  "+strings[1].charAt(i-1)+"\t");
                }
            
            }
            System.out.println();
            for(int i=0;i<b.length;i++)
            {
                for(int j=-1;j<b[i].length;j++)
                {
                    if(j==-1)
                    {
                        
                        if(i==0)
                        {
                            System.out.print("X\t");
                        }
                        else{
                            System.out.print(strings[0].charAt(i-1)+"\t");
                        }
                    }
                    else{
                        System.out.print(c[i][j]+" "+b[i][j]+"\t");
                    }
                }
                System.out.println();
            }
            System.out.println("\nTime taken to find Longest Common Subsequence is "+(endTime-startTime)+" nano seconds.");
            System.out.println("\nLength of the Longest Common Subsequence is: "+b[strings[0].length()][strings[1].length()]);
            System.out.println("\nThe Longest Common Subsequence of \""+strings[0]+"\" and \""+strings[1]+"\" is \""+s[strings[0].length()][strings[1].length()]+"\"");
        }   
        catch(Exception e)
        {
            e.printStackTrace();
        }     
    }
}