public class Product implements Promotion {
    private String name;
    private int price;
    private int weight;

    @Override
    public int getDiscountAmount() {
        return 0;
    }

    Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    int getWeight() {
        return this.weight;
    }

    int getPrice() {
        return this.price;
    }
}
