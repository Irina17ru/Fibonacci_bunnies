import java.util.*;

public class Main {

    public static void main(String[] args) {
        int month, coef;
        long current = 0;
        long temp  = 1;
        long previous = temp;
        Scanner in = new Scanner(System.in);
        month = in.nextInt();
        coef = in.nextInt();

        for (int i = month; i > 2; i--){
            current = previous + temp * coef;
            temp = previous;
            previous = current;
        }
        System.out.println(current);
    }
}


