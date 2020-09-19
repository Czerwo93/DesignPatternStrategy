package Strategy;

public class PriceCalculator {
    private PricingStrategy pricingStrategy;

    public void calculate(double price, boolean isSignedUpForNewsletter){
        pricingStrategy.calculatePrice(price,isSignedUpForNewsletter);
    }



    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}
