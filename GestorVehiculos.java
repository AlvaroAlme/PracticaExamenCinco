import java.util.ArrayList;
import java.util.List;

public class GestorVehiculos {

    private List<Vehiculo> vehiculos;

    public GestorVehiculos() {
        super();
        vehiculos = new ArrayList<>();
    }

    public GestorVehiculos(List<Vehiculo> vehiculos) {
        super();
        this.vehiculos = vehiculos;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {

        for (Vehiculo v : vehiculos) {
            if (v != null && v.getId().equals(vehiculo.getId())) {
                System.out.println("Vehículo con el mismo ID ya existe.");
                return;
            }
        }
        vehiculos.add(vehiculo);
    }

    public void listarVehiculos() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v.toString());
        }
    }

    public Vehiculo buscarVehiculoPorId(String id) {
        Vehiculo vehiculo;
        for (Vehiculo v : vehiculos) {
            if (v.getId().equals(id)) {
                return v;
            }
        }
        return null;
    }

    public boolean realizarViaje(String id, double km) {

        for (Vehiculo v : vehiculos) {
            if (v.getId().equals(id)) {
                v.realizarViaje(km);
                return true;
            }
        }
        return false;
    }

    public void realizarMantenimiento() {

        for (Vehiculo v : vehiculos) {
            v.realizarMantenimiento();
        }

    }

    public double calcularCostoTotal() {

        double costoTotal = 0;
        for (Vehiculo v : vehiculos) {
            costoTotal += v.calcularCostoOperacion();
        }

        return costoTotal;
    }
}
