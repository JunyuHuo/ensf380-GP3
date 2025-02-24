public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;
    private String logDetails;

    public ReliefService (Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation, String logDetails){
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
        this.logDetails = logDetails;
    }

    public Inquirer getInquirer() {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    public DisasterVictim getMissingPerson(){
        return missingPerson;
    }

    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    public String getDateOfInquiry() {
        return dateOfInquiry;
    }

    public void setDateOfInquiry(String dateOfInquiry){
        this.dateOfInquiry = dateOfInquiry;
    }

    public String getInfoProvided(){
        return infoProvided;
    }

    public void setInfoProvided(String infoProvided){
        this.infoProvided = infoProvided;
    }

    public Location getLastKnownLocation(){
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation){
        this.lastKnownLocation = lastKnownLocation;
    }

    private boolean isValidDateFormat(String date){
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
    
    public String getLogDetails(){
        return logDetails;
    }

    public void setLogDetails(String logDetails){
        this.logDetails = logDetails;
    }
}

