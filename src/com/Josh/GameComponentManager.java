package com.Josh;

import java.util.Scanner;

/**
 * Created by Clara. Manages game components such as the Snake, Kibble... and their interactions.
 */
public class GameComponentManager {

    private Kibble kibble;
    private Snake snake;
    private Score score;
    private Options options;

    /** Called every clock tick. Tell components to interact/update,
     * manage interactions, update score etc.
     * If there were more components - e.g walls, mazes,
     * different types of kibble/prizes, different scoring systems...
     * they could be managed here too
     */
    public void update() {
        snake.moveSnake();
        if (snake.didEatKibble(kibble)) {
            //tell kibble to update
            kibble.moveKibble(snake);
            Score.increaseScore();
        }
    }

    public void newGame() {
        gameOptions();
        snake.reset();
    }

    private void gameOptions() {

        //What will this be for?

//        System.out.println("should go to options");
//        Scanner testScanner = new Scanner(System.in);
//        String testString = testScanner.nextLine();
//                while(testString != "") {
//                                    }
    }


    public void addKibble(Kibble kibble) {
        this.kibble = kibble;
    }

    public void addSnake(Snake snake) {
        this.snake = snake;
    }

    public void addScore(Score score) {
        this.score = score;
    }

    public void addOptions(Options options) { this.options = options; }


    public Score getScore() {
        return score;
    }

    public Kibble getKibble() {
        return kibble;
    }

    public Snake getSnake() {
        return snake;
    }

    public Options getOptions() { return options;}



}
