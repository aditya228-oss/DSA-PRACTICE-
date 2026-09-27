//if rotating number is greater then arr length then (rotating number)%arr.length 
//in brute apporach-we will store first k element of array in temp arr and then we will shift remaining elements using loop and then we will insert element from temp arr to shifted arr
//in optimal apporach we reverse twise 
// let suppose arr-[1,2,3,4,5,6,7] and k=3
// then reverse it in two parts [1,2,3]and [4,5,6,7]
// result-[3,2,1,7,6,5,4]
//then again reverse whole array now
//result -[4,5,6,7,1,2,3]-done
//time c-o(2n)and sc-(1)
//for brute tc-o(n)and sc-o(n)
// reverse an array code 
        // int[] arr = {1, 2, 3, 4, 5};

        // int left = 0;
        // int right = arr.length - 1;

        // while (left < right) {
        //     int temp = arr[left];
        //     arr[left] = arr[right];
        //     arr[right] = temp;

        //     left++;
        //     right--;
        // }

import java.util.Arrays;
import java.util.Scanner;
public class LeftRotateByK{
    static Scanner SC =new Scanner(System.in);
    public static void LeftRotateByk(int n){
        System.out.println("enter elements of array");
        int[]nums=new int[n];   
        for(int i=0;i<nums.length;i++){
            nums[i]=SC.nextInt();
        }
        System.out.println("enter number of element to rotate");
        int k=SC.nextInt();
        k=k%nums.length;
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
      
    }
    public static void reverse(int[] nums,int left,int right){
        while (left < right) {
             int temp = nums[left];
             nums[left] = nums[right];
             nums[right] = temp;
            left++;
            right--;
         }
    }
    public static void main(String[] args){
        LeftRotateByk(5);
    }
}

    

