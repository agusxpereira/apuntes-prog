package series;

public class plataforma {
    public static void main(String args[]){
        
        Serie batman = new Serie("Batman", "Es una serie", "Accion", "Agus", 2);
        //Definimos las temporadas con la cantidad de capitulos: 
        batman.addTemporada(0, 3);
        batman.addTemporada(1, 3);
        
        //Definimos los episodios de la primer temporada
        batman.getTemporada(0).addEpisodio(0, "Capitulo 1", "Inicio");
        batman.getTemporada(0).addEpisodio(1, "Capitulo 2", "descripcion corta");
        batman.getTemporada(0).addEpisodio(2, "Capitulo 3", "descripcion corta");


        Usuario agus = new Usuario("Agus");
        agus.setSerieVista(0, batman);
        
        //obtenemos el primer espisodio de la primer temporada:
        agus.getSerie(0).getTemporada(0).getEpisodio(1).setVisto(true);
        agus.getSerie(0).getTemporada(0).getEpisodio(1).setCalificacion(3);
        int obtenerTotalVistos = agus.obtenerTotalVistos(batman);
        System.out.println(obtenerTotalVistos);
    }   
    
}