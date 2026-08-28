
public class leastInterval {

    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for (char task : tasks) {
            freq[task - 'A']++;
        }

        int maxFreq = 0;

        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        int maxCount = 0;

        for (int f : freq) {
            if (f == maxFreq) {
                maxCount++;
            }
        }

        int result = (maxFreq - 1) * (n + 1) + maxCount;

        return Math.max(result, tasks.length);
    }

    public static void main(String[] args) {

        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;

        leastInterval solution = new leastInterval();
        System.out.println(solution.leastInterval(tasks, n));
    }
}
