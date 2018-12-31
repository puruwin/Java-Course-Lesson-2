class pelicula {
    String titulo;
    String genero;
    int calificacion;

    void proyectar() {
        System.out.println ("Proyectando la pelicula");
        System.out.println (titulo);
        System.out.println (genero);
        System.out.println (calificacion);
        System.out.println ("");
    }
}

public class peliculaTestDrive {
    public static void main (String[] args) {
        pelicula uno = new pelicula();
        uno.titulo="Blancanieves y los siete enanitos";
        uno.genero="infantil";
        uno.calificacion=-2;
        pelicula dos = new pelicula();
        dos.titulo="No habra paz para los malvados";
        dos.genero="Thriller";
        dos.calificacion=127;
        pelicula tres = new pelicula();
        tres.titulo="Bailando bajo la lluvia";
        tres.genero="musical";
        tres.calificacion=5;
        uno.proyectar();
        dos.proyectar();
        tres.proyectar();
    }
}