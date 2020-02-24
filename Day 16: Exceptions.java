import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            int z = Integer.parseInt(S);
            System.out.println(z);
        }
        catch(Exception e){
            System.out.println("Bad String");
        }
    }
}
