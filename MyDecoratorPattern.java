/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydecoratorpattern;

import java.util.Scanner;

/**
 *
 * @author arash
 */
public class MyDecoratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        showOptions();
    }
    
    private static void showOptions(){
        Scanner sc =null;
        GeneralInt car = null;
        car = new Car();   // just the prime price
        System.out.println("Option: "+ car.getOption());
        System.out.println("Price: "+ car.getPrice());
        
        System.out.println("ADDITIONAL EQUIPMENT:");
        System.out.println("\t 1: Sport body. Add $3000     1= Yes   2= No ");  
        sc=new Scanner(System.in);
        if (sc.nextInt()==1){ 
            car = new Class1(car);  
            System.out.println("Option: "+ car.getOption());
            System.out.println("Price: "+ car.getPrice());
        }

        System.out.println("ADDITIONAL EQUIPMENT:");
        System.out.println("\t 2: CANADIAN TOURING PACKAG. Add $1200    1= Yes   2= No "); 
        sc=new Scanner(System.in);
        if (sc.nextInt()==1){ 
            car = new Class2(car);  
            System.out.println("Option: "+ car.getOption());
            System.out.println("Price: "+ car.getPrice());
        }

        System.out.println("ADDITIONAL EQUIPMENT:");
        System.out.println("\t 3: CLASS II TRAILER TOW. Add $500    1= Yes   2= No ");  
        sc=new Scanner(System.in);
        if (sc.nextInt()==1){ 
            car = new Class3(car);  
            System.out.println("Option: "+ car.getOption());
            System.out.println("Price: "+ car.getPrice());
        }

        System.out.println("ADDITIONAL EQUIPMENT:");
        System.out.println("\t 4: TITANIUM SPORT APPEARANCE PACKAGE Add $1200   1= Yes   2= No "); 
        sc=new Scanner(System.in);
        if (sc.nextInt()==1){ 
            car = new Class4(car); 
            System.out.println("Option: "+ car.getOption());
            System.out.println("Price: "+ car.getPrice());
        }    
        
        System.out.println("ADDITIONAL EQUIPMENT:");
        System.out.println("\t 5: ADAPTIVE CRUISE CONTROL. Add $1350     1= Yes   2= No "); 
        sc=new Scanner(System.in);
        if (sc.nextInt()==1){ 
            car = new Class5(car); 
            System.out.println("Option: "+ car.getOption());
            System.out.println("Price: "+ car.getPrice());
        }
        
        System.out.println("ADDITIONAL EQUIPMENT:");
        System.out.println("\t 6: ALL-WEATHER FLOOR MATS. Add $150     1= Yes   2= No "); 
        sc=new Scanner(System.in);
        if (sc.nextInt()==1){ 
            car = new Class6(car); 
            System.out.println("Option: "+ car.getOption());
            System.out.println("Price: "+ car.getPrice());
        }        
        
        
        System.out.println("ADDITIONAL EQUIPMENT:");
        System.out.println("\t 7: CARGO AREA PROTECTOR. Add $150     1= Yes   2= No "); 
        sc=new Scanner(System.in);
        if (sc.nextInt()==1){ 
            car = new Class7(car); 
            System.out.println("Option: "+ car.getOption());
            System.out.println("Price: "+ car.getPrice());
        }                
        
        System.out.println("ADDITIONAL EQUIPMENT:");
        System.out.println("\t 8: ROOF RACK CROSSBARS. Add $150     1= Yes   2= No "); 
        sc=new Scanner(System.in);
        if (sc.nextInt()==1){ 
            car = new Class8(car); 
            System.out.println("Option: "+ car.getOption());
            System.out.println("Price: "+ car.getPrice());
        }                
        
        System.out.println("ADDITIONAL EQUIPMENT:");
        System.out.println("\t 9: VOICE-ACTIVATED NAVIGATION SYSTEM W/SONY AUDIO SYS. Add $800     1= Yes   2= No "); 
        sc=new Scanner(System.in);
        if (sc.nextInt()==1){ 
            car = new Class9(car); 
            System.out.println("Option: "+ car.getOption());
            System.out.println("Price: "+ car.getPrice());
        }                

        System.out.println("\n\n Final price is: "+ car.getPrice());

    }

}
