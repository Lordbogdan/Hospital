package  Patient;

public class Patient {
    private String name;
    private String secondName;
    private String thierdName;
    private int phone;

    public Patient(String name, String secondName, String thierdName, int phone) {
        this.name = name;
        this.secondName = secondName;
        this.thierdName = thierdName;
        this.phone = phone;

    }

    public String getName() {

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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}