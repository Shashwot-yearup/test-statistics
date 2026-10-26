package com.pluralsight;

public class TestStatsApp {
    public static void main(String[] args) {

        //create an array  with 10 test scores
        int[] scores = {66, 10, 50, 64, 70, 22, 55, 67, 89, 9};

        //average test score
        int sum = 0;
        for (int i = 0; i < scores.length; i++) { //for loop to add up all the numbers.
            sum += scores[i];
        }

        // finds the average the scores.
        double average = (sum/scores.length);
        System.out.println(average);

        //high test score
        

        //low test score

        //

    }
}
