package io.github.joaorbrandao;

public class Main {
    public static void main(String[] args) {
        String input = args[0];
        System.out.printf("Input: " + input);

        var output = new RockPaperScissors(input).play();
        System.out.printf(output);
    }
}
