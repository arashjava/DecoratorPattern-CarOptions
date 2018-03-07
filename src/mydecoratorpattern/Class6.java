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
public class Class6 extends Decoration{

    public Class6(GeneralInt newCar) {
        super(newCar);
    }

    @Override
    public String getOption() {
        return myCar.getOption()+ "\n\t with ALL-WEATHER FLOOR MATS";
    }
    
   public Double getPrice(){
       return myCar.getPrice()+ 150.00;
   }


    
}
