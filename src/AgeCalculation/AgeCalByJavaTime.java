package AgeCalculation;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalByJavaTime {


    public static void main(String[] args) {
        // Define the birthdate
        LocalDate birthDate = LocalDate.of(1990, 1, 1); // Replace with the birthdate you want to calculate from

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age
        Period age = Period.between(birthDate, currentDate);

        // Format and display the result
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String birthDateString = birthDate.format(dateFormatter);
        String currentDateString = currentDate.format(dateFormatter);

        System.out.println("Birthdate: " + birthDateString);
        System.out.println("Current Date: " + currentDateString);
        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");
    }
}