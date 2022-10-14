public class Líbero extends Player {
    
    private int recibosEfectivos;

    public int getRecibosEfectivos() {
        return recibosEfectivos;
    }

    public void setRecibosEfectivos(int recibosEfectivos) {
        this.recibosEfectivos = recibosEfectivos;
    }

    public Líbero(String nombre, String pais, int errores, int aces, int recibosEfectivos, int servicios) {
        super(nombre, pais, errores, aces, servicios);
        this.recibosEfectivos = recibosEfectivos;
    }

    public double calculoLibero (){
        double operacionLibero = 0;

        operacionLibero = ((recibosEfectivos-fallas)*100/(recibosEfectivos+fallas))+as*100/servicios;
        return operacionLibero;
    }

    public String toString() {
		return "Líbero [nombre=" + nombre + ", procedencia=" + nacionalidad + ", errores=" + fallas
				+ ", as=" + as + ", Recibos Efectivos="+ recibosEfectivos + ", servicios="+ servicios;
	}

   


}
