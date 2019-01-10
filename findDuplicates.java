import java.util.Arrays;

public class findDuplicates {

    public int findDuplicate(int[] nums){
        int zeros[] = new int[nums.length];
        Arrays.fill(zeros, 0);

        for (int i=0; i < nums.length; i++){

            zeros[nums[i]]++;
        }


        for(int i=0; i<zeros.length; i++){
            if(zeros[i] >1)
                return i;
        }
        return -1;
    }


    public int findDupwithOofNtimeComplexity(int[] nums){
        int tortoise = nums[0];
        int hare= nums[0];

        //finding an intersection point
        //one is running ahead and the other is running behind
        do{
            tortoise= nums[tortoise];
            hare=nums[nums[hare]];
        }
        while(tortoise!=hare);

//        return tortoise;


        int firstptr= tortoise;
        int secondptr= nums[0];

        while(secondptr!=firstptr){

            firstptr=nums[firstptr];
            secondptr=nums[secondptr];
        }

        return secondptr;


    }


    public static void main(String args[]){

        int[] n = {2,5,9,6,9,3,8,9,7,1};
        int[] k = {0, 3, 1, 2};
        int[] d = {0, 1, 2, 3, 3};

//        System.out.println(new findDuplicates().findDuplicate(n));

        System.out.println(new findDuplicates().findDupwithOofNtimeComplexity(d));

//        System.out.println(new findDuplicates().findDupwithOofNtimeComplexity(n));
    }
}
