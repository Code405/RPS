
public class Main {

    public static void main(String[] args) {

        int USER_PLAY;
        int CPU_PLAY;
        int PLAYER_SCORE = 0;
        int PLAYER_TURNS = 3;
        int TURN_RESULT;


        while(PLAYER_TURNS > 0) {
            USER_PLAY = Game.get_user_play();
            CPU_PLAY = Game.get_cpu_play();
            TURN_RESULT = Game.play_game(USER_PLAY, CPU_PLAY);
            PLAYER_SCORE = Game.update_score(PLAYER_SCORE, TURN_RESULT);
            PLAYER_TURNS = Game.update_turns(PLAYER_TURNS, TURN_RESULT);
        }
    }
}