package designPatterns.SolidPrinciples.DependencyInversionPrinciple.right;

public class PaymentServiceFactory {

    public static PaymentService getInstance(String paymentOption) {
        if(paymentOption.equals("card")) {
            return new CardPaymentService();
        } else if (paymentOption.equals("wallet")) {
            return new WalletPaymentService();
        }
        return null;
    }
}
