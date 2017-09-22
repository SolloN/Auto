public class Solution {
    public static void main(String[] args) {
        System.out.print(solution(20));
    }

    public static int solution(int number) {
        int sum = 0;

        for (int currentNumber = 1; currentNumber < number; currentNumber++) {
            if (currentNumber % 5 == 0 || currentNumber % 3 == 0)
                sum = sum + currentNumber;
        }
        return sum;
    }
}
