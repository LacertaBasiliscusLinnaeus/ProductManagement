/*
 * Copyright (C) 2021 VASILYK
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
import java.util.Locale;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

/**
 * {@code Shop} class represents an application that manages Products
 *
 * @version 4.0
 * @author VASILYK
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var pm = new ProductManager(Locale.forLanguageTag("ru-RU"));
        var p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.printProductReport();
        p1 = pm.reviewProduct(p1, Rating.FIVE_STAR, "The best tea ever!");
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Nice hot cup of tea");
        p1 = pm.reviewProduct(p1, Rating.TWO_STAR, "Reather weak tea");
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Fine tea");
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Good tea");
        p1 = pm.reviewProduct(p1, Rating.FIVE_STAR, "Perfect tea");
        p1 = pm.reviewProduct(p1, Rating.THREE_STAR, "Just add some lemon");
        pm.printProductReport();

//        var p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.THREE_STAR);
//        var p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//        var p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//
//        var p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());
//        var p5 = p3.applyRating(Rating.THREE_STAR);
//
//        var p6 = pm.createProduct(104, "Chokolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
//        var p7 = pm.createProduct(104, "Chokolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//
//        var p8 = p4.applyRating(Rating.FIVE_STAR);
//        var p9 = p1.applyRating(Rating.TWO_STAR);
//        if (p3 instanceof Food) {
//            LocalDate bestBefore = ((Food) p3).getBestBefore();
//        }
//        System.out.println(p1.getBestBefore());
//        System.out.println(p3.getBestBefore());
//
//        System.out.println(p6.equals(p7));
//
//        Product[] products = {p1, p2, p3, p4, p5, p6, p7, p8, p9};
//
//        for (var p : products) {
//            System.out.println(p);
//        }
    }

}
