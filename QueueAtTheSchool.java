//266B
import java.util.Scanner;
public class QueueAtTheSchool{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int t = sc.nextInt();
            String s = sc.next();

            char[] arr = s.toCharArray();

            for(int time = 0;time < t;time++){
                for(int i = 0;i<n-1;i++){
                    if(arr[i]=='B' && arr[i+1] == 'G'){
                        char temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                        i++;
                    }
                }
            }
            System.out.println(new String(arr));
        }
    }
}