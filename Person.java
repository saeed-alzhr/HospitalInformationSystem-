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
public class Person {
    private int uniqueID;
    private String fistName;
    private String lastName;
    private String mobileNumber;
    private String email;
   

    /**
     * @return the uniqueID
     */
    public int getUniqueID() {
        return uniqueID;
    }

    /**
     * @param uniqueID the uniqueID to set
     */
    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    /**
     * @return the fistName
     */
    public String getFistName() {
        return fistName;
    }

    /**
     * @param fistName the fistName to set
     */
    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the mobilePhoneNumber
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * @param mobileNumber the mobilePhoneNumber to set
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

   
    
}
