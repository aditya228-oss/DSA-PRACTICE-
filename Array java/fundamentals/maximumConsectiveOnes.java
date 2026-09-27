//understand Math.max operation is imp
//in this problem only array of 1's and 0's is present
// have to find maximum how many ones come in continuos 

import java.util.Scanner;
public class maximumConsectiveOnes{
    static Scanner SC =new Scanner(System.in);
    public static int  maximumConsectiveOnes(int n){
        System.out.println("enter elements of array");
        int[]nums=new int[n];   
        for(int i=0;i<nums.length;i++){
            nums[i]=SC.nextInt();
        }
        int count=0;
        int max=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;
            }
        }
        System.out.println("max consective ones are");
        return max;
        
    }
    public static void main(String[] args){
        System.out.println(maximumConsectiveOnes(10));
    }
}




