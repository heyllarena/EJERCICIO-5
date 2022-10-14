public class Player {
    protected String nombre;
    protected String nacionalidad;
    protected int fallas;
    protected int as;
    protected int servicios;

    public int getServicios() {
        return servicios;
    }

    public void setServicios(int servicios) {
        this.servicios = servicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getFallas() {
        return fallas;
    }

    public void setFallas(int fallas) {
        this.fallas = fallas;
    }

    public int getAs() {
        return as;
    }

    public void setAs(int as) {
        this.as = as;
    }

    public Player(String nombre, String nacionalidad, int fallas, int as, int servicios) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fallas = fallas;
        this.as = as;
        this.servicios = servicios;
    }

    public Player (){

    }

    

}
