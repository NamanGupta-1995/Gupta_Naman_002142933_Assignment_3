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
public class Community {
    
    private String communityName;
    private int communityPostalCode;
    ArrayList<House> houses;



    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public int getCommunityPostalCode() {
        return communityPostalCode;
    }

    public void setCommunityPostalCode(int communityPostalCode) {
        this.communityPostalCode = communityPostalCode;
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }
    
    
    
}
