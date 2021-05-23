import java.io.IOException;

import java.util.Scanner;

public class hotel_rooms
{
    static String name;

    static int price;

    room_packages backobj = new room_packages();

    static booking roombook_obj = new booking();

    public void hotel_room_details(char newinputz) throws IOException {

        if (newinputz == '1') {
            name = "Deluxe Room-Twin Bed";

            int price = 9500;

            System.out.print("Deluxe Room-Twin Bed\n\n");

            System.out.print("Our Facilities \n\n");

            System.out.print(" (01)Room Services Some rooms with balcony Twin bed 24/7 Service Wifi,Attached Bathrooms Hot & Cold water Facilities\n\n");

            System.out.print(" (02)Tea/Coffee making facilities\n\n");

            System.out.print(" (03)Rooms with safe 24 hrs security Mini bar on request 32  LCD TV With cable Network\n\n");

            System.out.print("ROOM CHARGE FOR ONE DAY : LKR" + price + ".00\n\n");

            System.out.print("WANNA GO BACK [PRESS B] | WANNA GO BOOKING SECTION [PRESS Y] \n \n ");

            Scanner sysback = new Scanner(System.in);

            System.out.print("Your Choice : ");

            char sysback_choice = sysback.next().charAt(0);

            mainmenu(sysback_choice, name, price);

        }

        else if (newinputz == '2') {

            name = "Standard Room-Single Bed";

            int price = 7500;

            System.out.print("Standard Room-Single Bed\n\n");

            System.out.print("Our Facilities \n\n");

            System.out.print(" (01)Room Services 1 king size bed 24/7 service WiFi and Attached Bathrooms Hot & Cold water Facilities\n\n");

            System.out.print(" (02)Tea/Coffee making facilities\n\n");

            System.out.print(" (03)Rooms with safe 24 hrs security Mini bar on request 32  LCD TV With cable Network\n\n");

            System.out.print("ROOM CHARGE FOR ONE DAY : LKR" + price + ".00\n\n");

            System.out.print("WANNA GO BACK [PRESS B] | WANNA GO BOOKING SECTION [PRESS Y] \n \n ");

            Scanner sysback = new Scanner(System.in);

            System.out.print("Your Choice : ");

            char sysback_choice = sysback.next().charAt(0);

            mainmenu(sysback_choice, name, price);

        }

        else if (newinputz == '3') {
            name = "Super Deluxe Room-Twin Bed";

            int price = 13000;

            System.out.print("Super Deluxe Room-Twin Bed\n\n");

            System.out.print("Our Facilities \n\n");

            System.out.print(" (01)Room Services Some rooms with balcony Twin bed 24/7 Service and Free Wifi\n\n");

            System.out.print(" (02)Attached Bathrooms Hot & Cold water Facilities\n\n");

            System.out.print(" (03)Tea/Coffee making facilities\n\n");

            System.out.print(" (04)Rooms with safe 24 hrs security Mini bar on request 32  LCD TV With cable Network\n\n");

            System.out.print("ROOM CHARGE FOR ONE DAY : LKR" + price + ".00\n\n");

            System.out.print("WANNA GO BACK [PRESS B] | WANNA GO BOOKING SECTION [PRESS Y] \n \n ");

            Scanner sysback = new Scanner(System.in);

            System.out.print("Your Choice : ");

            char sysback_choice = sysback.next().charAt(0);

            mainmenu(sysback_choice, name, price);

        }

        else {
            System.out.print("WRONG INPUT PLEASE TRY AGAIN \n\n");

            room_packages room_packages_obj = new room_packages();

            room_packages.hotelrooms(newinputz);
        }

    }

    public static void mainmenu(char sysback_choice, String name, int price) throws IOException
    {
        if((sysback_choice == 'b') || (sysback_choice == 'B'))
        {
            room_packages.hotelrooms(sysback_choice);
        }
        else if((sysback_choice == 'y') || (sysback_choice == 'Y'))
        {
            roombook_obj.hotel_room_booking(name, price);
        }

    }


}


