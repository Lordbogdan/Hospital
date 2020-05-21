package entity;

import java.io.Serializable;

public class Recipe implements Serializable {
    private String description;
    private String data;
    private int shelfLife;
    private String priority;
    private Patient patient;
    private Doctor doctor;
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Recipe() {

    }

    public Recipe(String description, String data, int shelfLife, String priority) {
        this.description = description;
        this.data = data;
        this.shelfLife = shelfLife;
        this.priority = priority;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;

    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        if (priority.toLowerCase().equals("easy")) {
            this.priority = priority;
            return;
        }
        if (priority.toLowerCase().equals("medium")) {
            this.priority = priority;
            return;
        }
        if (priority.toLowerCase().equals("hard")) {
            this.priority = priority;
            return;
        }
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + '\'' +
                ", description='" + description + '\'' +
                ", data=" + data +
                ", shelfLife=" + shelfLife +
                ", priority='" + priority + '\'' +
                ",id Patient='" + id + '\'' +
                ",id Doctor='" + id + '\'' +
                '}';
    }
}
