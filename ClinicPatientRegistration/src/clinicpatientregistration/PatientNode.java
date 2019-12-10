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
class PatientNode {

       public Patient data;

       public PatientNode next;

       public PatientNode(Patient data, PatientNode next) {

             this.data = data;

             this.next = next;

       }
    
}
