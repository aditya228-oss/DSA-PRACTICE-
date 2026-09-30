// this array is sorted
// [1,1,2,2,2,3,3]
// in this arr we check the next element is equivalent or unique 
// if it is equivalent move pointer to next 
// if unique then it will take the next position of i index
// and in this itration we will try to collect unique elements and 
// and place in next positions
// isme agar 1 ka next element bhi 1 hai to aage baad jayege
//aur fir next element 2 hai jo ki 1 ke equvalent nahi hai 
// to 2 ko 1 ki bagal wali position me fit kardenge
// and repeat for whole array
import java.util.Arrays;
import java.util.Scanner;
public class removeduplicate{
    static Scanner SC =new Scanner(System.in);
    public static void removeduplicate(int n){
        System.out.println("enter elements of array");
        int[]nums=new int[n];   
        for(int i=0;i<nums.length;i++){
            nums[i]=SC.nextInt();
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];// swapping if we find unique element next to i position
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));// arr after removal
        System.out.println(i+1);// length of array after removal
    }
    public static void main(String[] args){
            removeduplicate(8);
    }
}


