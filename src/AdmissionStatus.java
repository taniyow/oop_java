package Midterms;

class AdmissionStatus {
    
    private int countStudents;
    private String student;
    private String gender;
    private String status;
    
    public void setCount(int numberofStudents)
    {
        countStudents = numberofStudents;
    }
    public int getCount()
    {
        return countStudents;
    }
    
    public void setName(String name)
    {
        student = name;
    }
    public String getName()
    {
        return student;
    }
    
    public void setGender(String value)
    {
        switch (value) {
            case "M":
            case "m":
                gender = "Male";
                break;
            case "F":
            case "f":
                gender = "Female";
                break;
            default:
                gender = "Invalid Gender.";
                break;
        }
    }
    public String getGender()
    {
        return gender;
    }

    public void setStatus(String description)
    {
        switch (description) {
            case "N":
            case "n":
                status = "For Admission Examination";
                break;
            case "R":
            case "r":
                status = "Reservation";
                break;
            case "A":
            case "a":
                status = "Accomplished Requirements";
                break;
            default:
                status = "Invalid Status Code.";
                break;
        }
    }
    public String getStatus()
    {
        return status;
    }

}
