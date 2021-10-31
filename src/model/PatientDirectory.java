/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author namangupta
 */
public class PatientDirectory {
    
    ArrayList<Patient> patientDirectory;

    public PatientDirectory() {
        this.patientDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatients() {
        return patientDirectory;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patientDirectory = patients;
    }
    
    public Patient addPatient(){
        Patient patient = new Patient();
        patientDirectory.add(patient);
        return patient;
    }
    
    public void deletePerson(Patient patient) {
        patientDirectory.remove(patient);
    }
    
    public void addOrUpdatePatient(Patient patient){
        patientDirectory.add(patient);
    }
}
