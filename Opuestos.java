public class Opuestos extends Player{
    
    private int bloqueosEfectivos;
    private int bloqueosFallidos;
    private int ataques;

    public int getAtaques() {
        return ataques;
    }

    public void setAtaques(int ataques) {
        this.ataques = ataques;
    }

    public int getBloqueosEfectivos() {
        return bloqueosEfectivos;
    }

    public void setBloqueosEfectivos(int bloqueosEfectivos) {
        this.bloqueosEfectivos = bloqueosEfectivos;
    }

    public int getBloqueosFallidos() {
        return bloqueosFallidos;
    }

    public void setBloqueosFallidos(int bloqueosFallidos) {
        this.bloqueosFallidos = bloqueosFallidos;
    }

    public Opuestos(String nombre, String nacionalidad, int fallas, int as, int bloqueosEfectivos, int bloqueosFallidos, int servicios, int ataques) {
        super(nombre, nacionalidad, fallas, as, servicios);
        this.bloqueosEfectivos = bloqueosEfectivos;
        this.bloqueosFallidos = bloqueosFallidos;
        this.ataques = ataques;
    }

    public Opuestos (){
        super();
        bloqueosEfectivos = 0;
        bloqueosFallidos = 0;
    }

    public double calculoOpuestos (){
        double calculoOpuestos = 0;

        calculoOpuestos = ((ataques+bloqueosEfectivos-bloqueosFallidos-fallas)*100/(ataques+bloqueosEfectivos+bloqueosFallidos+fallas))+as*100/servicios;

        return calculoOpuestos;
    }

    


}
