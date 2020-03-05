import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[3];
        int D[] = new int[3];
        for(int i=0;i<3;i++)
            A[i] = sc.nextInt();
        for(int i=0;i<3;i++)
            D[i] = sc.nextInt();

        if(A[2] < D[2]) System.out.println(0);
        else if(A[2] == D[2]){
            if(A[1]<D[1]) System.out.println(0);
            else if(A[1] == D[1]){
                if(A[0] <= D[0]) System.out.println(0);
                else System.out.println(15 * (A[0]-D[0]));
            }
            else System.out.println(500 * (A[1]-D[1]));
        }
        else System.out.println(10000);
    }   
}
