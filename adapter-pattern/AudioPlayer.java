public class AudioPlayer implements MediaPlayer {

    /* Adapter Pattern

       It is described as the class to transfer different
       interfaces between classes. It is not easy to
       understand/realize it while referring the demo
       program.

       I want to describe this pattern as a workaround to
       implement the "interface" on written code. You have
       many different class, and you use an adapter to
       integrate all of them and provide a unified interface.
    */


    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName){

        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }else if(audioType.equalsIgnoreCase("vlc")
                 || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("Invalid media. " + audioType + " format not suppported");
        }
    }
}


/* Demo */
/*
public class AdapterPatternDemo {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new Audioplayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.mp4");
        audioPlayer.play("avi", "mind me.mp4");

    }
}
*/
