package series;

public class Usuario {
    private String nombre;
    private final Serie[] seriesVistas;

    public Serie[] getSeriesVistas() {
        return seriesVistas;
    }
    public void setSerieVista(int pos, Serie ss){
        this.seriesVistas[pos] = ss;
    }

    public Serie getSerie(int pos){
        return this.seriesVistas[pos];
    }


    public String getNombre() {
        return nombre;
        
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Usuario(String nombre){
        this.nombre = nombre;
        this.seriesVistas = new Serie[10];
    }

    

    public void clasificarEpisodio(Episodio ep, int calificacion){
        if(calificacion > 0 && calificacion <= 5){
            ep.setCalificacion(calificacion);
        }else{
            System.out.println("El valor debe estar entre 1 y 5");
        }
    }

    public int obtenerVistos(Temporada temp){
        Episodio[] episodios = temp.getEpisodios();
        int vistos = 0;
        for (Episodio episodio : episodios) {
            if (episodio.getVisto() == true) {
                vistos++;
            }
        }
        return vistos;
    }


    public int obtenerTotalVistos(Serie ss){
        Temporada[] temporadas = ss.getTemporadas();
        int totalVistos = 0;
        for (Temporada element : temporadas) {
          totalVistos += obtenerVistos(element);  
        }
        return totalVistos;
    }

    
    public int obtenerTotalEpisodios(Serie ss){
        Temporada[] temporadas = ss.getTemporadas();
        int totalEpisodios = 0;
        for (Temporada element : temporadas) {
            totalEpisodios += element.getCantEpisodios();  
        }
        return totalEpisodios;
    }

    public double obtenerPromedioTemp(Temporada temp){
        Episodio[] episodios = temp.getEpisodios();
        int vistos = 0;
        double promedio = 0;
        for (Episodio episodio : episodios) {
            if (episodio.getVisto() == true) {
                vistos++;
                promedio += episodio.getCalificacion();
            }
        }
        return promedio/vistos;
    }

    public double obtenerPromedioTotal(Serie ss){
        
        double promedioTotal = 0;
        Temporada[] temporadas = ss.getTemporadas();
        for (Temporada temporada : temporadas) {
            promedioTotal += obtenerPromedioTemp(temporada);  
        }
        return promedioTotal / temporadas.length;
    }

    public Boolean serieCompletada(Serie ss){
        int totalEpisodios = obtenerTotalEpisodios(ss);
        return obtenerTotalVistos(ss) == totalEpisodios;
    }


}
