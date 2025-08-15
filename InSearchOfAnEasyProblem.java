//1030A
import java.util.Scanner;
public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            @SuppressWarnings("unused")
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            if(s.contains("1")){
                System.out.println("HARD");
            }
            else{
                System.out.println("EASY");
            }
        }
    }
}
