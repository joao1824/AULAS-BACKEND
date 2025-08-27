package org.example.ex03INCOMPLETA;
import java.util.ArrayList;

public class MusicCloud {

    private ArrayList<Musica> musicasDisponiveis;

    public MusicCloud(){
        this.musicasDisponiveis = new ArrayList<>();
    }

    public ArrayList<Musica> getMusicasDisponiveis() {
        return musicasDisponiveis;
    }

    public void adicionarMusica(Musica musica) {
        this.musicasDisponiveis.add(musica);
    }

    public boolean musicaDisponivel(String musica) {
        if (this.musicasDisponiveis.contains(musica)) {
            return true;
        }else {
            return false;
        }
    }

    public void RetornarMusica(Musica musica) {
        if (this.musicaDisponivel(musica.getTitulo())){
            return ;
        }
    }


}
