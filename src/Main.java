import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, -4, 5, 1, -7, 9, 0, -3, 2, 8, 4, -1, 6, 4, -7};
        double average = 0;
        if (nums.length > 0);
        {
            double sum = 0;
            for (int j = 0; j < nums.length; j++){
                sum += nums[j];
            }
            average = sum / nums.length;
        }





    }
}
