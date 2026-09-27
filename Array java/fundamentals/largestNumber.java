import java.util.Scanner;
public class largestNumber{
    static Scanner SC =new Scanner(System.in);
    public static int  largestNum(int n){
        System.out.println("enter elements of array");
        int[]nums=new int[n];
        int max=Integer.MIN_VALUE;   
            for(int i=0;i<nums.length;i++){
                nums[i]=SC.nextInt();
            }
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]>max){
                    max=nums[i];
                }
            }
            System.out.println("largest elements of array");
            return max;
    }
    public static void main(String[] args){
        System.out.println(largestNum(10));
    }

}