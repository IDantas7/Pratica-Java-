package Principal;
import org.modelos.Musicas;
import org.modelos.Podcasts;
import org.modelos.Preferidas;


public class Principal {
    public static void main(String[] args) {
        Musicas musica = new Musicas();
        musica.setTitulo("A Dança");
        musica.setNomeArtista("Mc Hariel and Gilberto Gil");

        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcasts meuPod = new Podcasts();
        meuPod.setTitulo("NerdCast");
        meuPod.setApresentadores("Azaghal and Jovem Nerd");

        for (int i = 0; i < 5000; i++) {
            meuPod.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPod.curte();
        }
        Preferidas preferidas = new Preferidas();
        preferidas.inclui(meuPod);
        preferidas.inclui(musica);
    }

}

