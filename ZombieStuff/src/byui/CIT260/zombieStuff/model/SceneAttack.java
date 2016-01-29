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
public class SceneAttack {
    private String Description;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.Description);
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
        final SceneAttack other = (SceneAttack) obj;
        return Objects.equals(this.Description, other.Description);
    }

    @Override
    public String toString() {
        return "SceneAttack{" + "Description=" + Description + '}';
    }

}
