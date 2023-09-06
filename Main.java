public class Main {
    public static void main(String[] args) {
        // My array of 100 integers
        int[] arr = new int[100];

        // My loop to fill array
        for (int i = 0; i < 100; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        // I am setting the first value in the array to be the largest.
        int largestNumber = arr[0];

        // I am initalizing a step count to iterate starting at 1 because 1 + 99 = 100
        int stepCount = 1;

        // My loop to find the largest number
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > largestNumber) {
                largestNumber = arr[j];
            }
            stepCount++;
        }

        // My output
        // (don't mind the 2x print statments. I just need the space to appropriately
        // see my outputs)
        System.out.println(""); // randome white space
        System.out.println("The largest number in array: " + largestNumber);
        System.out.println("The number of compuational steps: " + stepCount);
        System.out.println(""); // randome white space

        // Since there are two single for loops running for n times...
        // The time complexity is O(n+n) aka O(n)
        // The time complexity is not that great but it's still running fast.
    }
}