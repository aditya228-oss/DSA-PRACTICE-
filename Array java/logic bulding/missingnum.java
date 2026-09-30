// in this problem we have to find missing num in between 0 to n
// arr size is n
// summation of n number is (n*(n+1))/2
// we take total and sum all element of arr and then 
// subtract and get the missing number
// brute and better also exist by 2  loops and hashing

import java.util.Scanner;
public class missingnum{
    static Scanner SC =new Scanner(System.in);
    public static void  removeduplicate(int n){
        System.out.println("enter elements of array");
        int[]nums=new int[n];   
        for(int i=0;i<nums.length;i++){
            nums[i]=SC.nextInt();
        }
        int m=nums.length;
        int total=(m*(m+1))/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int missing=total-sum;
       System.out.println(missing);
    }
    public static void main(String[] args){
            removeduplicate(8);
    }
}


