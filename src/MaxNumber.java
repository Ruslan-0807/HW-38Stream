import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        int [] numbers = {9, 10, 5, 23, 10, 231};
        int maxNumber = Arrays.stream(numbers)
                .max()
                .orElseThrow();
        System.out.println(" Максимальное число массива = " + maxNumber);
    }

}
