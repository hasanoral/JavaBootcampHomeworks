package WeekOneHomework3;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class PersonalData {

    private java.time.LocalDate birthDate;
    private String address;
    private long ssn;

    public PersonalData(java.time.LocalDate date, long ssn){
        this.birthDate = date;
        this.ssn = ssn;
    }

    public PersonalData(int year,int month,int day,long ssn){

        this.birthDate = LocalDate.of(year,month,day);

        this.ssn = ssn;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public long getSsn() {
        return ssn;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
