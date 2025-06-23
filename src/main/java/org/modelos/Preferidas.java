package org.modelos;

public class Preferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " É considerado sucesso absoluto");
        }else {
            System.out.println(audio.getTitulo() + " Excelente opção para ser ouvido");
        }
    }
}
