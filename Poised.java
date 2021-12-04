import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Poised {

    // Main method
    public static void main(String[] args){

        // Try catch block
        try {

            Scanner sc = new Scanner(System.in).useDelimiter("\n");

            // Read the text file into an array list array1 using a while loop to loop through the text file and .add to append the object to the arrayList reference baeldung.com
            ArrayList<String> array1 = new ArrayList<>();
            try (Scanner s = new Scanner(new FileReader("project.txt"))) {
                while (s.hasNext()) {
                    array1.add(s.nextLine());
                }

            }

            // Output the arrayList allProj of all the projects using a for loop to iterate through the ArrayList and .get to print out the lines  reference interviewsansar.com
            System.out.println("A List of all the Projects : ");
            for(int i = 0; i < array1.size(); i++){
                System.out.println(array1.get(i));
            }

            // Asking user if they want to enter the details of a new project
            // Use an if statement when the user enters yes ask for project details
            System.out.println("\nDo you wish to enter details of new project yes (y) or no (n)? ");
            String answer = sc.next();
            if (answer.equals("y")) {

                // Ask user to input details of project
                // inputs the details in project
                // Create an arrayList array2
                // Add the details of the project to the arrayList array2
                System.out.print("Please enter the Project number : ");
                int projectNum = sc.nextInt();
                ArrayList<String> array2 = new ArrayList<>();
                array2.add("The project number is : " + projectNum);

                System.out.print("Project Name : If no project name use Type of Building and Customer name as Project Name : ");
                String projectName = sc.next();
                array2.add("The project name is : " + projectName);

                System.out.print("Building Type : ");
                String buildingType = sc.next();
                array2.add("The Building Type is : " + buildingType);

                System.out.print("Please enter Project Address : ");
                String projectAddress = sc.next();
                array2.add("The Project Address is : " + projectAddress);

                System.out.print("ERF Number : ");
                BigInteger erfNum = sc.nextBigInteger();
                array2.add("The ERF Number is : " + erfNum);

                System.out.print("Total Fee : ");
                int totalFee = sc.nextInt();
                array2.add("The Total Fee is : " + totalFee);

                System.out.print("Amount Paid to Date : ");
                int paidToDate = sc.nextInt();
                array2.add("The Amount Paid to date is : " + paidToDate);

                int amountDue = totalFee - paidToDate;
                System.out.println("The total amount due by the customer is : " + amountDue);
                array2.add("The total amount due by the customer is : " + amountDue);

                System.out.print("Due Date of the project (dd/MM/yyyy : ");
                String dueDate = sc.next();
                array2.add("The Due Date of the Project is : " + dueDate);

                System.out.print("Architect : ");
                String architect = sc.next();
                array2.add("The Architect for the project is : " + architect);

                System.out.print("Contractor : ");
                String contractor = sc.next();
                array2.add("The Contractor for the project is : " + contractor);

                System.out.print("Customer : ");
                String customer = sc.next();
                array2.add("The Customer for the project is : " + customer);

                // Create new arrayList project
                // Add arrayList array1 to arrayList project
                // Add arrayList array2 to arrayList project
                ArrayList<String> project = new ArrayList<String>();
                project.addAll(array1);
                project.add("\n");
                project.addAll(array2);

                // Write the arrayList to the project text file using a for loop and .write with system.lineSeparator to write the objects to the text file  reference stackoverflow.com
                FileWriter writer1 = new FileWriter("project.txt");
                for (String str : project) {
                    writer1.write(str + System.lineSeparator());
                }
                writer1.close();
                System.out.println("Successfully wrote to the file. ");

                // Call the project and print out the details
                project v1 = new project(projectNum, projectName, buildingType, projectAddress, erfNum, totalFee, paidToDate,amountDue, dueDate, architect, contractor, customer);
                System.out.println(v1.toString());
            }

            // Use else statement when user does not wish to enter a new project
            else{
                System.out.println("No new project has been entered ");
            }

            // Ask user if they wish to enter the details of a new person
            // use an if statement when the user inputs yes
            System.out.println("\nDo you wish to enter details of Architect, Contractor, Customer yes (y) or no (n)? ");
            String answer1 = sc.next();
            if (answer1.equals("y")) {

                // Ask user to input details of person
                // inputs the details of the person
                // Create arrayList array4
                // Adds the details of the person to arrayList array4
                System.out.println("Please enter the type of person : Architect, Contractor, Customer ");
                String type = sc.next();
                System.out.print("\nPlease enter the person's Name : " );
                String name = sc.next();
                System.out.println("\nPlease enter the project number the person is involved in : ");
                String project = sc.next();
                ArrayList<String> array4 = new ArrayList<>();
                array4.add("The type of person is : " + type);
                array4.add("The name of the person is : " + name);
                array4.add("The project the person is involved in is : " + project);

                System.out.print("\nPlease enter the person's Telephone number : ");
                String telephoneNum = sc.next();
                array4.add("The Telephone number of the person is : " + telephoneNum);

                System.out.print("\nPerson's Email Address : ");
                String emailAddress = sc.next();
                array4.add("The Email Address of the person is : " + emailAddress);

                System.out.print("\nPlease enter the person's Postal Address : ");
                String postAddress = sc.next();
                array4.add("The Postal Address of the person is : " + postAddress);

                // Create a new arrayList array3
                // Read the text file into an array list array3
                ArrayList<String> array3 = new ArrayList<>();
                try (Scanner s = new Scanner(new FileReader("project person.txt"))) {
                    while (s.hasNext()) {
                        array3.add(s.nextLine());
                    }

                }

                // Create an array person
                // Add array3 to array person
                // Add array4 to array person
                ArrayList<String> person = new ArrayList<String>();
                person.addAll(array3);
                person.add("\n");
                person.addAll(array4);

                // Write the array list to the project text file
                FileWriter writer1 = new FileWriter("project person.txt");
                for (String str : person) {
                    writer1.write(str + System.lineSeparator());
                }

                writer1.close();
                System.out.println("Successfully wrote to the file. ");

                // Call the class person and print out the details
                person p1 = new person(type,name, project, telephoneNum, emailAddress, postAddress);
                System.out.println(p1.toString());

            }

            // Use the else statement if the user does not wish to enter the details of a person
            else{
                System.out.println("No new person details have been entered ");
            }

            // Ask the user if they wish to edit the project due date
            // Use an if statement when the user wants to edit the due date
            System.out.println("\nDo you wish to edit the due date of a project yes(y) or no(n)? ");
            String answer2 = sc.next();
            if (answer2.equals("y")) {

                // Ask the user to enter the project they want to edit
                System.out.println(" Please enter the project number you wish to edit : ");
                String proNum = sc.next();

                // Create a new arrayList result
                // Reading the text file to an array list
                ArrayList<String> result = new ArrayList<>();
                try (Scanner s = new Scanner(new FileReader("project.txt"))){
                    while(s.hasNext()){
                        result.add(s.nextLine());
                    }

                }

                // Find the index of the first line of the project in the arrayList result using .indexOf and save as projNum reference tutorialspoint.com
                // Add eight to the projNum to get the index of the due date of the project and save as dateNum
                int projNum = result.indexOf("The project number is : " + proNum);
                int dateNum = projNum + 8;

                // Extracting the due date from the project in the arrayList result and output it
                String oldDueDate = result.get(dateNum);
                System.out.println(oldDueDate);

                // Asking the user for a new due date
                // Changing the due date of the project in the arrayList using .set and the index number to overwrite the object reference Java67.com
                System.out.println("\nPlease enter the new due date (dd/MM/yyyy) : ");
                String answer3 = sc.next();
                result.set(dateNum,"The Due Date of the Project is : " + answer3);

                // Writing the array list back to the text file
                FileWriter writer = new FileWriter("project.txt");
                for(String str: result) {
                    writer.write(str + System.lineSeparator());
                }
                writer.close();
                System.out.println("Successfully wrote to the file. ");

            }

            // Use the else statement when the user does not edit the due date
            else{
                System.out.println("The due date has not been edited");
            }

            // Ask user if they wish to edit the total amount paid to date
            // Use if statement when the user want to edit the total amount paid
            System.out.println("\nDo you wish to edit the Total amount paid to date on a project yes(y) or no(n)? ");
            String answer3 = sc.next();
            if (answer3.equals("y")) {

                // Ask the user to enter the project number they wish to edit
                System.out.println(" Please enter the project number you wish to edit : ");
                String proNum = sc.next();

                // Create a new arrayList result1
                // Read the text file into an arrayList result1
                ArrayList<String> result1 = new ArrayList<>();
                try (Scanner s = new Scanner(new FileReader("project.txt"))){
                    while(s.hasNext()){
                        result1.add(s.nextLine());
                    }

                }

                // Find the index of the first line of the project in the arrayList result1 and save as projNum
                // Add five indexes to projNum to get the index of the total amount for the project and save as totalNum
                // Add six indexes to projNum to get the index of the total amount paid for the project and save as amountNum
                // Add seven to the projNum to get the index of the total amount due by the customer for the project and save as dueNum
                int projNum = result1.indexOf("The project number is : " + proNum);
                int totalNum = projNum + 5;
                int amountNum = projNum + 6;
                int dueNum = projNum + 7;

                // Extracting amount paid to date from the project in the arrayList result1 and output it
                String oldAmountDue = result1.get(amountNum);
                System.out.println(oldAmountDue);

                // Ask user to enter the new amount paid to date
                // Change the amount paid to date in the array list
                System.out.println(" Please enter the new amount payed to date : ");
                String answer4 = sc.next();
                result1.set(amountNum,"The amount paid to date is : " + answer4);

                // Extracting the total amount from the arrayList and saving it as a string amount
                String line = result1.get(totalNum);
                String amount = line.substring(19);

                // Converting the string amount to an integer total
                // Converting the string answer4 to an integer amountPaid
                // Calculating amountDue by subtracting amountPaid from total
                // Changing the amountDue with the new amountDue with .set in result1
                int total = Integer.valueOf(amount);
                int amountPaid = Integer.valueOf(answer4);
                int amountDue = total - amountPaid;
                result1.set(dueNum, "The total amount due by the customer is : " + amountDue);

                // Write the arrayList result1 to the text file
                FileWriter writer = new FileWriter("project.txt");
                for(String str: result1) {
                    writer.write(str + System.lineSeparator());
                }
                writer.close();
                System.out.println("Successfully wrote to the file. ");

            }

            // Use else statement when the user does not wish to change the amount paid to date
            else{
                System.out.println("You have chosen not to edit the amount paid to date ");
            }
             // Ask user if they wish to finalise a project
            System.out.println("\nDo you wish to finalise a project yes(y) or no (n)? ");
            String answer4 = sc.next();

            // Use if statement when user inputs y
            if (answer4.equals("y")) {

                // Ask the user to enter the project number they wish to edit
                System.out.println(" Please enter the project number you wish to finalise : ");
                String proNum = sc.next();

                // Read the project text file into an array list
                ArrayList<String> result6 = new ArrayList<>();
                try (Scanner s = new Scanner(new FileReader("project.txt"))) {
                    while (s.hasNext()) {
                        result6.add(s.nextLine());
                    }

                }

                // Find the index of the first line of the project in the arrayList result6
                // Get index of the amount paid by the customer and save as TotalNum
                // Get the index of the customer of the project and save as customerNum
                int projNum = result6.indexOf("The project number is : " + proNum);
                int totalNum = projNum + 7;
                int customerNum = projNum + 11;

                // Extracting the amount due from the arrayList result6 and saving it as a string total1
                String line = result6.get(totalNum);
                String total1 = line.substring(42);

                // Use if statement when amount due does not equal zero
                if(!total1.equals ("0")) {

                    // Create a new array called array5
                    ArrayList<String> array5 = new ArrayList<>();


                    // Extract the name of the client from the array result6 and save as name
                    String line3 = result6.get(customerNum);
                    String name = line3.substring(34);

                    // Create a new arrayList result7
                    // Read the project person text file into an array list
                    ArrayList<String> result7 = new ArrayList<>();
                    try (Scanner s = new Scanner(new FileReader("project person.txt"))) {
                        while (s.hasNext()) {
                            result7.add(s.nextLine());
                        }

                    }

                    // Get the index of the person in the arrayList result7
                    // Get the object at the index personNum in the arrayList result7 and save as line6
                    // Add line6 to arrayList array5
                    int personNum = result7.indexOf("The name of the person is : " + name);
                    String line6 = result7.get(personNum);
                    array5.add(line6);

                    // Extract object at index and add to arrayList array5
                    String line7 = result7.get(personNum + 1);
                    array5.add(line7);
                    String line8 = result7.get(personNum + 2);
                    array5.add(line8);
                    String line9 = result7.get(personNum + 3);
                    array5.add(line9);
                    String line10 = result7.get(personNum + 4);
                    array5.add(line10);

                    // Use String line for the amount due on the project
                    // Add string line to arrayList array5
                    array5.add(line);

                    // Create a new arrayList invoice1
                    // Read the person text file into an arrayList
                    ArrayList<String> invoice1 = new ArrayList<>();
                    try (Scanner s = new Scanner(new FileReader("project invoice.txt"))) {
                        while (s.hasNext()) {
                            invoice1.add(s.nextLine());
                        }

                    }

                    // Create new arrayList array2
                    // Add invoice1 arrayList  and array5 arrayList to invoice2 arrayList
                    ArrayList<String> invoice2 = new ArrayList<String>();
                    invoice2.addAll(invoice1);
                    invoice2.add("\n");
                    invoice2.addAll(array5);

                    // Write the array list to the invoice text file
                    FileWriter writer = new FileWriter("project invoice.txt");
                    for (String str : invoice2) {
                        writer.write(str + System.lineSeparator());
                    }
                    writer.close();
                    System.out.println("Successfully wrote to the file. ");
                }

                // Use else statement when the amount due is zero and no invoice is required
                else{
                    System.out.println(" The project "+ proNum + "is fully paid up and does not need an invoice " );
                }

                // Create a new array called array8
                ArrayList<String> array8 = new ArrayList<>();

                // Extracting the project details and adding them to the new arrayList array8
                String lastLine = result6.get(projNum);
                array8.add(lastLine);
                String lastLine1 = result6.get(projNum +1);
                array8.add(lastLine1);
                String lastLine2 = result6.get(projNum +2);
                array8.add(lastLine2);
                String lastLine3 = result6.get(projNum + 3);
                array8.add(lastLine3);
                String lastLine4 = result6.get(projNum + 4);
                array8.add(lastLine4);
                String lastLine5 = result6.get(projNum + 5);
                array8.add(lastLine5);
                String lastLine6 = result6.get(projNum + 6);
                array8.add(lastLine6);
                String lastLine7 = result6.get(projNum +7);
                array8.add(lastLine7);
                String lastLine8 = result6.get(projNum + 8);
                array8.add(lastLine8);
                String lastLine9 = result6.get(projNum + 9);
                array8.add(lastLine9);
                String lastLine10 = result6.get(projNum + 10);
                array8.add(lastLine10);
                String lastLine11 = result6.get(projNum + 11);
                array8.add(lastLine11);

                // Get today's date using DateTimeFormatter and localDateTime.now reference codeGrepper.com
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDateTime now = LocalDateTime.now();

                // Add today's date for the completion date
                array8.add("This project has been finalized on : " + (dtf.format(now))+"\n");

                // Read the text file into an array list result8
                ArrayList<String> result8 = new ArrayList<>();
                try (Scanner s = new Scanner(new FileReader("project complete.txt"))) {
                    while (s.hasNext()) {
                        result8.add(s.nextLine());
                    }

                }

                // Create new arrayList complete
                // Add result8 arrayList  and array8 arrayList to complete arrayList
                ArrayList<String> complete = new ArrayList<String>();
                complete.addAll(result8);
                complete.add("\n");
                complete.addAll(array8);

                // Write the array list to the completed project text file
                FileWriter writer = new FileWriter("project complete.txt");
                for (String str : complete) {
                    writer.write(str + System.lineSeparator());
                }
                writer.close();
                System.out.println("Successfully wrote to the file. ");

                // Remove project proNum from the arrayList result6
                result6.remove(projNum);
                result6.remove(projNum);
                result6.remove(projNum);
                result6.remove(projNum);
                result6.remove(projNum);
                result6.remove(projNum);
                result6.remove(projNum);
                result6.remove(projNum);
                result6.remove(projNum);
                result6.remove(projNum);
                result6.remove(projNum);
                result6.remove(projNum);

                // Write the array list to the project text file
                FileWriter writer2 = new FileWriter("project.txt");
                for (String str : result6) {
                    writer2.write(str + System.lineSeparator());
                }
                writer2.close();
                System.out.println("Successfully wrote to the file. ");

            }
            // Use else statement when user enters n
            else{
                System.out.println("You have chosen not to finalize the project ");
            }

            // Read the project text file into an array list
            ArrayList<String> array10 = new ArrayList<>();
            try (Scanner s = new Scanner(new FileReader("project.txt"))) {
                while (s.hasNext()) {
                    array10.add(s.nextLine());
                }

            }

            // Output the arrayList of projects to be completed
            System.out.println("\nProjects still to be completed : ");
            for(int i = 0; i < array10.size(); i++){
                System.out.println(array10.get(i));
            }

            // Ask user if they wish to find which projects are overdue
            System.out.println("\nDo you wish to find which project is over due : enter (y) yes or (n) exit : ");
            String dateProj = sc.next();

            //Creating a new arrayList
            ArrayList<String> array11 = new ArrayList<>();

            // Use a while loop while the use enters project numbers
            while(!dateProj.equals("n")) {
                System.out.println("\nPlease enter the project number : or (n) to exit ");
                dateProj = sc.next();

                // Use if statement when dateProj does not equal n
                // Extract the index of the first line of the project selected in the arrayList array10 and save it as dateNum
                // Let the integer dueDateNum equal the index of the due date in the arrayList array10
                if(!dateProj.equals("n")) {
                    int dateNum = array10.indexOf("The project number is : " + dateProj);
                    int dueDateNum = dateNum + 8;

                    // Extracting the object which contains the due date from the arrayList array10 and save as line
                    // Create a substring which just contains the due date and save as sting dueDate
                    String line = array10.get(dueDateNum);
                    String dueDate = line.substring(33);
                    System.out.println(line);

                    // Get today's date
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDateTime now = LocalDateTime.now();
                    String todayDate = (dtf.format(now));

                    // Comparing dates using sdformat.parse to be able to compare the dates reference tutorialspoint.com
                    SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");
                    Date d1 = sdformat.parse(dueDate);
                    Date d2 = sdformat.parse(todayDate);

                    // Use if statement when the due date of the project is before today's date
                    if (d1.compareTo(d2) < 0) {
                        System.out.println("This project is overdue\n");

                        // Extracting the project details and adding them to the new arrayList array11
                        String lastLine = array10.get(dateNum);
                        array11.add(lastLine);
                        String lastLine1 = array10.get(dateNum + 1);
                        array11.add(lastLine1);
                        String lastLine2 = array10.get(dateNum + 2);
                        array11.add(lastLine2);
                        String lastLine3 = array10.get(dateNum + 3);
                        array11.add(lastLine3);
                        String lastLine4 = array10.get(dateNum + 4);
                        array11.add(lastLine4);
                        String lastLine5 = array10.get(dateNum + 5);
                        array11.add(lastLine5);
                        String lastLine6 = array10.get(dateNum + 6);
                        array11.add(lastLine6);
                        String lastLine7 = array10.get(dateNum + 7);
                        array11.add(lastLine7);
                        String lastLine8 = array10.get(dateNum + 8);
                        array11.add(lastLine8);
                        String lastLine9 = array10.get(dateNum + 9);
                        array11.add(lastLine9);
                        String lastLine10 = array10.get(dateNum + 10);
                        array11.add(lastLine10);
                        String lastLine11 = array10.get(dateNum + 11);
                        array11.add(lastLine11 + "\n");

                    }

                    // Use else statement when the due date is before today's date
                    else {
                        System.out.println("This project is not overdue ");
                    }

                }

                // Use else statement when the user has entered n
                else {
                    System.out.println("You have chosen to exit ");
                }

            }

            // Output the arrayList of projects to be completed
            System.out.println("\nProjects overdue : ");
            for(int i = 0; i < array11.size(); i++){
                System.out.println(array11.get(i));
            }

            // Catch block if a string is input instead of an integer
        }   catch (InputMismatchException e) {
            System.out.println(" You have entered a non numeric field value");
        }

            // Catch block for general errors
            catch (Exception e){
            System.out.println("Error");
        }

    }

}
