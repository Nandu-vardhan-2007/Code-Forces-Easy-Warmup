//71A
import java.util.Scanner;
public class WayToLongWords {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            while(x-- > 0){
                String s = sc.next();
                if(s.length()>10){
                    char a = s.charAt(0);
                    char b = s.charAt((s.length())-1);
                    int c = (s.length())-2;
                    System.out.printf("%c%d%c\n",a,c,b);
                }
                else{
                    System.out.println(s);
                }
                 
                
            }
        }
    }
}
