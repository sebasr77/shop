package pl.sebasr.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService {

    @Autowired
    public ShopService(Shop shop) {
        this.shop = shop;

    }

    private Shop shop;

    public String getShoppingCart() {
        return shop.getInfo();
    }

}
