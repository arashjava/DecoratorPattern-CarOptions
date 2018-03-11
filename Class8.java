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
public class Class8 extends Decoration{

    public Class8(GeneralInt newCar) {
        super(newCar);
    }

    @Override
    public String getOption() {
        return myCar.getOption()+ "\n\t with ROOF RACK CROSSBARS";
    }
    
   public Double getPrice(){
       return myCar.getPrice()+ 150.00;
   }


    
}
