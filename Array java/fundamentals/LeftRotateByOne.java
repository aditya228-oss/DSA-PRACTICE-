//this is optimal solution 
// brute sol will shifting each element in new arr and doing same
//time com in optimal is-o(n)and sc-o(1)
//time com in brute is-o(n)and sc-o(N)
import java.util.Arrays;
import java.util.Scanner;
public class LeftRotateByOne{
    static Scanner SC =new Scanner(System.in);
    public static int  LeftRotateByOne(int n){
        System.out.println("enter elements of array");
        int[]nums=new int[n];   
        for(int i=0;i<nums.length;i++){
            nums[i]=SC.nextInt();
        }
        int first=nums[0];//selecting first element
        for(int i = 1;i<nums.length;i++){
            nums[i-1]=nums[i];//shift of elements to their previous index
        }
        nums[nums.length-1]=first;//shifting first element to last
        System.out.println(Arrays.toString(nums));
        return 0;
    }
    public static void main(String[] args){
        System.out.println(LeftRotateByOne(5));
    }
}



