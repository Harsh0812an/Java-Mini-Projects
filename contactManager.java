import java.util.Scanner;
class contactManager
{
    String name;
    String contact;
    contactManager(String n, String c)
    {
        name = n;
        contact = c;
    }
    void display()
    {
        System.out.println(name + " " + contact);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter contact book size");
        int n = sc.nextInt();

        contactManager A[] = new contactManager[n];

        // input
        for(int i = 0; i < n; i++)
        {
            System.out.println("enter name");
            String name = sc.next();

            System.out.println("enter contact number");
            String contact = sc.next();

            A[i] = new contactManager(name, contact);
        }

        // sorting
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if (A[j].name.compareTo(A[j+1].name) > 0)
                {
                    contactManager temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        // display sorted
        System.out.println("\nSorted Contact List:");
        for(int i = 0; i < n; i++)
        {
            A[i].display();
        }

        // new contact
        System.out.println("enter new user name");
        String sname = sc.next();

        System.out.println("enter new number");
        String scontact = sc.next();

        boolean nameExists = false;
        boolean numberExists = false;

        // check duplicate
        for(int i = 0; i < n; i++)
        {
            if(A[i].name.equals(sname))
                nameExists = true;

            if(A[i].contact.equals(scontact))
                numberExists = true;
        }

        // decision (REFINED)
        if(nameExists && numberExists)
        {
            System.out.println("Contact already exists");
            System.out.println("Number already present");
        }
        else if(!nameExists && numberExists)
        {
            System.out.println("Number already used, cannot add");
        }
        else if(nameExists && !numberExists)
        {
            System.out.println("Same name, different number → allowed");

            contactManager B[] = new contactManager[n + 1];

            for(int i = 0; i < n; i++)
            {
                B[i] = A[i];
            }

            B[n] = new contactManager(sname, scontact);

            A = B;
            n++;
        }
        else
        {
            System.out.println("New contact → allowed");

            contactManager B[] = new contactManager[n + 1];

            for(int i = 0; i < n; i++)
            {
                B[i] = A[i];
            }

            B[n] = new contactManager(sname, scontact);

            A = B;
            n++;
        }

        // final display
        System.out.println("Updated Contact List:");
        for(int i = 0; i < n; i++)
        {
            A[i].display();
        }
    }
}