package org.example.ex04;

public class AnyTube implements PlataformaSocial {
    @Override
    public void compartilharPostagem(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no AnyTube.");
    }
    @Override
    public void compartilharImagem(Postagem postagem) {
        System.out.println("Ocorreu um erro ao compartilhar essa imagem no AnyTube.");
    }

    @Override
    public void compartilharVideo(Postagem postagem){
        System.out.println("Você compartilhou esse video no AnyTube.");
    }
}
