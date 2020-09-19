package Strategy;

public interface PricingStrategy {
    public abstract void calculatePrice(double price, boolean isSignedUpForNewsletter);
}
