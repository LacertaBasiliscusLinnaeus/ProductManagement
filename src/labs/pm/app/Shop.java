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
        var pm = new ProductManager("en-US");

        var p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.printProductReport(p1);
        p1 = pm.reviewProduct(p1, Rating.FIVE_STAR, "The best tea ever!");
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Nice hot cup of tea");
        p1 = pm.reviewProduct(p1, Rating.TWO_STAR, "Reather weak tea");
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Fine tea");
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Good tea");
        p1 = pm.reviewProduct(p1, Rating.FIVE_STAR, "Perfect tea");
        p1 = pm.reviewProduct(p1, Rating.THREE_STAR, "Just add some lemon");
        pm.printProductReport(p1);

        pm.changeLocale("ru-RU");

        var p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.printProductReport(p2);
        p2 = pm.reviewProduct(p2, Rating.THREE_STAR, "Coffee was ok");
        p2 = pm.reviewProduct(p2, Rating.ONE_STAR, "Where is the milk!?");
        p2 = pm.reviewProduct(p2, Rating.FIVE_STAR, "It's perfect with ten spoons of sugar!");
        pm.printProductReport(p2);
    }

}
