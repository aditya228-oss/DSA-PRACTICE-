import java.util.Scanner;
public class linearsearch{
    static Scanner SC =new Scanner(System.in);
    public static int ls(int n){
        System.out.println("enter elements of array");
        int[]nums=new int[n];    
            for(int i=0;i<nums.length;i++){
                nums[i]=SC.nextInt();
            }
        System.out.println("enter target value");
        int target = SC.nextInt();
        System.out.println("target value at index");
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
                        
        }
        return -1;
    }



    public static void main(String[] args){
        System.out.println(ls(10));
    }
}
