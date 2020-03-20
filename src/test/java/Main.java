import Doctor.Doctor;
import Patient.Patient;
import Recipe.Recipe;


public class Main {
    public static void main (String [] args){
        Patient v = new Patient("Vlad", "Egorenko", "Alekseevich", 838383);
        Doctor a = new Doctor ("Andrey", "Matveev", "Borisovich", "Surgeon");
        Recipe recipe = new Recipe("recipe", "fracture", v, a, 21, 22, "Normal");
        System.out.println(v);
    }
}
