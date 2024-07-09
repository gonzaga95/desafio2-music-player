package music.player.modelos;

public class Bombando {

    public void inclui(Audio audio){
        if (audio.getClassificacao() > 30) {
            System.out.println(audio.getTitulo() + " está bombando!");
        } else {
            System.out.println(audio.getTitulo() + " está em crescimento!");
        }
    }

}
