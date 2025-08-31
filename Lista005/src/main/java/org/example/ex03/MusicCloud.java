package org.example.ex03;
import java.util.ArrayList;

public class MusicCloud {

    private ArrayList<Musica> musicasDisponiveis;

    public MusicCloud(){
        this.musicasDisponiveis = new ArrayList<>();
    }

    public ArrayList<Musica> getMusicasDisponiveis() {
        return musicasDisponiveis;
    }

    public Musica getMusica(int posicao) {
        return musicasDisponiveis.get(posicao);
    }



    public void adicionarMusica(Musica musica) {
        this.musicasDisponiveis.add(musica);
    }

    public int musicaSelecionada(String nomeMusica) {
        ArrayList<Musica> musicas = this.getMusicasDisponiveis();
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getTitulo().equalsIgnoreCase(nomeMusica)) {
                return i;
            }
        }
        return -1;
    }

}
