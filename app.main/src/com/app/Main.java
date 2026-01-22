package com.app;
import com.pagos.api.MetodoPago;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) throws Exception {
        ServiceLoader<MetodoPago> loader = ServiceLoader.load(MetodoPago.class); //Carga los servicios disponibles que implementan PaymentService
        MetodoPago primerServicio = loader.findFirst().orElseThrow(() -> new RuntimeException("No se encontro ningun modulo que provea el servicio MetodoPago"));
        Factura miFactura = new Factura("0083873", 1000);
        try {
            Class<?> claseInspector = Class.forName("com.audit.Inspector");
            Object miInspector = claseInspector.getDeclaredConstructor().newInstance();

            var metodoAnalizar = claseInspector.getMethod("analizar", Object.class); //var hace que Java deduzca que clase es.

            metodoAnalizar.invoke(miInspector, miFactura);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error el inspector no es alcanzable o no existe.");
        }
    }
}
