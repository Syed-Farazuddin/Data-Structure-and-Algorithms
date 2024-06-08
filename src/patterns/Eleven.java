import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        long[] b = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            b[i] = scanner.nextLong();
        }

        long answer = 0;  // We have to append a copy at all cost
        boolean isMatchFound = false;

        // Check if any element in array a matches the last element of array b
        for (int i = 0; i < n; i++) {
            if (a[i] == b[n]) {
                isMatchFound = true;
                break;
            }
        }

        if (isMatchFound) {
            answer = 1;
        } else {
            boolean foundInB = false;

            // Check if the last element of array b is present in the rest of array b
            for (int i = 0; i < n; i++) {
                if (b[i] == b[n]) {
                    foundInB = true;
                    break;
                }
            }

            if (foundInB) {
                answer = 1;
            } else {
                boolean withinRange = false;

                // Check if the last element of array b is between any pair of elements in a and b
                for (int i = 0; i < n; i++) {
                    if ((a[i] <= b[n] && b[n] <= b[i]) || (b[i] <= b[n] && b[n] <= a[i])) {
                        withinRange = true;
                        break;
                    }
                }

                if (withinRange) {
                    answer = 1;
                } else {
                    long minimumDistance = Long.MAX_VALUE;

                    // Find the minimum distance to the last element of array b
                    for (int i = 0; i < n; i++) {
                        long currentDistance = Math.min(Math.abs(b[i] - b[n]), Math.abs(a[i] - b[n]));
                        minimumDistance = Math.min(minimumDistance, currentDistance);
                    }

                    answer += minimumDistance + 1;
                }
            }
        }

        // Calculate the total cost
        for (int i = 0; i < n; i++) {
            answer += Math.abs(a[i] - b[i]);
        }

        System.out.println(answer);
        scanner.close();
    }
}
