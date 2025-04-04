public class Fibonacci {
    //private static int counter = 0;
    public static void main(String[] args) {
        // counter = 0;
        for(int i = 1; i <= 11; i ++) {
            System.out.println(iterativeFib(i));

            long startTime = System.nanoTime();
            int fibRec = fibonacci(40);
            long endTime = System.nanoTime();
            long recursiveTime = endTime - startTime;
    
    
            startTime = System.nanoTime();
            int fibIter = iterativeFib(40);
            endTime = System.nanoTime();
            long iterativeTime = endTime - startTime;
            System.out.println("Fibonacci(" + 40 + ")");
    
            System.out.println("Recursive: " + fibonacci(40)+ " | Time: " + recursiveTime / 1e6 + " ms");
            System.out.println("Iterative: " + iterativeFib(40) + " | Time: " + iterativeTime / 1e6 + " ms");
        }
    }

    private static int fibonacci(int x) {
        // counter ++;
        // System.out.println(counter);
        
        if (x == 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        // double recursive method call
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
    public static int iterativeFib(int n){
        int out = 1;
        int prev = 0;
        for(int i = 0; i < n - 1; i ++) {
            int newPrev = out;
            out = out + prev;
            prev = newPrev;
        }
        return prev;
    }


    
}


