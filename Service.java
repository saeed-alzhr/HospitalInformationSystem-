/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalSystem;

/**
 *
 * @author mmmz
 */
public class Service {
     private String Name;
      private int uniqueID;
     private double price;
  
  
    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the uniqueID
     */
    public int getUniqueID() {
        return uniqueID;
    }

    /**
     * @param uniqueID
     * 
          */
    public void setUniqueID(int uniqueID){
        
                        
                        
        this.uniqueID = uniqueID;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    

   
    
}
