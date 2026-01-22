module app.main {
    requires payment.api;
    requires audit.logger;
    uses com.pagos.api.MetodoPago;
}