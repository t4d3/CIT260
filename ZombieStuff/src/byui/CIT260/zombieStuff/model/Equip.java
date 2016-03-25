/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.model;

import java.util.Objects;

/**
 *
 * @author T4d3-T550
 */
public class Equip {

    private Integer AttributeDefence;
    private Integer AttributeAttack;
    private Integer ObjectID;

    public Integer getAttributeDefence() {
        return AttributeDefence;
    }

    public void setAttributeDefence(Integer AttributeDefence) {
        this.AttributeDefence = AttributeDefence;
    }

    public Integer getAttributeAttack() {
        return AttributeAttack;
    }

    public void setAttributeAttack(Integer AttributeAttack) {
        this.AttributeAttack = AttributeAttack;
    }

    public Integer getObjectID() {
        return ObjectID;
    }

    public void setObjectID(Integer ObjectID) {
        this.ObjectID = ObjectID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.ObjectID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equip other = (Equip) obj;
        if (!Objects.equals(this.AttributeDefence, other.AttributeDefence)) {
            return false;
        }
        if (!Objects.equals(this.AttributeAttack, other.AttributeAttack)) {
            return false;
        }
        return Objects.equals(this.ObjectID, other.ObjectID);
    }

    @Override
    public String toString() {
        return "Equip{" + "AttributeDefence=" + AttributeDefence + ", AttributeAttack=" + AttributeAttack + ", ObjectID=" + ObjectID + '}';
    }

}
