package com.pagos.stripe;
import com.pagos.api.MetodoPago;

public class StripeService implements MetodoPago {
    private double monto;

    public StripeService() {
    }

    @Override
    public void procesar(double monto) {
        System.out.println("Monto: " + monto);
    }
}
