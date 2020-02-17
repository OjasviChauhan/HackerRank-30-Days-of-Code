import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long z = factorial(n);
        System.out.print(z);
    }
    static long factorial(int n){
        if(n<=1) return 1;
        else
        return n * factorial(n-1);
    }
}
