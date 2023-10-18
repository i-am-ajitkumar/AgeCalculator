package AgeCalculation;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class AgeCalByDateCalenderClass {



    public static void main(String[] args) {
        // Get the current date
        Calendar currentDate = Calendar.getInstance();
        Date now = currentDate.getTime();

        // Set the birthdate
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1990, Calendar.JANUARY, 1); // Replace with the birthdate you want to calculate from

        // Calculate the age
        int age = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

        // Check if the birthday hasn't occurred yet this year
        if (currentDate.get(Calendar.MONTH) < birthDate.get(Calendar.MONTH) || 
           (currentDate.get(Calendar.MONTH) == birthDate.get(Calendar.MONTH) &&
           currentDate.get(Calendar.DAY_OF_MONTH) < birthDate.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }

        // Format and display the result
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String birthDateString = dateFormat.format(birthDate.getTime());
        String currentDateString = dateFormat.format(now);

        System.out.println("Date of Birth: " + birthDateString);
        System.out.println("Current Date: " + currentDateString);
        System.out.println("Age: " + age + " years");
    }
}