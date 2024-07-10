package lesson15;

public class ExpressionApp1 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -10};
        System.out.println(sum(nums, ExpressionHelper::isEven));

        Expression expression = ExpressionHelper::isPositive;
        System.out.println(sum(nums, expression));
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
