package bsu.comp152;

public class InsulinDosage {

    public static void main(String[] args)
    {

    }
    public static double dosage(int currentSugar, int targetSugar, int carbEqual, int carbPlan, int exercise){
        int dose = ((currentSugar-targetSugar)/55)+((carbPlan/carbEqual)-exercise);
        return dose;
    }
    //I am unsure how to get user input for calculating the dose
}
