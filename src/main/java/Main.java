import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static int sumOfDivisors(int start, int end, int a, int b) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = start; i <= end; i++){
            numbers.add(i);
        }
        return numbers.stream().filter(x -> (x%a ==0 || x%b==0)).mapToInt(x->x).sum();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(sumOfDivisors(start, end, a, b));

        scanner.close();
    }
}