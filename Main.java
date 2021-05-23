import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Scanner;

public class Main
{
    public static void main(final String args[]) throws IOException
    {

        System.out.println("\n\nWELCOME MOONLIGHT Online Booking Service\n\n");

        System.out.println("Already Member Login Here - press 1 \n");

        System.out.println("Not Member Yet Sign Up Here - press 2 \n");

        System.out.println("Admin Login - press 3 \n");

        final Scanner decition = new Scanner(System.in);

        System.out.print("Your Choice : ");

        final char ope = decition.next().charAt(0);

        Login_Signup newlogin_signupobj = new Login_Signup();

        newlogin_signupobj.choise(ope);

        System.out.print("PUB | FREE-WIFI | FREE-PARKING | OUTDOOR-SWIMMING POOL | ONSITE-RESTAURANT \n\n");

        System.out.print("\n1.Hotel Rooms Booking\n\n2.Honeymoon Special\n\n3.Feedback\n\n4.About Us\n\n");

        final Scanner select = new Scanner(System.in);

        System.out.print("Your Choice : ");

        char choise = select.next().charAt(0);

        room_packages nPackages = new room_packages();

        nPackages.user_choise_controller(choise);










    }


}

