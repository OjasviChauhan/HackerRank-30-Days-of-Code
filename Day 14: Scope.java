import java.util.*;
import java.math.*;
class Difference {
  	private int[] elements;
  	public int maximumDifference;
    Difference(int []arr){
        elements = arr;
    }
	void computeDifference(){
        int D=0,max=0;
        for(int i=0;i<elements.length;i++){
            for(int j=i+1;j<elements.length;j++){
                D = Math.abs(elements[i] - elements[j]);
                if(D > max)
                max = D;
            }
        }
        maximumDifference = max;
    }
} 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}
