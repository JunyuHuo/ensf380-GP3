public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;
    
    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        this.occupants = new DisasterVictim[0];
        this.supplies = new Supply[0];
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public DisasterVictim[] getOccupants() {
        return occupants;
    }
    
    public void setOccupants(DisasterVictim[] occupants) {
        this.occupants = occupants;
    }
    
    public Supply[] getSupplies() {
        return supplies;
    }
    
    public void setSupplies(Supply[] supplies) {
        this.supplies = supplies;
    }
    
    public void addOccupant(DisasterVictim occupant) {
        DisasterVictim[] newOccupants = new DisasterVictim[occupants.length + 1];
        for (int i = 0; i < occupants.length; i++) {
            newOccupants[i] = occupants[i];
        }
        newOccupants[occupants.length] = occupant;
        occupants = newOccupants;
    }
    
    public void removeOccupant(DisasterVictim occupant) {
        int removeIndex = -1;
        for (int i = 0; i < occupants.length; i++) {
            if (occupants[i] == occupant) {
                removeIndex = i;
                break;
            }
        }
        
        if (removeIndex != -1) {
            DisasterVictim[] newOccupants = new DisasterVictim[occupants.length - 1];
            for (int i = 0; i < removeIndex; i++) {
                newOccupants[i] = occupants[i];
            }
            for (int i = removeIndex; i < newOccupants.length; i++) {
                newOccupants[i] = occupants[i + 1];
            }
            occupants = newOccupants;
        }
    }
    
    public void addSupply(Supply supply) {
        Supply[] newSupplies = new Supply[supplies.length + 1];
        for (int i = 0; i < supplies.length; i++) {
            newSupplies[i] = supplies[i];
        }
        newSupplies[supplies.length] = supply;
        supplies = newSupplies;
    }
    
    public void removeSupply(Supply supply) {
        int removeIndex = -1;
        for (int i = 0; i < supplies.length; i++) {
            if (supplies[i] == supply) {
                removeIndex = i;
                break;
            }
        }
        
        if (removeIndex != -1) {
            Supply[] newSupplies = new Supply[supplies.length - 1];
            for (int i = 0; i < removeIndex; i++) {
                newSupplies[i] = supplies[i];
            }
            for (int i = removeIndex; i < newSupplies.length; i++) {
                newSupplies[i] = supplies[i + 1];
            }
            supplies = newSupplies;
        }
    }
}