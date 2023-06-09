public class Mp4Player implements  AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        if (fileName.equalsIgnoreCase("playMp4")) {
            System.out.println("Playing mp4 file. Name: " + fileName);


        }
    }
}
