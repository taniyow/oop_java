import java.util.*;
public class PatientApp {
    public static void main(String[] args) 
    {
        try {
            MedicalRecord list = new MedicalRecord();
            PatientRecord[] access = list.input();
            list.output(access);
        }
        catch(Exception e){
            System.out.print("Invalid Input");
        }
    }
}

//class processor
class MedicalRecord {
    int pnumber, counter, pres, days;
    String diagnosis, medicine, prescription, birthdate, birthyear;
    
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    
    public void counter()
    {
        System.out.print("Enter No. of Patients: ");
        counter = in.nextInt();
    }
    
    public PatientRecord[] input()
    {
        counter();
        //set PatientRecord class as array of objects
        PatientRecord[] list = new PatientRecord[counter];
        for(int i=0; i<counter ; ++i) {
            //set randomized number
            list[i] = new PatientRecord();
            list[i].setPNumber(rand.nextInt(1000));
            //set patients name
            System.out.print("\nEnter Patients Name: ");
            list[i].setPatient(in.next());
            //set bday
            System.out.print("Enter Birthdate (mm/dd): ");
            birthdate = in.next();
            System.out.print("Enter Birthyear (yyyy): ");
            birthyear = in.next();
            String combine = birthdate + "/" + birthyear;
            list[i].setBday(combine);
            list[i].setAge(Integer.parseInt(birthyear));
            //set diagnosis
            System.out.print("Enter Diagnosis: ");
            list[i].setDiagnosis(in.next());
            //set medicine
            System.out.print("Enter Medicine: ");
            list[i].setMedName(in.next());
            //set prescription
            System.out.print("Enter Prescription: ");
            pres = in.nextInt();
            System.out.print("Enter # of days: ");
            days = in.nextInt();
            String convert = Integer.toString(pres) + "D x " + Integer.toString(days);
            list[i].setPrescription(convert);
            list[i].setMeds(pres*days);
        }
        return list;
    }
    
    public void output(PatientRecord[] list)
    {
        for(int i=0; i<counter; ++i) {
            System.out.println("\nPatient Record System\n---------------------");
            System.out.println("Patient ID: " + list[i].getPNumber());
            System.out.println("Patient Name: " + list[i].getPatient());
            System.out.println("Birthdate: " + list[i].getBday());
            System.out.println("Age: " + list[i].getAge());
            System.out.println("Diagnosis: " + list[i].getDiagnosis());
            System.out.println("Medicine: " + list[i].getMedName());
            System.out.println("Prescription: " + list[i].getDiagnosis());
            System.out.println("Total medication needed: " + list[i].getMeds() + " tablets");
        }
    }
}

//class as array of objects
class PatientRecord {
    private int pnumber, age, compute;
    private String pname, diagnosis, medicine, 
            birthdate, prescription;
    
    //constructor
    public PatientRecord()
    {
        pnumber = 0;
        age = 0;
        pname = "";
        diagnosis = "";
        medicine = "";
        birthdate = "";
        prescription = "";
        compute = 0;
    }
    //param constructor
    public PatientRecord(int num, int yrs, String name, 
            String dg, String med, String bday, 
            String pr, int total)
    {
        pnumber = num;
        age = yrs;
        pname = name;
        diagnosis = dg;
        medicine = med;
        birthdate = bday;
        prescription = pr;
        compute = total;
    }
    
    public void setPNumber(int num)
    {
        pnumber = num;
    }
    public int getPNumber()
    {
        return pnumber;
    }
    public void setAge(int num)
    {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        age = year-num;
    }
    public int getAge()
    {
        return age;
    }
    public void setPatient(String name)
    {
        pname = name;
    }
    public String getPatient()
    {
        return pname;
    }
    public void setBday(String bday)
    {
        birthdate = bday;
    }
    public String getBday()
    {
        return birthdate;
    }
    public void setDiagnosis(String dg)
    {
        diagnosis = dg;
    }
    public String getDiagnosis()
    {
        return diagnosis;
    }
    public void setMedName(String dg)
    {
        medicine = dg;
    }
    public String getMedName()
    {
        return medicine;
    }
    public void setPrescription(String pr)
    {
        prescription = pr;
    }
    public String getPrescription()
    {
        return prescription;
    }
    public void setMeds(int n)
    {
        compute = n;
    }
    public int getMeds()
    {
        return compute;
    }
}