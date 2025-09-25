
package EditorRenderProyecto;


public class Principal {
     public static void main(String[] args) {
        Proyecto proyecto1 = new Proyecto("Video Promocional", 5.30);
        Proyecto proyecto2 = new Proyecto("Corto Documental", 12.45);     
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto1);
        editor.exportar("AVI", proyecto2);
        
    }
}
