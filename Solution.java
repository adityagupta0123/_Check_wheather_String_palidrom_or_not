import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char c;
        String r=Character.toString(A.charAt(A.length()-1));
        for(int i=A.length()-2;i>=0;i--){
            r=r+A.charAt(i);
        }
        if(A.compareTo(r)==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
