//a element is said to leader if after that element all element is smallar
//let an arr=[2,3,7,5,3,9,8] so leaders are[9,8]
//here 9 and 8 are leader because after 9 each element is smaller than 9
//similar for 8
//brute approach also exist
//optimal apporach will
//we reverse itrate the array and select last element as leader and start moving
//check
//then element which is greater than previous elements then it will be a leader 
//and we will update our max
//add them in an arr
import java.util.*;
public class leader{
    static Scanner SC =new Scanner(System.in);
    public static List<Integer> leaders(int n){
         System.out.println("enter elements of array");
        int[]nums=new int[n];   
        for(int i=0;i<nums.length;i++){
            nums[i]=SC.nextInt();
        }
         if (n == 0) {
            return new ArrayList<>();
        }
        ArrayList<Integer>lead=new ArrayList<>();
        int leader=nums[n-1];
         lead.add(leader);
        for(int i=n-2;i>=0;i--){
            if(nums[i]>leader){
                lead.add(nums[i]);
                leader=nums[i];
            }
        }
        Collections.reverse(lead);// to print in reverse order
        System.out.println(lead);
        return lead;
    }
    public static void main(String[] args){
        leaders(10);
    }

}




