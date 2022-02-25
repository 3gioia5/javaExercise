public class MarketGood {
    public final String name;   // 제품명
    public final int retailPrice;   // 정가
    private int discountRate;


    public MarketGood(String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;
        if (discountRate < 0 || discountRate > 100) {
            this.discountRate = 0;
        } else {
            this.discountRate = discountRate;
        }
    }

    public MarketGood(String name, int retailPrice) {
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = 0;
    }

    public void setDiscountRate(int rate) {
        this.discountRate = rate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public int getDiscountedPrice() {
        return (int) (retailPrice * ((double) (100 - discountRate) / 100));
    }
}
