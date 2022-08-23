package CYDEO.days.day03;

public class Employee {
    public static void main(String[] args) {
        String firsname = "Abu";
        String lastname = "Shoaliev";
        String companyName = "Apple";
        String jobTittle  = "Secret Agent";
        char suite = 'E';
        int employeeID = 7;
        int numberOfPTO = 17;
        double salary = 1000000.0;
        boolean ifFullTime = true;

        String fullName = firsname + " " + lastname;
        String email = fullName + employeeID + '@' + companyName + ".com";
        String benefits = "$" + salary + " salary a year, " + numberOfPTO + "PIO days and WFM";
        System.out.println(fullName);
    }
}
