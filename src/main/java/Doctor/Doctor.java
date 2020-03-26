package Doctor;

public class Doctor {
    private String name;
    private String secondName;
    private String thierdName;
    private String specialization;

    public Doctor(){

    }

    public Doctor(String name, String secondName, String thierdName, String specialization) {
        this.name = name;
        this.secondName = secondName;
        this.thierdName = thierdName;
        this.specialization = specialization;
    }

    public String getName( ) {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThierdName() {
        return thierdName;
    }

    public void setThierdName(String thierdName) {
        this.thierdName = thierdName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thierdName='" + thierdName + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
