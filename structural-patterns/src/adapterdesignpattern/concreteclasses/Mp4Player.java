package adapterdesignpattern.concreteclasses;

import adapterdesignpattern.mediaplayer.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4, file name: "+ fileName);
    }

    @Override
    public void playVlc(String filename) {
        // Do Nothing
    }
}
