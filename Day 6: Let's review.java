import java.util.*;
public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
      sc.nextLine();
      for(int i=0;i<T;i++){
        String S = sc.nextLine();
        for(int j=0;j<S.length();j+=2)
            System.out.print(S.charAt(j));
        System.out.print(" ");
        for(int j=1;j<S.length();j+=2)
            System.out.print(S.charAt(j)); 
        System.out.print("\n");
      }
    }
}
