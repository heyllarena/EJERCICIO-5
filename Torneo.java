import java.util.*;

public class Torneo {
    
    ArrayList <Player> jugadores;
    public Torneo (){
        this.jugadores = new ArrayList<Player>();
    }

    public void crearLíbero (String nombre, String nacionalidad, int fallas, int as, int recibosEfectivos, int servicios){
        Líbero Nlibero = new Líbero(nombre, nacionalidad, fallas, as, recibosEfectivos, servicios);
        jugadores.add(Nlibero);
    }

    public void crearPasador (String nombre, String nacionalidad, int fallas, int as, int servicios, int pases, int fintas){
        Líbero Npasador = new Líbero(nombre, nacionalidad, fallas, as, servicios, pases, fintas);
        jugadores.add(Npasador);
    }

    public void crearOpuesto (String nombre, String nacionalidad, int fallas, int as, int bloqueosEfectivos, int bloqueosFallidos, int servicios, int ataques){
        Líbero Nopuesto = new Líbero(nombre, nacionalidad, fallas, as, servicios, bloqueosEfectivos, bloqueosFallidos,servicios, ataques);
        jugadores.add(Nopuesto);
    }

   public  void toplibero (){
        for (Player j : jugadores){
            if ( j instanceof Líbero){
                System.out.println(j);
            }
        }
   }

   /**
 * @return
 */
public String inscritos (){
    for (Player j: jugadores){
        System.out.println(j.toString());
    }
    
    return jugadores.toString();
   }

public void crearLíbero() {
}

public void toppasador() {
}

public void topopuesto() {
}


}
