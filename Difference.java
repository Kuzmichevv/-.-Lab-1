import org.junit.jupiter.api.Test;

public class Difference {
    public int subtractProductAndSum(int number) {
        if (number < 1 || number > 100000) {
            return 0;
        }
        if (number == 1) {
            return 0;
        }
        int product = 1;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            product *= digit;
            sum += digit;
            number /= 10;
        }
        return product - sum;
    }
}
