// this is optimal approach in this we use two pointer 
// in this if we get a non zero number we swap it by nums[zero]
// supposse an array [0,2,0,3] here zero is 0 and starting loop
// there will no swap and i=1 and zero=0
// now we find a non zero num then we will swap nums[current] and nums[zero]
// updated arrar will [2,0,0,3]and now i=3 and zero=2
//and it will cont. until all zero reachs to end 
// tc-O(n) and sc-O(1)
import java.util.Arrays;
import java.util.Scanner;
public class movezerotoend{
    static Scanner SC =new Scanner(System.in);
    public static void LeftRotateByk(int n){
        System.out.println("enter elements of array");
        int[]nums=new int[n];   
        for(int i=0;i<nums.length;i++){
            nums[i]=SC.nextInt();
        }
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int a=nums[i];
                nums[i]=nums[zero];
                nums[zero]=a;
                zero++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args){
        LeftRotateByk(5);
    }
}
//in brute approach we will store all non zero element in temp arr and then append all zero at last and make same length as nums
//better sol. also exist



