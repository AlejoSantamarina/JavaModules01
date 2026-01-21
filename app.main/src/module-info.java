module app.main {
    requires payment.api;
    uses com.pagos.api.MetodoPago;
    requires audit.logger;
}