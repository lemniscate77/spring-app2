package org.example.jm;

public class MucisPlayer {
    private Music music;

//Ioc
    public MucisPlayer(Music music) {
        this.music = music;
    }

    public void playMusic () {
        System.out.println("Playing: " + music.getSong());

    }

}
