module payment.stripe {
    requires payment.api;
    provides com.pagos.api.MetodoPago with com.pagos.stripe.StripeService;
    opens com.pagos.stripe to audit.logger;//Permito que el módulo audit.logger use la API de Reflection (java.lang.reflect) para mirar dentro de mis clases
}