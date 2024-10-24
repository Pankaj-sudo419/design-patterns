package adapterdesignpattern.concreteclasses;

import adapterdesignpattern.mediaplayer.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file name : "+fileName);
        } else if (audioType.equalsIgnoreCase("Vlc") || audioType.equalsIgnoreCase("Mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else {
            System.out.println("File type "+audioType+ " Not supported");
        }
    }
}
