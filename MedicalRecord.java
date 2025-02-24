package edu.ucalgary.oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern pattern = Pattern.compile("^\\d\\d\\d\\d-\\d\\d-\\d\\d", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(date);
        boolean matchFound = matcher.find();
        if(matchFound) {
            return true;
        } else {
            return false;
        }
    }
}

