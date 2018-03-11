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
public class Car implements GeneralInt{

      @Override
    public String getOption() {
        return "Ford Escape";
    }

    @Override
    public Double getPrice() {
        return 20000.00;
    }


}
