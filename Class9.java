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
public class Class9 extends Decoration{

    public Class9(GeneralInt newCar) {
        super(newCar);
    }

    @Override
    public String getOption() {
        return myCar.getOption()+ "\n\t with VOICE-ACTIVATED NAVIGATION SYSTEM W/SONY AUDIO SYS";
    }
    
   public Double getPrice(){
       return myCar.getPrice()+ 800.00;
   }

    
}
