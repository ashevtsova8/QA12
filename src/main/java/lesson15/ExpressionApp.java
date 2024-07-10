package lesson15;

public class ExpressionApp {
    public static void main(String[] args) {
        Expression function = n -> n % 2 == 0;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(nums, function));
    }

    private static int sum(int[] numbers, Expression function) {
        int result = 0;
        for (int i : numbers) {
            if (function.isEqual(i)) {
                result += i;
            }
        }
        return result;
    }
}
