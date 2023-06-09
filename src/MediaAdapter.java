public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        switch (audioType.toLowerCase()) {
            case "vlc":
            advancedMusicPlayer = new VlcPlayer();
                break;
            case "mp4":
                advancedMusicPlayer = new Mp4Player();
                break;
            default:
                System.out.println("Invalid audio type: " + audioType);
        }

        }

    @Override
    public void play(String fileName, String audioType) {
        switch (audioType.toLowerCase()) {
            case "vlc":
                advancedMusicPlayer.playVlc(fileName);
                break;
            case "mp4":
                advancedMusicPlayer.playMp4(fileName);
                break;
            default:
                System.out.println("Invalid media. " + audioType + " format not supported");

    }
}
}
