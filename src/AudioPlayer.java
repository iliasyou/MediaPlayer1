public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;


    @Override
    public void play(String fileName, String audioType) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(fileName, audioType);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}






