package music.player.principal;

import music.player.modelos.Music;
import music.player.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Music sampleMusic = new Music();
        sampleMusic.setTitulo("Sample Title");
        sampleMusic.setCantor("Sample Singer");

        Podcast samplePodcast = new Podcast();
        samplePodcast.setApresentador("Sample Host");

        for (int i = 0; i < 25; i++) {
            sampleMusic.reproduz();
        }

        for (int i = 0; i < 5; i++) {
            sampleMusic.curte();
        }

        for (int i = 0; i < 15; i++) {
            samplePodcast.reproduz();
        }

        for (int i = 0; i < 10; i++) {
            samplePodcast.curte();
        }
    }
}
