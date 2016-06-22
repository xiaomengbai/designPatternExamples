public class Football extends Game {

    @Override
    void endPlay(){
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize(){
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void play(){
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
