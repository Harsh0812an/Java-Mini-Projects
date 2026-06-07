import java.util.*;
class StudentRecordManager
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> A =new ArrayList<>();
        ArrayList<Integer> B =new ArrayList<>();
        int choice;
        while(true)
        {
            System.out.println("\n===== STUDENT RECORD MANAGER =====");
            System.out.println("1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Modify Student");
            System.out.println("4.Delete Student");
            System.out.println("5.Count Students");
            System.out.println("6.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1)
            {
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine();
                A.add(name);
                B.add(roll);
                System.out.println("Student Added.");
            }
            else if(choice == 2)
            {
                if(A.size() == 0)
                {
                    System.out.println("No Records Found.");
                }
                else
                {
                    System.out.println("\nStudent Records:");

                    for(int i = 0; i < A.size(); i++)
                    {
                        System.out.println((i + 1) + ". Name: " +A.get(i) +" Roll No: " +B.get(i));
                    }
                }
            }
            else if(choice == 3)
            {
                System.out.print("Enter position to modify: ");
                int pos = sc.nextInt();
                sc.nextLine();
                if(pos >= 0 && pos < A.size())
                {
                    System.out.print("Enter new name: ");
                    String addName = sc.nextLine();
                    System.out.print("Enter new roll number: ");
                    int addRoll = sc.nextInt();
                    sc.nextLine();
                    A.set(pos, addName);
                    B.set(pos, addRoll);
                    System.out.println("Record Modified.");
                }
                else
                {
                    System.out.println("Invalid Position.");
                }
            }
            else if(choice == 4)
            {
                System.out.print("Enter position to remove: ");
                int rem = sc.nextInt();
                sc.nextLine();
                if(rem >= 0 && rem < A.size())
                {
                    A.remove(rem);
                    B.remove(rem);
                    System.out.println("Record Removed.");
                }
                else
                {
                    System.out.println("Invalid Position.");
                }
            }
            else if(choice == 5)
            {
                System.out.println("Total Students = " + A.size());
            }
            else if(choice == 6)
            {
                System.out.println("Exiting...");
                break;
            }
            else
            {
                System.out.println("Invalid Choice.");
            }
        }
        sc.close();
    }
}