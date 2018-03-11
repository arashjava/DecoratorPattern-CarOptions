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
public class Class1 extends Decoration{
  
    public Class1(GeneralInt newCar) {
        super(newCar);
    }

    @Override
    public String getOption() {
        return myCar.getOption()+ "\n\t With Sport body";
    }
    
   public Double getPrice(){
       return myCar.getPrice()+ 3000.00;
   }

    
}
