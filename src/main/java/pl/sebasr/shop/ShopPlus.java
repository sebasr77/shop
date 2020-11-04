package pl.sebasr.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Profile(("PLUS"))
@ConfigurationProperties(prefix="app")
@Service
public class ShopPlus implements Shop{

    public void setVat(String vat) {
        this.vat = vat;
    }

    @Override
    public String getInfo() {
        String showList = "";
        for (Product temp : shoppingCart.getProductList()) {
            showList = showList +
                    "---------Product{" +
                    "name='" + temp.getName() + '\'' +
                    ", priceNet=" + temp.getPriceNet() +
                    ", VatRate=" + String.valueOf(temp.getPriceNet() * Float.parseFloat(vat) / 100) +
                    '}' + "<br/>";
        }

        return showList;
    }


    @Autowired
    public ShopPlus(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    private String vat;
    private ShoppingCart shoppingCart;


}



