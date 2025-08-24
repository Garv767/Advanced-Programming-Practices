class Patient {
    String name; int age;
    Patient(String n,int a){ name=n; age=a; }
    void show(){ System.out.println("Patient: "+name+", Age: "+age); }
}
class InPatient extends Patient {
    int roomNo;
    InPatient(String n,int a,int r){ super(n,a); roomNo=r; }
    void show(){ System.out.println("InPatient: "+name+", Age: "+age+", Room: "+roomNo); }
}
class OutPatient extends Patient {
    String appointmentDate;
    OutPatient(String n,int a,String d){ super(n,a); appointmentDate=d; }
    void show(){ System.out.println("OutPatient: "+name+", Age: "+age+", Appointment: "+appointmentDate); }
}

public class Hospital {
    public static void main(String[] args){
        Patient p1=new InPatient("Alice",30,101);
        Patient p2=new OutPatient("Bob",25,"22-Aug-2025");
        p1.show(); p2.show();
    }
}
