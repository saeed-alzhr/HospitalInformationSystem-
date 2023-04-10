/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mmmz
 */
public class HospitalSystem {
     
     public static void main(String[] args) throws DuplicteServiceidExcption {
        
       System.out.printf("\t**********************************************\n");
        System.out.printf("\t\tWelcome to My Hospital System \n");
        System.out.printf("\tStudent #1: Saeed Hassan Al-zharani,44200780,Group 4 \n");
        System.out.printf("\t**********************************************\n");
        System.out.println("Please enter the number of your choice (enter 9 to exit)");
         System.out.println("--------------------------------------------------------------");
      
        //print the menu for one time only 
        System.out.println("1.Add a doctor");
        System.out.println("2.Add a service ");
        System.out.println("3.Add a patient");
        System.out.println("4.Print all doctors information ");
        System.out.println("5.Print all patients information ");
        System.out.println("6.Display specific doctor data ");
        System.out.println("7.Display specific patient data ");
        System.out.println("8.Print specific patient's bill ");
        System.out.println("9.Exit the program");
        System.out.println("");
        System.out.println("Please choose a choice between 1 and 9");
        int num=0; 
        Scanner in= new Scanner(System.in);
        //set the first Administration
        Administration A1=new Administration();
        A1.setFistName("Ahmad");
        A1.setLastName("Umar");
        A1.setMobileNumber("055550543");
        A1.setUniqueID(1423);
        A1.setEmail("AhmadUmar@gmail.com");
        A1.setPosition("CEO");
        A1.setSalary(55890.80);
        //set the second Administration
        Administration A2=new Administration();
        A2.setFistName("fasial");
        A2.setLastName("al-harabi");
        A2.setMobileNumber("053250543");
        A2.setUniqueID(1390);
        A2.setEmail("fasialharabi@gmail.com");
        A2.setPosition("manager");
        A2.setSalary(45590.40);
        //set the thired Administration
        Administration A3=new Administration();
        A3.setFistName("Mohammad");
        A3.setLastName("al-Ghamedi");
        A3.setMobileNumber("055477382");
        A3.setUniqueID(1850);
        A3.setEmail("Mohammad323@gmail.com");
        A3.setPosition("co-manager");
        A3.setSalary(40590.40);
        List<Doctor> doctors= new ArrayList<>();
        //set a first doctor
        Doctor D1=new Doctor();
        D1.setFistName("saeed");
        D1.setLastName("gouman");
        D1.setMobileNumber("0543234324");
        D1.setRank("79");
        D1.setEmail("saeedgom@gmail.com");
        D1.setSalary(20623.33);
        D1.setSpecialty("internist");
        D1.setUniqueID(9012);
        doctors.add(D1);
        //set a first doctor
        Doctor D2=new Doctor();
        D2.setFistName("naseer");
        D2.setLastName("kareem");
        D2.setMobileNumber("054342424");
        D2.setRank("90");
        D2.setEmail("naseedkRE@gmail.com");
        D2.setSalary(45653.33);
        D2.setSpecialty("Surgeon");
        D2.setUniqueID(6504);
        doctors.add(D2);
        //check if the user know one of the Administrations
        for(int S=0;S<10;S++){
        System.out.println("please enter one of the Administors name :");
           Scanner ins=new Scanner(System.in);
           String checkAd=ins.nextLine();
           if(checkAd.equalsIgnoreCase(A1.getFistName())||checkAd.equals(A2.getFistName())||checkAd.equals(A3.getFistName())){
           System.out.printf("Welcome\nchose a number from 1 to 9\n");
           S=11;//to stop the loop if the condation is true 
           }else{ System.out.println("please try again:"); //print a mesage to the user 
         
           }
        }
           //creat the patient and services list
           List<Patient> patients= new ArrayList<>();
            List<Service> services= new ArrayList<>();
            
            
        while(num!=9){
        //take the user choice and implement the choice case 
       num=in.nextInt();
        
          switch (num) {
               case 1 -> {
                  
                   Scanner in1=new Scanner(System.in);//scane the user information
                       //take doctor first name
                       System.out.println("please enter the new dector first name:");
                       String firstName =in1.nextLine();
                       //check if the name has number and print error if it true
                       boolean i = firstName.matches(".*\\d.*");
                       if(i==true){
                       System.err.println("Doctor name can not have any number\n please try again:");
                       firstName=in1.nextLine();//clear the scanner buffer and assign a new valid value
                       }
                       //take doctor last name
                       System.out.println("please enter the new doctor last name:");
                       String lastName =in1.nextLine();
                       //take doctor email
                       System.out.println("please enter the new doctor email:");
                       String email =in1.nextLine();
                       //take doctor ID
                       System.out.println("please enter the new doctor uniqueID:");
                       int uniqueID=in1.nextInt();
                       //check if the enterd ID is has been taken befor
                       for(int j=0;j<doctors.size();j++){
                           if(doctors.get(j).getUniqueID()==uniqueID){
                               System.err.print("This ID is alredy taken");
                                uniqueID=in1.nextInt();
                           
                           }
                       }
                       //take doctor mobile number
                       System.out.println("please enter the new doctor mobilenumber:");
                       String mobilenumber=in1.nextLine();
                       
                       boolean checkErr3=mobilenumber.matches("-?\\d+");
                       
                       if(checkErr3==false){
                           System.err.println("doctor mobilenumber can not have any lettrs\n please try again:");
                           mobilenumber=in1.nextLine();//clear the scanner buffer and assign a new valid value
                       }
                       //take doctor rank
                       System.out.println("please enter the new doctor rank:");
                       String rank=in1.nextLine();
                       //take doctor specialty
                       System.out.println("please enter the new doctor specialty:");
                       String specialty=in1.nextLine();
                       //take doctor salary
                       System.out.println("please enter the new doctor salary:");
                       double salary=in1.nextDouble();
                       
                       Doctor D =new Doctor();
                       //set doctor information 
                       D.setFistName(firstName);
                       D.setEmail(email);
                       D.setLastName(lastName);
                       D.setUniqueID(uniqueID);
                       D.setMobileNumber(mobilenumber);
                       D.setRank(rank);
                       D.setSpecialty(specialty);
                       D.setSalary(salary);
                       doctors.add(D);//adding a new opject to the arryalist 
                       System.out.println("you have added a new doctor");
                        break;
                   }
                    
               
               case 2 ->{
                   Scanner in1=new Scanner(System.in);//scane the user information
                       //take service  name
                       System.out.println("please enter the new service name:");
                       String Name =in1.nextLine(); 
                       //take service ID
                       System.out.println("please enter the new service ID:");
                       int serviceID =in1.nextInt();
                       //check and throw the costom Excption
                       for (int i3=0;i3<services.size();i3++){
               if(services.get(i3).getUniqueID()==serviceID){
               throw new DuplicteServiceidExcption("invalid service ID\n This service ID is alredy utilized ");
               }   
                       }
                       System.out.println("please enter the new service price:");
                       double price =in1.nextDouble();//thke the service price
                       //set the service information
                       Service S=new Service();
                       S.setName(Name);
                       S.setPrice(price);
                       S.setUniqueID(serviceID);
                       services.add(S);//adding the opject to the array list
                       
                       
                       
                       System.out.println("you have added a new service");
                      break;
                    }
               
               case 3->{
               Scanner in1=new Scanner(System.in);//scane the user information
                       //take patient first name
                       System.out.println("please enter the new patient first name:");
                       String firstName =in1.nextLine();
                       //check if the name has numbers and print error if it true
                       boolean i = firstName.matches(".*\\d.*");
                       if(i==true){
                       System.err.println("patient name can not have any number\n please try again:");
                       firstName=in1.nextLine();//clear the scanner buffer and assign a new valid value
                       }
                       //take patient last name
                       System.out.println("please enter the new patient last name:");
                       String lastName =in1.nextLine();
                       //take patient email
                       System.out.println("please enter the new patient email:");
                       String email =in1.nextLine();
                       //take patient ID
                       System.out.println("please enter the new patient uniqueID:");
                       int uniqueID=in1.nextInt();
                       //check if the enterd ID is alredy taken or not
                       for(int j=0;j<patients.size();j++){
                           if(patients.get(j).getUniqueID()==uniqueID){
                               System.err.print("This ID is alredy taken");
                                uniqueID=in1.nextInt();
                           
                           }
                       }
                       //take patient mobile number
                       System.out.println("please enter the new patient mobilenumber:");
                       String mobilenumber=in1.nextLine();
                       //check the mobile number if it has leetrs 
                       boolean checkErr3=mobilenumber.matches("-?\\d+");
                       if(checkErr3==false){
                           System.err.println("patient mobilenumber can not have any lettrs\n please try again:");
                           mobilenumber=in1.nextLine();//clear the scanner buffer and assign a new valid value
                       }
                       
                       System.out.println("please enter the new patient tybe:");//take patient tybe
                        char checkTy=in1.next().charAt(0);
                        System.out.println("How many services dose the patient received:");
                        int res=in1.nextInt();//take the number of servises
                        //looping to get all the services that the patient has take
                        for(int j = 0;j<res;j++){
                          System.out.println("Enter the patient service uniqueID:");
                        int CheckNa=in1.nextInt();// get the service that the patient has taken 
                        double bill=0.0;
                         for (int i2=0;i2<services.size();i2++){//looping to get check the service that the patient has taken
                        if(CheckNa==services.get(i2).getUniqueID()){
                                bill=services.get(i2).getPrice()+bill;//set the bill
                        
                        Patient P =new Patient();//creat the opject to save the information
                      
                       //set patient information 
                       P.setFistName(firstName);
                       P.setEmail(email);
                       P.setLastName(lastName);
                       P.setUniqueID(uniqueID);
                       P.setMobileNumber(mobilenumber);
                       P.setCheckTy(checkTy);
                       P.setBill(bill);
                       patients.add(P);//adding a new opject to the arryalist 
                       
                        }
                         }
                    }System.out.println("you have added a new patient");
        
                      
                       break;
                    }

                case 4->{
                    String output;
               for (int i=0;i<doctors.size();i++) {//looping to get all the doctors
                    //set the doctor information to output
                   output="FIRST NAME: "+doctors.get(i).getFistName()+"  LAST NAME  "+doctors.get(i).getLastName()+ "  UNIQUE ID: "+doctors.get(i).getUniqueID()+"  MOBILE NUMBER: "+doctors.get(i).getMobileNumber()+"  EMAIL: "+doctors.get(i).getEmail()+"  RANK: "+doctors.get(i).getRank()+"  SPECIALTY: "+doctors.get(i).getSpecialty()+"  SALARY: "+doctors.get(i).getSalary()+"$$";
                   System.out.println(output);//print the doctors informations
               }
                }
                case 5->{
                    String output;
               for (int i=0;i<patients.size();i++) {//looping to get all the patients
                   //set the patients information to output
                   output="FIRST NAME: "+patients.get(i).getFistName()+"  LAST NAME  "+patients.get(i).getLastName()+ "  UNIQUE ID: "+patients.get(i).getUniqueID()+"  MOBILE NUMBER: "+patients.get(i).getMobileNumber()+"  EMAIL: "+patients.get(i).getEmail()+"   Type:  "+patients.get(i).getCheckTy();
                   System.out.println(output);//print the patients informations
               }
                }
                case 6->{
                    Scanner in1=new Scanner(System.in);
                     System.out.println("Enter the doctor ID that you loking for:");
                    int CheckID=in1.nextInt();
                    String output;
               for (int i=0;i<doctors.size();i++) {//looping to get the doctor that you loking for
                    if(CheckID==doctors.get(i).getUniqueID()){//the loop condation 
                        //set all the doctor information to output
                   output="FIRST NAME: "+doctors.get(i).getFistName()+"  LAST NAME  "+doctors.get(i).getLastName()+ "  UNIQUE ID: "+doctors.get(i).getUniqueID()+"  MOBILE NUMBER: "+doctors.get(i).getMobileNumber()+"  EMAIL: "+doctors.get(i).getEmail()+"  RANK: "+doctors.get(i).getRank()+"  SPECIALTY: "+doctors.get(i).getSpecialty()+"  SALARY: "+doctors.get(i).getSalary()+"$$";
                    System.out.println(output);//print doctor information
                    break;
                    } else System.out.println("The doctor your looking for not found!!");//print only if doctor is not found
               } 
                }
                 case 7->{
                    Scanner in1=new Scanner(System.in);
                     System.out.println("Enter the patient ID that you loking for:");
                    int CheckID=in1.nextInt();
                    String output;
               for (int i=0;i<patients.size();i++){//looping to get the patient that you want to print his information
                    if(CheckID==patients.get(i).getUniqueID()){
                        //set all the patient information to output
                   output="FIRST NAME: "+patients.get(i).getFistName()+"  LAST NAME  "+patients.get(i).getLastName()+ "  UNIQUE ID: "+patients.get(i).getUniqueID()+"  MOBILE NUMBER: "+patients.get(i).getMobileNumber()+"  EMAIL: "+patients.get(i).getEmail()+"   Type:  "+patients.get(i).getCheckTy();
                    System.out.println(output);//print the patient information
                    break;
                    }else System.out.println("The patient your looking for not found!!");//print only if patient not found  
               }
                }
                  case 8->{
                    Scanner in1=new Scanner(System.in);
                     System.out.println("Enter the patient ID that you want to print bill for:");
                    int CheckID=in1.nextInt();//to check the patient ID to print the bill
                    
               for (int i=0;i<patients.size();i++){//looping to check all patients IDs
                    if(CheckID==patients.get(i).getUniqueID()){//the condation of checking the ID
                    System.out.println("service received: "+patients.get(i).getBill());//print the bill
                    
                   

                    }else System.out.println("The patient your looking for not found!!");//print a message to user 
                   
                   
               }
               break;
                }
                  //print if the choice is not from 1 to 9
                  default ->{
                  System.out.println("Not vaild option");
                  
                  }

                   
           }
          // keep printing the menu
        System.out.println("1.Add a doctor");
        System.out.println("2.Add a service ");
        System.out.println("3.Add a patient");
        System.out.println("4.Print all doctors information ");
        System.out.println("5.Print all patients information ");
        System.out.println("6.Display specific doctor data ");
        System.out.println("7.Display specific patient data ");
        System.out.println("8.Print specific patient's bill ");
        System.out.println("9.Exit the program");
        System.out.println("");
        System.out.println("Please choose a choice between 1 and 9");
        System.out.println("\n");
        }
         System.out.println("Exiting from the program");
     }    
}
     
