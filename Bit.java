//282A
import java.util.Scanner;
public class Bit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            sc.nextLine();
            int n =0;
            for(int i=0;i<x;i++){
                String s = sc.nextLine();
                if(s.contains("++")){
                    n++;
                }
                else if(s.contains("--")){
                    n--;
                }
            }
            System.out.println(n);
        }
    }
}
