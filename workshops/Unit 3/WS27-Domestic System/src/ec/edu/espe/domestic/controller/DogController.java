/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.domestic.controller;

import ec.edu.espe.domestic.model.Dog;
import utils.FileManager;

/**
 *
 * @author 10
 */
public class DogController {

    public static DogController dogController;

    private String dogs;
    public void save (Dog dog){
        
        String data = dog.getName() + ";" + dog.getColor()+ ";" + dog.getAge()+ ";" + dog.getHeight();
        
        FileManager.save(data, "dogs");
        
        
    }
   
        
        
        
    }


    

