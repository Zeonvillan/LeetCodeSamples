public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = twoSum.twoSum(nums, target);
        
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
