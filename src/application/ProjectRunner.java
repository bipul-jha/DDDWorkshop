package application;

import com.ddd.workshop.domain.model.Cart;
import com.ddd.workshop.domain.model.Item;
import com.ddd.workshop.domain.model.Product;

public class ProjectRunner {

    public static void main(String[] args) {
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        Product iPadPro = new Product("iPad Pro");
        Product heroInkPen = new Product("Hero Ink Pen");
        Product gmCricketBat = new Product("GM Cricket Bat");

        Item iPadProItem = new Item(iPadPro, 1);
        Item heroInkPenItem = new Item(heroInkPen, 1);
        Item gmCricketBatItem = new Item(gmCricketBat, 2);

        cart1.addItem(iPadProItem);
        cart2.addItem(iPadProItem);

        System.out.println(cart1.equals(cart2));
//        cart.addItem(gmCricketBatItem);
//
//        cart.displayItems();
//
//        cart.removeItem(iPadProItem);
//
//        cart.displayDeletedItems();
    }
}
