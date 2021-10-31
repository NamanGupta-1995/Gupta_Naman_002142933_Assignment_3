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
public class PersonDirectory {
    
    ArrayList<Person> personDirectory;

    public PersonDirectory() {
        this.personDirectory = new ArrayList<Person>();
    }
    
    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonHDirectory(ArrayList<Person> personHistory) {
        this.personDirectory = personHistory;
    }
    
    public Person createPerson() {
        Person person = new Person();
        personDirectory.add(person);
        return person;
    }
    
    public void deletePerson(Person person) {
        personDirectory.remove(person);
    }
    
    public void addAndUpdatePerson(Person person){
        personDirectory.add(person);
    }
}
