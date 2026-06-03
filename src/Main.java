public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int[] rev = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rev[i] = nums[nums.length - 1 - i];
        }
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }
    }
}