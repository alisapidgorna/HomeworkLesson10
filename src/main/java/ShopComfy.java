import java.util.Objects;

public class ShopComfy{
    private String name;
    private int price;

    public ShopComfy(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopComfy shopComfy = (ShopComfy) o;
        return price == shopComfy.price &&
                Objects.equals(name, shopComfy.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
