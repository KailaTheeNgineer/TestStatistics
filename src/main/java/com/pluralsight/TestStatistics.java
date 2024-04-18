package com.pluralsight;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = new int[] {98, 34, 67, 78, 56, 88, 67, 90, 72, 80};
        double sum = 0;
        for (int i = 0; i < testScores.length; i++){

            sum += testScores[i];
        }

        double average = sum / testScores.length;
        System.out.println("Average: " + average);
    Arrays.sort(testScores);
    System.out.println("Minimum:" + testScores[0]);


        IntSummaryStatistics stats = Arrays.stream(testScores).summaryStatistics();
        System.out.println("Maximum: " + stats.getMax());

    }



}
