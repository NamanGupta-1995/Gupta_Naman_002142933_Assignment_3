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
public class VitalSignHistory {
    
    ArrayList<VitalSigns> vitalSignHistory;

    public VitalSignHistory() {
        this.vitalSignHistory = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSign() {
        return vitalSignHistory;
    }

    public void setVitalSign(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public VitalSigns createAndAddVitalSign() {
        VitalSigns vitalSign = new VitalSigns();
        vitalSignHistory.add(vitalSign);
        return vitalSign;
    }

    public void addVitalSigns(VitalSigns vs){
        vitalSignHistory.add(vs);
        
    }
    public void deleteVitalSign(VitalSigns vitalSign) {
        vitalSignHistory.remove(vitalSign);
    }
    
}
