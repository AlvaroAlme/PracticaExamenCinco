public class Camion extends Vehiculo {

    private double cargaMaxima;

    public Camion(){
        super();
    }

    public Camion(double cargaMaxima){
        super();
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void realizarMantenimiento() {
        kilometraje = 0;
    }

    @Override
    public double calcularCostoOperacion() {
        double costoOperacion = (200 + getKilometraje() * 0.1) / (getCargaMaxima() / 50);
        return costoOperacion;
        
    }

    @Override
    public void realizarViaje(double km) {
        setKilometraje(getKilometraje() + km);
       
    }

    @Override
    public String toString() {
        return "Camion [cargaMaxima=" + cargaMaxima + ", toString()=" + super.toString() + "]";
    }

    
    
}
