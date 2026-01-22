module payment.api {
    exports com.pagos.api;
    opens com.pagos.api to audit.logger;
}