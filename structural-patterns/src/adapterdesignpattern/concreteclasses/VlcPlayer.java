package adapterdesignpattern.concreteclasses;

import adapterdesignpattern.mediaplayer.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        // Do Nothing
    }

    @Override
    public void playVlc(String filename) {
        System.out.println("Playing Vlc media, file name : "+filename);
    }
}
