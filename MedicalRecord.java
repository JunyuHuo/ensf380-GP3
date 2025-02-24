package edu.ucalgary.oop;

public class MedicalRecord {
    Location location;
    String treatmentDetails;
    String dateOfTreatment;

    MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }

    Location getLocation() {
        return location;
    }

    void setLocation(Location location) {
        this.location = location;
    }
    
    String getTreatmentDetails() {
        return treatmentDetails;
    }
    
    void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }
    
    String getDateOfTreatment() {
        return dateOfTreatment;
    }
    
    void setDateOfTreatment(String dateOfTreatment) {
        this.dateOfTreatment = dateOfTreatment;
    }
    
    boolean isValidDateFormat(String date) {
        
    }
    
}

