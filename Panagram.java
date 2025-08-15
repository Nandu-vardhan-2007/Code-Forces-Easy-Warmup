//520A
import java.util.Scanner;
public class Panagram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            @SuppressWarnings("unused")
            int n = sc.nextInt();
            String s = sc.next().toLowerCase();
            boolean isPanagram = true;
            for(char ch ='a';ch<='z';ch++){
                if(!s.contains(String.valueOf(ch))){
                    isPanagram = false;
                    break;
                }
            }
            System.out.println(isPanagram?"YES":"NO");
        }
    }
}
