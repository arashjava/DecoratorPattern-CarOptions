/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydecoratorpattern;

/**
 *
 * @author arash
 */
public class Class5 extends Decoration{

    public Class5(GeneralInt newCar) {
        super(newCar);
    }

    @Override
    public String getOption() {
        return myCar.getOption()+ "\n\t with ADAPTIVE CRUISE CONTRO";
    }
    
   public Double getPrice(){
       return myCar.getPrice()+ 1350.00;
   }


    
}
