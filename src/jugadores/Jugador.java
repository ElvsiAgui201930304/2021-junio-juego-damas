package src.jugadores;

public class Jugador {
    private int puntos;
    private int partidasGanadas;
    private int partidasPerdidas;
    private boolean turno;
    private String nombre;
    private int piezsComidas;
    private int piezsPerdidas;
    private String tipCasilla = "vacio";

    
    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public int getPiezsComidas() {
        return piezsComidas;
    }

    public void setPiezsComidas(int piezsComidas) {
        this.piezsComidas = piezsComidas;
    }

    public int getPiezsPerdidas() {
        return piezsPerdidas;
    }

    public void setPiezsPerdidas(int piezsPerdidas) {
        this.piezsPerdidas = piezsPerdidas;
    }

   

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public boolean getTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "**Jugador nombre= " + nombre + ", partidasGanadas= " + partidasGanadas + ", puntos= " + puntos + "";
    }
    


}
