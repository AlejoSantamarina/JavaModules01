module payment.stripe {
    requires payment.api;
    provides com.pagos.api.MetodoPago with com.pagos.stripe.StripeService;
}