public class Auto extends Vehiculo {

    private int pasajerosMaximos;

    public Auto(){
        super();
    }

    public Auto(int pasajerosMaximos){
        super();
        this.pasajerosMaximos = pasajerosMaximos;
    }

    public int getPasajerosMaximos() {
        return pasajerosMaximos;
    }

    public void setPasajerosMaximos(int pasajerosMaximos) {
        this.pasajerosMaximos = pasajerosMaximos;
    }

    @Override
    public void realizarMantenimiento() {
       kilometraje = 0;
    }

    @Override
    public double calcularCostoOperacion() {

        double costoOperacion = (100 + getKilometraje() * 0.05) / getPasajerosMaximos();
        return costoOperacion;
        
        
    }

    @Override
    public void realizarViaje(double km) {

        setKilometraje(getKilometraje() + km);
       
    }

    @Override
    public String toString() {
        return "Auto [pasajerosMaximos=" + pasajerosMaximos + ", toString()=" + super.toString() + "]";
    }

    

}
