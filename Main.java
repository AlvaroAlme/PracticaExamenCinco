import menu.Menu;

public class Main {

    public static void main(String[] args){

        GestorVehiculos gestorVehiculos = new GestorVehiculos();
        

        int opcion = 0;
        while(opcion != 6){

            String[] opciones = {"Agregar vehiculo", "Listar vehiculos", "Realizar viaje", "Realizar mantenimiento a todos los vehiculos", "Calcular costo total de operacion", "Salir"};
            opcion = Menu.preguntarOpcion(opciones);

            switch (opcion) {
                case 1:
                    agregarVehiculo(gestorVehiculos);
                    break;
                case 2:
                    listarVehiculos(gestorVehiculos);
                break;
                case 3:
                    realizarViaje(gestorVehiculos);
                break;
                case 4:
                    realizarMantenimiento(gestorVehiculos);
                break;

                case 5:
                    calcularCostoTotal(gestorVehiculos);
                break;
                case 6:
                    System.out.println("Hasta otra!");
                break;
                
            }
        }

    }

    public static void agregarVehiculo(GestorVehiculos gestorVehiculos){

        Vehiculo vehiculo = null;
        int tipoVehiculo = Menu.preguntarOpcion(new String[]{"Auto","Camion"});
        switch (tipoVehiculo) {
            case 1:
                Auto auto = new Auto();
                int pasajerosMaximos = Menu.preguntarEntero("Introduce el numero maximo de pasajeros");
                auto.setPasajerosMaximos(pasajerosMaximos);

                vehiculo = auto;
                break;

            case 2:
                Camion camion = new Camion();
                double cargaMaxima = Menu.preguntarDecimal("introduce la carga maxima del vehiculo");
                camion.setCargaMaxima(cargaMaxima);

                vehiculo = camion;
                break;
        }   

        String id = Menu.preguntarTexto("Introduce el ID del vehiculo");
        String marca = Menu.preguntarTexto("Introduce la marca del vehiculo");
        double kilometraje = Menu.preguntarDecimal("Introduce el kilometraje del vehiculo");

        if (vehiculo != null) {
            vehiculo.setId(id);
            vehiculo.setMarca(marca);
            vehiculo.setKilometraje(kilometraje);
            
            gestorVehiculos.agregarVehiculo(vehiculo);
        } else {
            System.out.println("Tipo de vehículo no válido. No se agregó ningún vehículo.");
        }
    }

    public static void listarVehiculos(GestorVehiculos gestorVehiculos){
        System.out.println("Este es el listado de vehiculos: ");
        gestorVehiculos.listarVehiculos();
    }

    public static void realizarViaje(GestorVehiculos gestorVehiculos){

        String id = Menu.preguntarTexto("introduce el id del vehiculo");
        double kilometraje = Menu.preguntarDecimal("introduce el kilometraje del vehiculo");
        gestorVehiculos.realizarViaje(id, kilometraje);
    }

    public static void realizarMantenimiento(GestorVehiculos gestorVehiculos){
        gestorVehiculos.realizarMantenimiento();
    }

    public static void calcularCostoTotal(GestorVehiculos gestorVehiculos){
        System.out.println("Este es el costo total de las operaciones ralizadas: ");
        System.out.println(gestorVehiculos.calcularCostoTotal());
    }
    
}
