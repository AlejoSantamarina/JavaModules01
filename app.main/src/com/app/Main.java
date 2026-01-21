package com.app;

import com.audit.Inspector;
import com.pagos.api.MetodoPago;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) throws Exception {
        ServiceLoader<MetodoPago> loader = ServiceLoader.load(MetodoPago.class); //Carga los servicios disponibles que implementan PaymentService
        MetodoPago primerServicio = loader.findFirst().orElseThrow(() -> new RuntimeException("No se encontro ningun modulo que provea el servicio MetodoPago"));
        Factura miFactura = new Factura("0083873", 1000);
        Inspector miInspector = new Inspector();

        miInspector.analizar(miFactura);
    }
}
