
package CancionArtistaReproductor;


public class Reproductor {
    public void reproducir(Cancion cancion) {
        if (cancion != null) {
            System.out.println("Reproduciendo: " + cancion.getTitulo() +
                               " | Artista: " + cancion.getArtista().getNombre());
        } else {
            System.out.println("No hay canción para reproducir.");
        }
    }
}
