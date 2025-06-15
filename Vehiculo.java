public abstract class Vehiculo implements Mantenible{

    protected String id;
    protected String marca;
    protected double kilometraje;

    public Vehiculo(){
        super();
    }

    public Vehiculo(String id, String marca, double kilometraje){
        super();
        this.id = id;
        this.marca = marca;
        this.kilometraje = kilometraje;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public abstract double calcularCostoOperacion();
    public abstract void realizarViaje(double km);

    @Override
    public String toString() {
        return "Vehiculo [id=" + id + ", marca=" + marca + ", kilometraje=" + kilometraje + "]";
    }

    
}

