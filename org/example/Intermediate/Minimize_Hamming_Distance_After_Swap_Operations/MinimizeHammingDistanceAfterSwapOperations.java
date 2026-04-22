package org.example.Intermediate.Minimize_Hamming_Distance_After_Swap_Operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO: This problem was solved using an AI.
//I have a rule: if I can’t solve a problem within a day, I look at the solution.
//I could’t solve this problem within a day.


public class MinimizeHammingDistanceAfterSwapOperations {
    public static int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;

        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] swap : allowedSwaps) {
            int a = swap[0];
            int b = swap[1];
            graph[a].add(b);
            graph[b].add(a);
        }

        boolean[] visited = new boolean[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(i, graph, visited, component);

                Map<Integer, Integer> freq = new HashMap<>();

                for (int idx : component) {
                    int value = source[idx];
                    freq.put(value, freq.getOrDefault(value, 0) + 1);
                }

                for (int idx : component) {
                    int value = target[idx];
                    int count = freq.getOrDefault(value, 0);

                    if (count > 0) {
                        freq.put(value, count - 1);
                    } else {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private static void dfs(int node, List<Integer>[] graph, boolean[] visited, List<Integer> component) {
        visited[node] = true;
        component.add(node);

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next, graph, visited, component);
            }
        }
    }
}
