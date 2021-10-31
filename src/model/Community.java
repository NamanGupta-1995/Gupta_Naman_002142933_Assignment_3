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

    public Community(String communityName, int communityPostalCode) {
        this.communityName = communityName;
        this.communityPostalCode = communityPostalCode;
        this.houses = new ArrayList<House>();
    }
    
    
    
}
