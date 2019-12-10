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
       public Patient(String name, String age, String gender, String address, String phone, String id, int arrival, int priority) {

             this.Name = name;
             this.Age=age;
             this.Gender=gender;
             this.Address=address;
             this.Phone=phone;
             this.ID=id;
             
             this.Arrival = arrival;
             this.Priority = priority;

       }

     public int checkSeverity(Patient other) {

             if (other.Priority == Priority)

                    return (Arrival - other.Arrival);//if value returned > 0, other is admitted firstly

             else

                    return (other.Priority - Priority);//if value returned > 0, other is admitted firstly

       }

    public boolean isAdmittedBefore(Patient other, int lastArrival) {

             boolean before;

             int priority2, otherPriority;

             if (Priority == 3) {

                    // admitted before, unless the other's Priority is 3 and arrived

                    // earlier

                    before = (other.Priority != 3) || (other.Arrival > Arrival);

             } else if (other.Priority == 3) {

                    before = false;

             } else {

                    priority2 = (lastArrival - Arrival) * Priority;

                    otherPriority = (lastArrival - other.Arrival) * other.Priority;

                    before = (priority2 > otherPriority)

                                 || ((priority2 == otherPriority) && other.Arrival > Arrival);

             }

             return before;

       }
    
     
}
