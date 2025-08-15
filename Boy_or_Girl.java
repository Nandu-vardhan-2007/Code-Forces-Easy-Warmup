//236A
import java.util.*;
public class Boy_or_Girl{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            long count = s.chars().distinct().count();
            System.out.println(count % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
        }
    }
}
