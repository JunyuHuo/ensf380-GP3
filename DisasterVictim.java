public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int ASSIGNED_SOCIAL_ID;
    private FamilyRelation[] familyConnections;
    private MedicalRecord[] medicalRecords;
    private Supply[] personalBelongings;
    private String ENTRY_DATE;
    private String gender;
    private String comments;
    private static int counter = 0;
    
    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.ASSIGNED_SOCIAL_ID = generateSocialID();
        this.familyConnections = new FamilyRelation[0];
        this.medicalRecords = new MedicalRecord[0];
        this.personalBelongings = new Supply[0];
    }
    
    public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) {
        this(firstName, ENTRY_DATE);
        if (isValidDateFormat(dateOfBirth)) {
            this.dateOfBirth = dateOfBirth;
        } else {
            throw new IllegalArgumentException("Invalid date format");
        }
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void setDateOfBirth(String dateOfBirth) {
        if (isValidDateFormat(dateOfBirth)) {
            this.dateOfBirth = dateOfBirth;
        } else {
            throw new IllegalArgumentException("Invalid date format");
        }
    }
    
    public int getAssignedSocialID() {
        return ASSIGNED_SOCIAL_ID;
    }
    
    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }
    
    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }
    
    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }
    
    public void setFamilyConnections(FamilyRelation[] connections) {
        this.familyConnections = connections;
    }
    
    public void setMedicalRecords(MedicalRecord[] records) {
        this.medicalRecords = records;
    }
    
    public void setPersonalBelongings(Supply[] belongings) {
        this.personalBelongings = belongings;
    }
    
    public void addPersonalBelonging(Supply supply) {
        Supply[] newBelongings = new Supply[personalBelongings.length + 1];
        for (int i = 0; i < personalBelongings.length; i++) {
            newBelongings[i] = personalBelongings[i];
        }
        newBelongings[personalBelongings.length] = supply;
        personalBelongings = newBelongings;
    }
    
    public void removePersonalBelonging(Supply unwantedSupply) {
        int removeIndex = -1;
        for (int i = 0; i < personalBelongings.length; i++) {
            if (personalBelongings[i] == unwantedSupply) {
                removeIndex = i;
                break;
            }
        }
        
        if (removeIndex != -1) {
            Supply[] newBelongings = new Supply[personalBelongings.length - 1];
            for (int i = 0; i < removeIndex; i++) {
                newBelongings[i] = personalBelongings[i];
            }
            for (int i = removeIndex; i < newBelongings.length; i++) {
                newBelongings[i] = personalBelongings[i + 1];
            }
            personalBelongings = newBelongings;
        }
    }
    
    public void removeFamilyConnection(FamilyRelation exRelation) {
        int removeIndex = -1;
        for (int i = 0; i < familyConnections.length; i++) {
            if (familyConnections[i] == exRelation) {
                removeIndex = i;
                break;
            }
        }
        
        if (removeIndex != -1) {
            FamilyRelation[] newConnections = new FamilyRelation[familyConnections.length - 1];
            for (int i = 0; i < removeIndex; i++) {
                newConnections[i] = familyConnections[i];
            }
            for (int i = removeIndex; i < newConnections.length; i++) {
                newConnections[i] = familyConnections[i + 1];
            }
            familyConnections = newConnections;
        }
    }
    
    public void addFamilyConnection(FamilyRelation relation) {
        FamilyRelation[] newConnections = new FamilyRelation[familyConnections.length + 1];
        for (int i = 0; i < familyConnections.length; i++) {
            newConnections[i] = familyConnections[i];
        }
        newConnections[familyConnections.length] = relation;
        familyConnections = newConnections;
    }
    
    public void addMedicalRecord(MedicalRecord record) {
        MedicalRecord[] newRecords = new MedicalRecord[medicalRecords.length + 1];
        for (int i = 0; i < medicalRecords.length; i++) {
            newRecords[i] = medicalRecords[i];
        }
        newRecords[medicalRecords.length] = record;
        medicalRecords = newRecords;
    }
    
    public String getEntryDate() {
        return ENTRY_DATE;
    }
    
    public String getComments() {
        return comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    private int generateSocialID() {
        counter = counter + 1;
        return counter;
    }
    
    private boolean isValidDateFormat(String date) {
        if (date == null || date.length() != 8) {
            return false;
        }
        
        for (int i = 0; i < date.length(); i++) {
            char c = date.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        
        return true;
    }
    
    private int convertDateStringToInt(String dateStr) {
        int result = 0;
        for (int i = 0; i < dateStr.length(); i++) {
            result = result * 10 + (dateStr.charAt(i) - '0');
        }
        return result;
    }
}