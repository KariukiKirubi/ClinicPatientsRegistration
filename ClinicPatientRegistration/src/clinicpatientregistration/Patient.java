/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicpatientregistration;

/**
 *
 * @author karis
 */
class Patient {
    
    //Declare all the variables to be used
       public String Name;
       public String Age;
       public String Gender;
       public String Address;
       public String Phone;
       public String ID;

       public int Arrival;
       public int Priority;

       //initialise the variable with in the constructer
       public Patient(String name, String age, String gender, String address, String phone, String ID, int arrival, int priority) {

             this.Name = name;
             this.Age=age;
             this.Gender=gender;
             this.Address=address;
             this.Phone=phone;
             
             this.Arrival = arrival;
             this.Priority = priority;

       }
}
