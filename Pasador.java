

public class Pasador extends Player {
    
    private int pases;
    private int fintas;

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getFintas() {
        return fintas;
    }

    public void setFintas(int fintas) {
        this.fintas = fintas;
    }

    public Pasador(String nombre, String nacionalida, int fallas, int as, int servicios, int pases, int fintas) {
        super(nombre, nacionalida, fallas, as, servicios);
        this.pases = pases;
        this.fintas = fintas;
    }

    public Pasador (){
        super();
        pases = 0;
        fintas = 0;
    }

    public double calcculoPasador (){

        double calcculoPasador = 0;

       calcculoPasador = ((pases+fintas-fallas)*100/(pases+fintas+fallas))+as*100/servicios;

        return calcculoPasador;
    }

  




}
