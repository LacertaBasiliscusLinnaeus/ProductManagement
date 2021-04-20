/*
 * Copyright (C) 2021 LacertaBasiliscusLinnaeus
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.app;

import java.math.BigDecimal;
import java.util.Comparator;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

/**
 * {@code Shop} class represents an application that manages Products
 *
 * @version 4.0
 * @author LacertaBasiliscusLinnaeus
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var pm = new ProductManager("en-US");

        pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
//        pm.printProductReport(101);
        pm.reviewProduct(101, Rating.FIVE_STAR, "The best tea ever!");
        pm.reviewProduct(101, Rating.FOUR_STAR, "Nice hot cup of tea");
        pm.reviewProduct(101, Rating.TWO_STAR, "Reather weak tea");
        pm.reviewProduct(101, Rating.FOUR_STAR, "Fine tea");
        pm.reviewProduct(101, Rating.FOUR_STAR, "Good tea");
        pm.reviewProduct(101, Rating.FIVE_STAR, "Perfect tea");
        pm.reviewProduct(101, Rating.THREE_STAR, "Just add some lemon");
//        pm.printProductReport(101);

//        pm.changeLocale("ru-RU");
        pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
//        pm.printProductReport(102);
        pm.reviewProduct(102, Rating.THREE_STAR, "Coffee was ok");
        pm.reviewProduct(102, Rating.ONE_STAR, "Where is the milk!?");
        pm.reviewProduct(102, Rating.FIVE_STAR, "It's perfect with ten spoons of sugar!");
//        pm.printProductReport(102);

        pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.NOT_RATED);
        pm.reviewProduct(103, Rating.FIVE_STAR, "Coffee was ok");
        pm.reviewProduct(103, Rating.FOUR_STAR, "Where is the milk!?");
        pm.reviewProduct(103, Rating.FIVE_STAR, "It's perfect with ten spoons of sugar!");
//        pm.printProductReport(103);

        pm.createProduct(104, "Cookie", BigDecimal.valueOf(2.99), Rating.NOT_RATED);
        pm.reviewProduct(104, Rating.THREE_STAR, "Coffee was ok");
        pm.reviewProduct(104, Rating.THREE_STAR, "Where is the milk!?");
//        pm.printProductReport(104);

        pm.createProduct(105, "Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED);
        pm.reviewProduct(105, Rating.FOUR_STAR, "Coffee was ok");
        pm.reviewProduct(105, Rating.FOUR_STAR, "Where is the milk!?");
//        pm.printProductReport(105);

        pm.createProduct(106, "Hot Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED);
        pm.reviewProduct(106, Rating.TWO_STAR, "Coffee was ok");
        pm.reviewProduct(106, Rating.THREE_STAR, "Where is the milk!?");
        pm.reviewProduct(106, Rating.TWO_STAR, "It's perfect with ten spoons of sugar!");
        pm.reviewProduct(106, Rating.ONE_STAR, "Where is the milk!?");
        pm.printProductReport(106);

        Comparator<Product> ratingSorter = (p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal();
        Comparator<Product> priceSorter = (p1, p2) -> p2.getPrice().compareTo(p1.getPrice());

        pm.printProducts(p -> p.getPrice().floatValue() < 2, ratingSorter);
//        pm.printProducts(priceSorter);
//        pm.printProducts(ratingSorter.thenComparing(priceSorter));
    }

}
