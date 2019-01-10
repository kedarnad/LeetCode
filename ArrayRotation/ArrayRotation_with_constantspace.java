package ArrayRotation;

import java.util.Scanner;

public class ArrayRotation_with_constantspace {
    public void rotate(int[] nums, int k){
        k=k%nums.length;
        int count=0;
        for(int i=0; count<nums.length; i++ ){
            int start= i;
            int prev= nums[i];
            do{
                int temp_index= (start+k)%nums.length;
                int temp = nums[temp_index];
                nums[temp_index]=prev;
                prev=temp;
                start=temp_index;
                count++;
            }
            while(start!=i);
        }


        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int[] nums = {1,2,3,4,5,6,7};
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
        int k=sc.nextInt();
        new ArrayRotation_with_constantspace().rotate(nums, k);

    }
}
