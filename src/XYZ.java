import java.util.Scanner;

public class XYZ {
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

        long answer = 0; // We have to append a copy at all cost
        boolean done = false;

        // Check if a contains the last element of b
        for (int i = 0; i < n; i++) {
            if (a[i] == b[n]) {
                done = true;
                break;
            }
        }

        if (done) {
            answer = 1;
        } else {
            boolean really = false;

            // Check if b contains the last element of b before the last position
            for (int i = 0; i < n; i++) {
                if (b[i] == b[n]) {
                    really = true;
                    break;
                }
            }

            if (really) {
                answer = 1;
            } else {
                boolean comesBetween = false;

                // Check if b[n] comes between any pair of elements in a and b
                for (int i = 0; i < n; i++) {
                    if ((a[i] <= b[n] && b[n] <= b[i]) || (b[i] <= b[n] && b[n] <= a[i])) {
                        comesBetween = true;
                        break;
                    }
                }

                if (comesBetween) {
                    answer = 1;
                } else {
                    long curr;
                    long minDistance = Long.MAX_VALUE;

                    // Find the minimum distance to b[n]
                    for (int i = 0; i < n; i++) {
                        curr = Math.min(Math.abs(b[i] - b[n]), Math.abs(a[i] - b[n]));
                        minDistance = Math.min(minDistance, curr);
                    }

                    answer += minDistance + 1;
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
