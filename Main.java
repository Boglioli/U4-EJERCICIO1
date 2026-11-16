public class Main {
    public static void main(String[] args) {
        Reproductor reproductor = new Reproductor();
        Reproducible[] elementos = new Reproducible[3];
                elementos[0] = new Cancion();
    elementos[1] = new Video();
    elementos[2] = new Podcast();

        for (int i = 0; i < elementos.length; i++) {
            reproductor.iniciarReproduccion(elementos[i]);
        }
    }

}
