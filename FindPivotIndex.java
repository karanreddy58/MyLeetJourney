//Given an array of integers nums, calculate the pivot index of this array.
//
//The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
//
//If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
//
//Return the leftmost pivot index. If no such index exists, return -1.
//
//
//
//Example 1:
//
//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The pivot index is 3.
//Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//Right sum = nums[4] + nums[5] = 5 + 6 = 11

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int sum=0;
        int lsum=0;
        for(int num:nums)
            sum=sum+num;

        for(int i=0;i<nums.length;i++){
            lsum=lsum+nums[i];

            if(lsum-nums[i]==sum-lsum)
                return i;
        }

        return -1;
    }

//    Greedy method
//    static int getSumFromRange(int[] arr,int from,int to){
//        int sum=0;
//        for(int i= from; i<to;i++){
//            sum=sum+arr[i];
//        }
//        return sum;
//    }
//
//    public int pivotIndex(int[] nums) {
//        for(int i=0;i<nums.length;i++){
//            int leftSum=getSumFromRange(nums,0,i);;
//            int rightSum=getSumFromRange(nums,i+1,nums.length);
//            if(leftSum==rightSum)
//                return i;
//        }
//        return -1;
//    }




    public static void main(String[] args) {
        int [] array={1,7,3,6,5,6};
        FindPivotIndex fpi= new FindPivotIndex();
        System.out.println(fpi.pivotIndex(array));
    }

}
