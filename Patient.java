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
public class Patient extends Person{
    private char checkTy;
private double bill;
enum type{A,B}

    /**
     * @return the checkTy
     */
    public char getCheckTy() {
        return checkTy;
    }

    /**
     * @param checkTy the checkTy to set
     */
    public void setCheckTy(char checkTy) {
        this.checkTy = checkTy;
        
    }

    /**
     * @return the bill
     */
    public double getBill() {
        return bill;
    }

    /**
     * @param bill the bill to set
     */
    public void setBill(double bill) {
        this.bill = bill;
        //check the patient type
        if(checkTy=='A'){
        type Atype=type.A;
        
        if(Atype==type.A){
            this.bill=bill*0.4;//40% discount for type A patient 
        }
        }
    }
}
