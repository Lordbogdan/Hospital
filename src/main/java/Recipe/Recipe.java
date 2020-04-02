package Recipe;

import Doctor.Doctor;
import Patient.Patient;

import java.io.Serializable;

public class Recipe implements Serializable {
    private String name;
    private String description;
    private int data;
    private int shelfLife;
    private String priority;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Recipe() {

    }

    public Recipe(String name, String description, int data, int shelfLife, String priority) {
        this.name = name;
        this.description = description;
        this.data = data;
        this.shelfLife = shelfLife;
        this.priority = priority;
    }

    public String getName() {

  return name;
 }

 public void setName(String name) {

  this.name = name;
 }

 public String getDescription() {

  return description;
 }

 public void setDescription(String description) {

  this.description = description;
 }

 public int getData() {
  return data;
 }

 public void setData(int data) {
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
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", data=" + data +
                ", shelfLife=" + shelfLife +
                ", priority='" + priority + '\'' +
                '}';
    }


    public void displayinfo() {
        System.out.println(name);
    }
}
