/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaaRunner;

/**
 *
 * @author abdul
 */
public class pizzaaRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pizzza p1 = new pizzza("large", 1, 1, 2);
	pizzza p2 = new pizzza("large", 1, 1, 4);
	pizzza p3 = new pizzza("medium", 2, 2, 1);
        pizzaOrder p = new pizzaOrder(p1,p2,p3);
        System.out.println("Cost of the three ordered pizza:$"+p.calcTotal());

	System.out.println(p1.getDescription());
	System.out.println(p2.getDescription());
	System.out.println(p3.getDescription());
    }
    
}
