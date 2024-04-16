package com.vladsimonenko.algorithms.queue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointsToOrigin {

    public static void main(String[] args) {


        int[][] arr = {{3, 3}, {5, -1}, {-2, 4}};

        System.out.println(Arrays.deepToString(new KClosestPointsToOrigin().kClosest(
                arr, 2
        )));
    }

    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> orderedPoints = new PriorityQueue<>(
                (p1, p2) -> squaredDistance(p1) - squaredDistance(p2)
        );

        orderedPoints.addAll(Arrays.asList(points));


        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = orderedPoints.poll();
        }

        return result;
    }

    public int squaredDistance(int[] point) {
        return (point[0] * point[0]) + (point[1] * point[1]);
    }
}
