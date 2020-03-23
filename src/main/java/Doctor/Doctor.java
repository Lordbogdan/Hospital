package Doctor;

public class Doctor {
    private String name;
    private String fam;
    private String otch;
    private String spec;


    public Doctor(String name, String secondName, String thierdName, String spec) {
        this.name = name;
        this.fam = fam;
        this.otch = otch;
        this.spec = spec;
        System.out.println("Doctor");
        System.out.println( name + " " + secondName + " " + thierdName + " " + spec);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getOtch() {
        return otch;
    }

    public void setOtch(String otch) {
        this.otch = otch;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
}
