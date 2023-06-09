public class AdapterPatternDemo {
    public static void main(String[] args) {
     AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("beyond the horizon.mp3", "mp3");
        audioPlayer.play("alone.mp4", "mp4");
        audioPlayer.play("far far away.vlc", "vlc");
        audioPlayer.play("mind me.avi", "avi");
    }
}