/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis3238_lab01;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CIS3238_Lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2016, 3, 11);
        MyDate d2 = new MyDate(2015, 2, 10);
        
        int diff = d1.daysTo(d2);
        System.out.println(diff);
        
        Result result = JUnitCore.runClasses(cis3238_lab01.TestJunit.class);
        
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        
        
    }
    
}
