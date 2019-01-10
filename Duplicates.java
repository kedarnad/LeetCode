import java.util.Arrays;
import java.util.HashSet;

public class Duplicates {

    public boolean containsNearByDuplicates(int[] nums, int k, int t){

        if(nums.length <2)
            return false;

        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums)
            hs.add(i);

        if(t==0 &&(hs.size()==nums.length))
            return false;

        for(int i =0; i<nums.length; i++)
            for(int j=i+1; j<=i+k && j<nums.length;j++)
            {
                if(Math.abs((long)nums[i]-(long)nums[j])<=(long)t)
                    return true;
            }


        return false;

//        if(nums.length<2){
//            return false;
//        }
//        HashSet<Integer> hs = new HashSet<Integer>();
//
//        for(int i=0; i<nums.length; i++)
//        {
//            hs.add(nums[i]);
//        }
//        if(t==0 && nums.length == hs.size())
//        {
//            return false;
//        }
//
//        for(int i=0; i<nums.length; i++)
//        {
//            for(int j=i+1;j<=i+k &&j<nums.length;j++)
//            {
//        /*if((nums[j] ==  Integer.MAX_VALUE && start<0) || (nums[j] <0 && start==Integer.MAX_VALUE))
//        {
//            return false;
//        }*/ // dont do this. tradoff with variable data size.
//
//                if(Math.abs((long)nums[j]-(long)nums[i]) <= (long)t)  {
//                    return true;
//                }
//            }
//        }
//
//        return false;

    }


    public static void main(String args[]){

        int[] nums = {-1,2147483647};

        int k=1;
        int t=2147483647;

//        HashSet<Integer> hs = new HashSet<>();
//
//        for(int i : nums){
//            hs.add(i);
//        }
//
//        System.out.println(hs);

        System.out.println(new Duplicates().containsNearByDuplicates(nums, k, t));

    }

}
