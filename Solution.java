import java.io.*;
import java.util.*;

class Result {

 public static String getSmallestBaseSegment(int segmentSize, String missingData) {
    int[] freq = new int[26];
    int distinct = 0;
    int maxFreq = 0;

    for (char c : missingData.toCharArray()) {
        if (freq[c - 'a'] == 0) distinct++;
        freq[c - 'a']++;
        maxFreq = Math.max(maxFreq, freq[c - 'a']);
    }

    if (distinct > segmentSize) return "-1";

    int low = 1, high = maxFreq;

    while (low < high) {
        int mid = (low + high) / 2;

        int need = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                need += (freq[i] + mid - 1) / mid;
            }
        }

        if (need <= segmentSize)
            high = mid;
        else
            low = mid + 1;
    }

    int replications = low;

    int[] cnt = new int[26];
    int used = 0;

    for (int i = 0; i < 26; i++) {
        if (freq[i] > 0) {
            cnt[i] = (freq[i] + replications - 1) / replications;
            used += cnt[i];
        }
    }

    int extra = segmentSize - used;

    // Give extra copies to 'a' to make it lexicographically smallest
    cnt[0] += extra;

    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < 26; i++) {
        while (cnt[i]-- > 0) {
            ans.append((char) ('a' + i));
        }
    }

    return ans.toString();
 }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int segmentSize = Integer.parseInt(bufferedReader.readLine().trim());

        String missingData = bufferedReader.readLine();

        String result = Result.getSmallestBaseSegment(segmentSize, missingData);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
