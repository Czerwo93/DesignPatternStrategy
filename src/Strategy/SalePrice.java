package Strategy;

public class SalePrice implements PricingStrategy {
    @Override
    public void calculatePrice(double price, boolean isSignedUpForNewsletter) {
        System.out.println("Przecena: " + price * 0.5 + "zł");
        if(!isSignedUpForNewsletter)
        System.out.println("Użytkownik nie jest zapisany do newslettera, należy wybrać inną strategię cenową!");

    }
}
