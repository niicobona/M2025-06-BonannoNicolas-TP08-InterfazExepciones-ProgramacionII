
package CancionArtistaReproductor;


public class Principal {
    public static void main(String[] args) {
        
        Artista artista = new Artista("Damas Gratis", "Cumbia");
        Cancion cancion = new Cancion("No te creas tan importante", artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);

        System.out.println(artista);
        System.out.println(cancion);
    }
}
