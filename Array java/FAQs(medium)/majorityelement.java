//given arr of integer we have to return element which occur more than n/2
//brute- pick each element and scan whole arr and take counter and if element is more than return
//better solution is hashing
//optimal apporach
// in this apporach we pick a element and start moving in array 
// if the same element occurs we inc. the counter by 1 
// and if not then we dec.it by 1
// now on moving if counter become 0 we will pic next element from where our counter become zero
//and at the end we will get a element 
//then we check directly wheather element is majority or not
//by >n/2
// approach is moores voting algo
// in this below case we have not checked it
// taking ideal case - there will guaranteed of 1 majority element
import java.util.Scanner;
public class majorityelement{
    static Scanner SC =new Scanner(System.in);
    public static int majorityelement(int n){
        System.out.println("enter elements of array");
        int[]nums=new int[n];   
        for(int i=0;i<nums.length;i++){
            nums[i]=SC.nextInt();
        }
        int cnt=0;
       int ele=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele){
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt==0){
                ele=nums[i];
                cnt=1;
            }
        }
        System.out.println(ele);
        return ele;
    }
    public static void main(String[] args){
        majorityelement(10);
    }
}