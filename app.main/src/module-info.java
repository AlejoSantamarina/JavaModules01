module app.main {
    requires transitive payment.api;
    requires audit.logger;
    uses com.pagos.api.MetodoPago;
    opens com.app to audit.logger;
}