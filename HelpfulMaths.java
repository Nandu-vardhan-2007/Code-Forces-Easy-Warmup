//339A
import java.util.*;

public class HelpfulMaths{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String[] numbers = s.split("\\+");
            Arrays.sort(numbers);
            System.out.println(String.join("+", numbers));
        }
    }
}
