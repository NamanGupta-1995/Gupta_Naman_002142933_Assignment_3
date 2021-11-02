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
public class City {
    
    private String cityName;
    ArrayList<Community> communities;

    public City() {
        this.cityName = cityName;
        this.communities = new ArrayList<Community>();
    }
    
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }
    
    public Community createPerson() {
        Community community = new Community();
        communities.add(community);
        return community;
    }

    
}
