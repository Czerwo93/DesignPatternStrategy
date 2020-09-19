package Strategy;

public class RegularPrice implements PricingStrategy {
    @Override
    public void calculatePrice(double price, boolean isSignedUpForNewsletter) {
        System.out.println("Normalna cena: " + price + "zł");
        if(isSignedUpForNewsletter)System.out.println("Użytkownik zapisany do newslettera, należy wybrać inną strategię cenową!");

    }
}
