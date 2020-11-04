package pl.sebasr.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopControler {

    @GetMapping
    public String get() {
        return shopService.getShoppingCart();
    }

    @Autowired
    public ShopControler(ShopService shopService) {
        this.shopService = shopService;
    }

    private ShopService shopService;
}
