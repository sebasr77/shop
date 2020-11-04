package pl.sebasr.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(("PRO"))
@Service
public class ShopPro implements Shop {

    @Override
    public String getInfo() {
        String showList = "";
        for (Product temp : shoppingCart.getProductList()) {
            showList = showList +
                    "---------Product{" +
                    "name='" + temp.getName() + '\'' +
                    ", priceNet=" + temp.getPriceNet() +
                    ", VatRate=" + String.valueOf(temp.getPriceNet() * Float.parseFloat(vat) / 100) +
                    ", Discount=" + String.valueOf(temp.getPriceNet() * Float.parseFloat(vat) / 100 * Float.parseFloat(discount) / 100) +
                    '}' + "<br/>";
            ;
        }

        return showList;
    }

    @Autowired
    public ShopPro(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    private ShoppingCart shoppingCart;
    @Value("${app.vat}")
    private String vat;
    @Value("${app.discount}")
    private String discount;
}
