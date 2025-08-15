//116A
import java.util.Scanner;
public class Tram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int stops = sc.nextInt();
            int total = 0, maxCapacity = 0;
            for(int i=0;i<stops;i++){
                int leaving = sc.nextInt();
                int entering = sc.nextInt();
                total -=leaving;
                total +=entering;
                maxCapacity = Math.max(maxCapacity,total);
            }
        
        System.out.println(maxCapacity);
        }
    }
}
