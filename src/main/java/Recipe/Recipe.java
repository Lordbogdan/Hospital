package Recipe;
import Doctor.Doctor;
import Patient.Patient;

public class Recipe {
 private String name;
 private String description;
 private int data;
 private int shelfLife;
 private String priority;

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
  this.priority = priority;
 }

 enum Priority {
  easy,
  medium,
  hard,
 }
}
