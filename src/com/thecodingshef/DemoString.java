package com.thecodingshef;

public class DemoString {

    public static void main(String[] args) {

        int[] winners={23,56,43};
        StringBuilder sbWinners = new StringBuilder();
        sbWinners.append("The 1st place:").append(winners[0]).
                append(";The 2nd place:")
                .append(winners[1])
                .append(";The 3rd place:").append(winners[2]).
                append(";");


    }
}
