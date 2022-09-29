import java.util.*;

/*
Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest.
Sort the words with the same frequency by their lexicographical order.
 */
public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> word_count = new HashMap<>();
        int size = words.length;

        for (String word : words) {
            word_count.put(word, word_count.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> queue = new PriorityQueue<>(
                (w1, w2) -> word_count.get(w1).equals(word_count.get(w2)) ? w2.compareTo(w1) : word_count.get(w1) - word_count.get(w2));

        for (String word : word_count.keySet()) {
            queue.offer(word);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        List<String> result = new ArrayList();

        while (!queue.isEmpty()) {
            result.add(queue.poll());
        }

        Collections.reverse(result);
        return result;
    }
}
