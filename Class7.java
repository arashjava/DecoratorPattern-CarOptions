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
public class Class7 extends Decoration{

    public Class7(GeneralInt newCar) {
        super(newCar);
    }

    @Override
    public String getOption() {
        return myCar.getOption()+ "\n\t with CARGO AREA PROTECTOR";
    }
    
   public Double getPrice(){
       return myCar.getPrice()+ 150.00;
   }


    
}
