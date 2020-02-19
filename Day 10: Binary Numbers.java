import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] binaryNum = new int[1000];
        int i = 0; 
        while (n > 0)  
        {  
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        }
        int maxCount=1,count=1;
        for(int j=0;j<binaryNum.length-1;j++){
            if(binaryNum[j] != binaryNum[j+1] && binaryNum[j] == 0) 
            {
                if(count > maxCount)
                    maxCount = count;
                count = 1;
                continue;
            }
            else if(binaryNum[j] == binaryNum[j+1] && binaryNum[j] == 1) 
                count++;   
        }
        if(count > maxCount)
            System.out.print(count);
        else
            System.out.print(maxCount);
    }
}
