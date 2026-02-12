import java.util.*;

public class PayMeal {
    public static ArrayList<Student> studentList = new ArrayList<Student>();

    public static void addStudent(String nameIn){
        studentList.add(new Student(nameIn));
    }

    public static void printStudentList(){
        for(Student a : studentList){
            System.out.println(a.toString());
        }
    }

    public static void printNegativeStudents(){
        for(Student a : studentList){
            if(a.getBalance() < 0){
                System.out.println(a.toString());
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the PayMeal system. ");
        while(true){
            System.out.println("Please select an option:");
            System.out.println("1: Add new student");
            System.out.println("2: Add funds to existing student's balance");
            System.out.println("3: Make a purchase");
            System.out.println("4: Print all students");
            System.out.println("5: Print students with a negative balance");
            //TODO: purchase histories

            int choice = input.nextInt();
            input.nextLine();

            if(choice == 1){
                System.out.println("Adding a new student...\n");
                System.out.println("Please enter student's name:");
                String tempName = input.nextLine();
                addStudent(tempName);
                System.out.println("\nNew student created: ");
                System.out.println(studentList.get(studentList.size()-1).toString() + "\n");
            }
            else if(choice == 2){
                System.out.println("Adding funds to existing student's balance...\n");
                System.out.println("Please enter student's ID number: ");
                int idNumber = input.nextInt();
                boolean isFound = false;
                for(Student a : studentList){
                    if(a.getID() == idNumber){
                        System.out.println("\nStudent selected is:");
                        System.out.println(a.toString() + "\n");
                        isFound = true;
                    }
                }
                if(!isFound){
                    System.out.println("\nError: student not found");
                }
                System.out.println("Please enter amount to add to student's balance: ");
                double amtAdded = input.nextDouble();
                for(Student a : studentList){
                    if(a.getID() == idNumber){
                        a.addFunds(amtAdded);
                    }
                }
                System.out.println("Added $" + amtAdded + " to student.");
                System.out.println("\nNew student information:");
                for(Student a : studentList){
                    if(a.getID() == idNumber){
                        System.out.println(a.toString());
                    }
                }
                System.out.println();
            }
            else if(choice == 3){
                System.out.println("Making a purchase: \n");
                System.out.println("Please enter month (1-12):");
                int monthTemp = input.nextInt();
                System.out.println("Please enter day:");
                int dayTemp = input.nextInt();
                System.out.println("Please enter student ID number: ");
                int idNumber = input.nextInt();
                boolean isFound = false;
                for(Student a : studentList){
                    if(a.getID() == idNumber){
                        isFound = true;
                        a.makePurchaseStudent();
                        a.addPurchase(a, monthTemp, dayTemp);
                        System.out.println("\nPurchase made. New student information: ");
                        System.out.println(a.toString());
                        System.out.println();
                    }
                }
                if(!isFound){
                    System.out.println("Error: student not found\n");
                }
            }
            else if(choice == 4){
                System.out.println("Printing all students... \n");
                for(Student a : studentList){
                    System.out.println(a.toString());
                }
                System.out.println();
            }
        }
    }
}
