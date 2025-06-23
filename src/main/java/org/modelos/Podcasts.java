package org.modelos;

public class Podcasts extends Audio {
    private String apresentadores;
    private String descricao;

    public String getApresentadores() {
        return apresentadores;
    }

    public void setApresentadores(String apresentadores) {
        this.apresentadores = apresentadores;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtida() > 500){
            return 10;
        }else {
            return 8;
        }

    }
}
