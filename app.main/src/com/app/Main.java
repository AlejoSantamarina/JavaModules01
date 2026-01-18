package com.app;
import com.audit.Inspector;
import com.pagos.api.MetodoPago;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) throws Exception {
        ServiceLoader<MetodoPago> loader = ServiceLoader.load(MetodoPago.class);
        for(MetodoPago mp : loader) {
            mp.procesar(100);
        }

        Factura miFactura = new Factura("0083873", 1000);
        Inspector miInspector = new Inspector();

        miInspector.analizar(miFactura);
    }
}
