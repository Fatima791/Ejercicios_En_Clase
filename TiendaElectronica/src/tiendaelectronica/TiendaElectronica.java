package tiendaelectronica;
public class TiendaElectronica {
    public static void main(String[] args) {
        // Crear un objeto de la clase TelefonoMovil
        TelefonoMovil telefono = new TelefonoMovil(500.0, "Samsung", "Galaxy S21", 128, 24);

        // Crear un objeto de la clase Tableta
        Tableta tableta = new Tableta(300.0, "Apple", "iPad Air", 10.5, "2048x1536");

        // Mostrar información del teléfono móvil
        System.out.println("Teléfono Móvil:");
        System.out.println("Marca: " + telefono.getMarca());
        System.out.println("Modelo: " + telefono.getModelo());
        System.out.println("Precio: $" + telefono.getPrecio());
        System.out.println("Capacidad de Almacenamiento: " + telefono.getCapacidadAlmacenamiento() + " GB");
        System.out.println("Duración de la Batería: " + telefono.getDuracionBateria() + " horas");

        // Modificar algunos atributos del teléfono móvil
        telefono.setPrecio(550.0);
        telefono.setDuracionBateria(26);
        System.out.println("\nNuevo precio del teléfono móvil: $" + telefono.getPrecio());
        System.out.println("Nueva duración de la batería: " + telefono.getDuracionBateria() + " horas");

        // Mostrar información de la tableta
        System.out.println("\nTableta:");
        System.out.println("Marca: " + tableta.getMarca());
        System.out.println("Modelo: " + tableta.getModelo());
        System.out.println("Precio: $" + tableta.getPrecio());
        System.out.println("Tamaño de Pantalla: " + tableta.getTamanoPantalla() + " pulgadas");
        System.out.println("Resolución de Pantalla: " + tableta.getResolucionPantalla());

        // Modificar algunos atributos de la tableta
        tableta.setTamanoPantalla(11.0);
        System.out.println("\nNuevo tamaño de pantalla de la tableta: " + tableta.getTamanoPantalla() + " pulgadas");
    }
}
