import java.io.IOException;

import java.util.Scanner;

public class room_packages
{
    public void user_choise_controller(char choise) throws IOException
    {
        if(choise =='1')
        {
            hotelrooms(choise);

        }
        else if(choise =='2')
        {
            honeyrooms(choise);

        }
        else if(choise == '3')
        {
            System.out.print("ADD OR View Feedback\n\n");

            Scanner output = new Scanner(System.in);

            System.out.print("Add User Feedback-Press 1 \n\nView User Feedback-Press 2\n\n");

            char output_2 = output.next().charAt(0);

            feedback_system System_input = new feedback_system();

            System_input.clint_choise(output_2);

        }
        else if(choise == '4')
        {

            System.out.print("ABOUT US\n\n");

            System.out.print(" Web - www.moonlighthotels.lk \n\n Voice - +94 45 75345567\n\n");

            System.out.print("PUB | FREE-WIFI | FREE-PARKING | OUTDOOR-SWIMMING POOL | ONSITE-RESTAURANT \n\n");

            System.out.print("1.Hotel Rooms Booking \n\n2.Honeymoon Special \n\n3.FEEDBACK\n\n 4.About Us\n\n");

            final Scanner select = new Scanner(System.in);

            System.out.print("Your Choise : ");

            char choisez = select.next().charAt(0);

            user_choise_controller(choisez);


        }
        else
        {
            System.out.print("WRONG USER INPUT PLEASE TRY AGAIN \n\n");

            System.out.print("PUB | FREE-WIFI | FREE-PARKING | OUTDOOR-SWIMMING POOL | ONSITE-RESTAURANT \n\n");

            System.out.print("1.Hotel Rooms Booking \n\n2.Honeymoon Special \n\n3.FEEDBACK1 \n\n 4.About Us\n\n");

            final Scanner select = new Scanner(System.in);

            System.out.print("Your Choise : ");

            char choisez = select.next().charAt(0);

            user_choise_controller(choisez);
        }

    }

    public static void hotelrooms(char choise) throws IOException {
        System.out.print("1.Deluxe Room-Twin Bed\n\n2.Standard Room-Single Bed\n\n3.Super Deluxe Room-Twin Bed\n\n");

        Scanner newinput = new Scanner(System.in);

        System.out.print("Your Choice : ");

        char newinputz = newinput.next().charAt(0);

        hotel_rooms myobj = new hotel_rooms();

        myobj.hotel_room_details(newinputz);

    }

    public static void honeyrooms(char choise) throws IOException
    {
        System.out.print(" OUR BEST PACKAGES \n\n 1.MOONLIGHT Kurulubedda\n\n 2.MOONLIGHT Kaduruketha\n\n 3.MOONLIGHT Colombo Seven\n\n");

        Scanner output = new Scanner(System.in);

        System.out.print("Your Choice : ");

        char output_honrymoon_rooms = output.next().charAt(0);

        honey_moon_pacakages my_object = new honey_moon_pacakages();

        my_object.honeymoon(output_honrymoon_rooms);


    }





}