public class FamilyRelation {
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;
    
    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo) {
        this.personOne = personOne;
        this.relationshipTo = relationshipTo;
        this.personTwo = personTwo;
    }
    
    public DisasterVictim getPersonOne() {
        return personOne;
    }
    
    public void setPersonOne(DisasterVictim personOne) {
        this.personOne = personOne;
    }
    
    public String getRelationshipTo() {
        return relationshipTo;
    }
    
    public void setRelationshipTo(String relationshipTo) {
        this.relationshipTo = relationshipTo;
    }
    
    public DisasterVictim getPersonTwo() {
        return personTwo;
    }
    
    public void setPersonTwo(DisasterVictim personTwo) {
        this.personTwo = personTwo;
    }
}