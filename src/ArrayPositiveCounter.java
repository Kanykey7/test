public class ArrayPositiveCounter {
    public static void main(String[]args) {
        int[] array = {8, -2, -4, 2, 3, 6};
        countPositive(array);
    }

    private static int countPositive(int[] array) {
        int count = 0;
        for (int i: array){
            if (i > 0){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
