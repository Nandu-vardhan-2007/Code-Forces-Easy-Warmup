//231A
import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int count = 0;
            for(int i =0;i<x;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                if(a+b+c>=2){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
