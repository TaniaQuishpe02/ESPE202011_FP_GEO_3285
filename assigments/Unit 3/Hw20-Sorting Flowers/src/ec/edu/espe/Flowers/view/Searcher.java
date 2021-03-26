/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Flowers.view;

/**
 *
 * @author 10
 */
class Searcher {
    public static int SearchFlowers(String[]Flowers,String dataToFind){
     
        int n = Flowers.length;
        for (int i = 0; i < n ; i++) {
           
            if (dataToFind == null ? (Flowers[i]) == null : dataToFind.equals(Flowers[i])){
                return 1;
            }
        }
        return -1;
    }

   
}

