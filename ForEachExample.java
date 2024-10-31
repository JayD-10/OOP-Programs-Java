import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Using forEach with Arrays.stream
        Arrays.stream(numbers).forEach(number -> System.out.println(number));
    }
}
