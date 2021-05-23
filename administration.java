import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class administration
{
    public void admin_choice() throws FileNotFoundException {
        Scanner INPUT = new Scanner(System.in);

        System.out.print("1.Conform User Bookings-Press 1\n\n2.Leave-Press 2\n\nYour Choice:");

        char input = INPUT.next().charAt(0);

        if(input == '1')
        {
            read_booking_and_Conform();

        }
        else if(input =='2')
        {
            System.exit(0);

        }
        else
        {
            System.out.print("Wrong Input Please Try Again \n\n");

            admin_choice();
        }
    }

    public void read_booking_and_Conform() throws FileNotFoundException
    {
        System.out.print("Booking Log : \n\n");

        FileInputStream fis = new FileInputStream("Database.txt");

        Scanner output = new Scanner(fis);

        while (output.hasNext())
        {
            System.out.print(output.nextLine()+"\n\n");
        }

        update_file file_update = new update_file();

        file_update.database_update();

    }



}
