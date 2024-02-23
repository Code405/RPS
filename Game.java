import java.util.Random;
import java.util.Scanner;

public class Game {
    // 1 = Rock
    // 2 = Paper
    // 3 = Scissors
    public static int get_user_play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose (R) for Rock, (P) for Paper, (S) for Scissors: ");
        String user_input = scanner.nextLine().toUpperCase();
        int user_play;

        if (user_input.equals("R")){
            user_play = 1;
        }
        else if(user_input.equals("P")){
            user_play = 2;
        }
        else if(user_input.equals("S")){
            user_play = 3;
        }
        else{
            System.out.println("That was not valid input.");
            user_play = 0;
        }
        return user_play;
    }

    public static int get_cpu_play(){
        Random random = new Random();
        return random.nextInt(3)+1;
    }

    public static int play_game(int user_play, int cpu_play){
        // returns 1 if player wins, 0 if it's a tie, and -1 if player loses
        int user_turn = 0;

        if (user_play == 1){
            System.out.println("User selects Rock");
            switch(cpu_play) {
                case 1:
                    System.out.println("CPU also chose Rock. It's a tie.");
                    break;
                case 2:
                    System.out.println("CPU chose Paper, CPU wins.");
                    user_turn = -1;
                    break;
                case 3:
                    System.out.println("CPU chose Scissors, You win!");
                    user_turn = 1;
                    break;
            }
        }
        else if(user_play == 2){
            System.out.println("User selects Paper!");
            switch(cpu_play){
                case 1:
                    System.out.println("Cpu chose Rock, You win!");
                    user_turn = 1;
                    break;
                case 2:
                    System.out.println("CPU also chose Paper, It's a tie.");
                    break;
                case 3:
                    System.out.println("CPU chose Scissors, you lose.");
                    user_turn = -1;
                    break;
            }
        }
        else if(user_play == 3){
            System.out.println("User selects Scissors!");
            switch(cpu_play){
                case 1:
                    System.out.println("CPU chose Rock, you lose.");
                    user_turn = -1;
                    break;
                case 2:
                    System.out.println("CPU chose Paper, you win!");
                    user_turn = 1;
                    break;
                case 3:
                    System.out.println("CPU also chose Scissors, It's a tie.");
            }
        }
        return user_turn;
    }
    public static int update_score(int current_score, int turn_result){
        int new_score;
        if (turn_result == 1)
            new_score = ++current_score;
        else
            new_score = current_score;

        System.out.println("Your current score is: "+ new_score);
        return new_score;
    }

    public static int update_turns(int current_turns, int turn_result){
        int new_turns;
        if(turn_result == -1)
            new_turns = --current_turns;
        else
            new_turns = current_turns;

        System.out.println("You have "+ new_turns +" turns left.");
        return new_turns;
    }
}

