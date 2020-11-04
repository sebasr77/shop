package pl.sebasr.shop;

public class Product {

    private String name;


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", priceNet=" + priceNet +
                ", VatRate=" + VatRate +
                '}';
    }

    private Integer priceNet;
    private Integer VatRate;

    public Product(String name, Integer priceNet) {
        this.name = name;
        this.priceNet = priceNet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriceNet() {
        return priceNet;
    }

    public void setPriceNet(Integer priceNet) {
        this.priceNet = priceNet;
    }

    public Integer getVatRate() {
        return VatRate;
    }

    public void setVatRate(Integer vatRate) {
        VatRate = vatRate;
    }
}
