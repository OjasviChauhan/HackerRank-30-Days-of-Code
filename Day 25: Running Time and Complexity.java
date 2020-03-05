import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            for(i=2;i<=n/2;i++){
                if(n%i == 0) break;
            }
            if(i==1+n/2) System.out.println("Prime");
            else System.out.println("Not prime");
        }
    }
}
