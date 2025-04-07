public class BinarySearch {
    private static int times = 0;
    private static int ttimes = 0;

    public static void reset() {
        times = 0;
        ttimes = 0;
    }

    // RECURSIVE IMPLEMENTATION
    public static int recursiveBinarySearch(int[] elements, int lowPosition, int highPosition, int target) {
        if (lowPosition > highPosition) {
            System.out.println("Called times: " + times);
            return -1;  // base case: target was not found, return -1
        } else {
            int midPosition = (lowPosition + highPosition) / 2;

            if (elements[midPosition] < target) {
                /* ------ COMPLETE ME with a recursive call ------ */
                times ++;
                return recursiveBinarySearch(elements, midPosition + 1, highPosition, target);
            } else if (elements[midPosition] > target) {
                /* ------ COMPLETE ME with a recursive call ------ */
                times ++;
                return recursiveBinarySearch(elements, lowPosition, midPosition - 1, target);
            } else {
                // otherwise, target found, return that index
                System.out.println("Called times: " + times);
                return midPosition;
            }
        }
    }

    // ITERATIVE, NON-RECURSIVE IMPLEMENTATION -- FOR COMPARISON
    public static int iterativeNonRecursiveBinarySearch(int[] elements, int target) {
        int lowPosition = 0;
        int highPosition = elements.length - 1;

        while (lowPosition <= highPosition) {

            ttimes ++;
            int midPosition = (lowPosition + highPosition) / 2;

            if (elements[midPosition] < target) {
                lowPosition = midPosition + 1;
            } else if (elements[midPosition] > target) {
                highPosition = midPosition - 1;
            } else {
                // else, target found, return its index
                System.out.println("Called times: " + ttimes);
                return midPosition;
            }
            
        }
        System.out.println("Called times: " + ttimes);
        // target was not found, return -1
        return -1;
    }
}
