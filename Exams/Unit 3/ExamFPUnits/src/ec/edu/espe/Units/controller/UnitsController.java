/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Units.controller;

import com.sun.javafx.print.Units;
import ec.edu.espe.Units.Model.unit;

/**
 *
 * @author 10
 */
public class UnitsController {

    public static UnitsController unitsController;

    private String units;
    public void save (Units unit){
        
        String data = ";"+ unit.getOnedayhas() + ";" + unit.getOnehourhas() + unit.getOneminutehas()+ ";" + unit.getHowmanyminutesis();
        
        FileManager.save(data, "units");
        
        
    }
   
        
        
        
    }
    
}
