public class Factorial {
    public static int getFactorial(int num) {
        int out = num;
        for(int i = num; i > 0; i --) {
            out *= num;
        }
        return out;
    }
}