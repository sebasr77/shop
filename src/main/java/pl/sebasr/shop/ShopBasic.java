package pl.sebasr.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(("BASIC"))
@Service
public class ShopBasic implements Shop {

    @Override
    public String getInfo() {
        String showList = null;
        for (Product temp : shoppingCart.getProductList()) {
            showList = showList +
                    "---------Product{" +
                    "name='" + temp.getName() + '\'' +
                    '}' + "<br/>";
        }

        return showList;
    }

    @Autowired
    public ShopBasic(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    private ShoppingCart shoppingCart;
}
