//785A
import java.util.Scanner;
public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count = 0;
            while(n-->0){
                String s = sc.next();
                count = switch (s) {
                    case "Tetrahedron" -> count + 4;
                    case "Cube" -> count + 6;
                    case "Octahedron" -> count + 8;
                    case "Dodecahedron" -> count + 12;
                    default -> count + 20;
                }; 
            }
            System.out.println(count);
        }
    }
}
