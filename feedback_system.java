import java.io.*;

import java.util.Scanner;

public class feedback_system
{
    static String user_name;

    public void clint_choise(char choise) throws IOException
    {
        if(choise == '1')
        {
            add_feedback();

            System.out.print("Previous Feedbacks : \n\n");

            view_feedback();

            for_main_menu();
        }
        else if(choise == '2')
        {
            view_feedback();

            for_main_menu();
        }
        else
        {
            System.out.print("Wrong Input\n\n");

            for_main_menu();

        }

    }


    public void add_feedback() throws FileNotFoundException
    {
        Scanner feedback = new Scanner(System.in);

        System.out.print("Your Name : ");

        user_name = feedback.nextLine();

        System.out.print("Add FeedBack About US : ");

        String feedback_add = feedback.nextLine();

        System.out.print("Thank You "+user_name+ "For Your Feedback");

        FileOutputStream fos = new FileOutputStream("Feedback.txt",true);

        try
        {
            PrintWriter file = new PrintWriter(fos);

            BufferedWriter save = new BufferedWriter(file);

            save.write(user_name+"\n\t" + feedback_add+"\n");

            save.newLine();

            save.close();

            file.close();

        }
        catch (Exception e)
        {
            System.out.print("Error Please Try Again!!");
        }
    }

    public void view_feedback() throws FileNotFoundException
    {
        System.out.print("FEEDBACK SECTION : \n\n");

        FileInputStream fis = new FileInputStream("Feedback.txt");

        Scanner output = new Scanner(fis);

        while (output.hasNext())
        {

            System.out.print(output.nextLine()+"\n");
        }

    }

    public void for_main_menu() throws IOException
    {
        System.out.print("PUB | FREE-WIFI | FREE-PARKING | OUTDOOR-SWIMMING POOL | ONSITE-RESTAURANT \n\n");

        System.out.print("\n1.Hotel Rooms Booking \n\n2.Honeymoon Special \n\n3.Feedback\n\n4.About Us\n\n");

        final Scanner select = new Scanner(System.in);

        System.out.print("Your Choice : ");

        char choise = select.next().charAt(0);

        room_packages nPackages = new room_packages();

        nPackages.user_choise_controller(choise);
    }




}
