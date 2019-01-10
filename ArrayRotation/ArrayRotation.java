package ArrayRotation;

import java.util.Scanner;

public class ArrayRotation {

    public void rotate(int[] nums, int k){

        k=k%nums.length;
        int temp[] = new int[nums.length];
        int j=0;
        for(int i=nums.length-k; i<nums.length; i++){
            temp[j]=nums[i];
            j++;
        }

        for(int i=0; i <nums.length-k;i++){
            temp[j]=nums[i];
            j++;
        }

        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]);
        }

        nums=temp;

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int[] nums = {1,2,3,4,5,6,7};
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
         int k=sc.nextInt();
         new ArrayRotation().rotate(nums, k);

    }
}
