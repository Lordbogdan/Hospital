package Recipe;
import Doctor.Doctor;
import Patient.Patient;

public class Recipe {
 private String name;
 private String opis;
 private Patient vlad;
 private Doctor andrey;
 private int data;
 private int term;
 private String priority;

 public Recipe(String name, String opis, Patient vlad, Doctor andrey, int data, int term, String priority) {
  this.name = name;
  this.opis = opis;
  this.vlad = vlad;
  this.andrey = andrey;
  this.data = data;
  this.term = term;
  this.priority = priority;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getOpis() {
  return opis;
 }

 public void setOpis(String opis) {
  this.opis = opis;
 }

 public Patient getVlad() {
  return vlad;
 }

 public void setVlad(Patient vlad) {
  this.vlad = vlad;
 }

 public Doctor getAndrey() {
  return andrey;
 }

 public void setAndrey(Doctor andrey) {
  this.andrey = andrey;
 }

 public int getData() {
  return data;
 }

 public void setData(int data) {
  this.data = data;
 }

 public int getTerm() {
  return term;
 }

 public void setTerm(int term) {
  this.term = term;
 }

 public String getPriority() {
  return priority;
 }

 public void setPriority(String priority) {
  this.priority = priority;
  String norm = "Normal";
  String cito = "Cito";
  String statim = "Statim";
 }
}
