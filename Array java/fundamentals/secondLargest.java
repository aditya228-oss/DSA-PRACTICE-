// largest value is replaced by second largest as largest go up
// else if statement check there is no duplication of largest element in slargest
//if all element of array is same means no second largest value will return -1
// simalar approach for second smallast
// this is optimal apporach
//the brute force approach will first find largest through first loop and then again loop with if arr!=largest and slargest=arr[i]

import java.util.Scanner;
public class secondLargest{
    static Scanner SC =new Scanner(System.in);
    public static int  secondlargestNum(int n){
        System.out.println("enter elements of array");
        int[]nums=new int[n];   
            for(int i=0;i<nums.length;i++){
                nums[i]=SC.nextInt();
            }
          int largest =nums[0];
        int slargest=-10001;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                    slargest=largest;
                    largest=nums[i];
                    
            }
            else if(nums[i] != largest && nums[i]>slargest){
                 slargest=nums[i];
            }
           
            }
            System.out.println("second largest elements of array");
            if(slargest == -10001){
                return -1;
 
        }
        else{
            return slargest;
        }
    }
    public static void main(String[] args){
        System.out.println(secondlargestNum(10));
    }
}