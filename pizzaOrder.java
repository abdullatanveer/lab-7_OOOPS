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
public class pizzaOrder {
private pizzza p1;
    private pizzza p2;
    private pizzza p3;
    
    public pizzaOrder(pizzza p1, pizzza p2,pizzza p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double calcTotal(){
        return p1.calcCost() + p2.calcCost()+ p3.calcCost();
    }



}
