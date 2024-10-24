package adapterdesignpattern;

import adapterdesignpattern.concreteclasses.AudioPlayer;

public class Client {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        System.out.println(" ");
        audioPlayer.play("vlc","filename.vlc");
        audioPlayer.play("mp4","filename.mp4");
        audioPlayer.play("mp3","filename.mp3");
        audioPlayer.play("fpg","filename.fpg");
    }
}
