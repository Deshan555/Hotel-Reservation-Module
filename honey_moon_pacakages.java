import java.io.IOException;

import java.util.Scanner;

public class honey_moon_pacakages
{
    public void honeymoon(char honeym) throws IOException //methods for honeymoon room booking
    {
        if(honeym=='1')
        {
            String name = "MOONLIGHT Kurulubedda";

            int price = 35000;

            System.out.print("MOONLIGHT Kurulubedda\n\n");

            System.out.print("COVID-19UPDATE: Safety protocols at MOONLIGHT Hotels\n\n");

            System.out.print("Facilities\n");

            System.out.print(" 1.Free boat ride from MOONLIGHT Kurulubedda followed by a location dining at MOONLIGHT Lighthouse\n\n");

            System.out.print(" 2.Fruit basket, chocolates on arrival\n\n");

            System.out.print(" 3.Free foot massage and 25% discount for any other treatments\n\n");

            System.out.print(" 4.Souvenir – a photograph of the couple in a MOONLIGHT photo frame\n\n");

            System.out.print(" 5.Bed decorator with natural Flowers\n\n");

            System.out.print(" Package Price :LKR"+price+".00\n\n");

            System.out.print("WANNA GO BACK [PRESS B] | WANNA GO BOOKING SECTION [PRESS Y] \n \n ");

            Scanner input = new Scanner(System.in);

            System.out.print("Your Choice : ");

            char input_to_system = input.next().charAt(0);

            mainmenu2(input_to_system,name,price);

        }
        else if(honeym=='2')
        {

            String name = "MOONLIGHT Kaduruketha";

            int price = 40000;

            System.out.print("MOONLIGHT Kaduruketha\n\n");

            System.out.print("COVID-19UPDATE: Safety protocols at MOONLIGHT Hotels\n\n");

            System.out.print("Facilities\n");

            System.out.print(" 1.250g honeymoon cake,Bed decoration,Fruit basket\n\n");

            System.out.print(" 2.Breakfast by the pool\n\n");

            System.out.print(" 3.20% discount on champagne and wines\n\n");

            System.out.print(" 4.Ayurveda or spa massage – 50% off and Picturesque cycle or tuk tuk tour to Ella-wala waterfall\n\n");

            System.out.print(" 5.Kamatha candlelit dinner\n\n");

            System.out.print(" Package Price :LKR"+price+".00\n\n");

            System.out.print("WANNA GO BACK [PRESS B] | WANNA GO BOOKING SECTION [PRESS Y] \n \n ");

            Scanner input = new Scanner(System.in);

            System.out.print("Your Choice : ");

            char input_to_system = input.next().charAt(0);

            mainmenu2(input_to_system,name,price);

        }
        else if(honeym=='3')
        {

            String name = "MOONLIGHT Colombo Seven";

            int price = 32000;

            System.out.print("MOONLIGHT Colombo Seven\n\n");

            System.out.print("COVID-19UPDATE: Safety protocols at MOONLIGHT Hotels\n\n");

            System.out.print("Facilities\n");

            System.out.print(" 1.Decorated room on arrival\n\n");

            System.out.print(" 2.Rose petal bath\n\n");

            System.out.print(" 3.One night stay in a Super Deluxe rooms on bed & breakfast basis\n\n");

            System.out.print(" 4.Bubbly breakfast at the rooftop\n\n");

            System.out.print(" 5.Fruit or chocolate platter\n\n");

            System.out.print(" 6.Free ice and Champagne\n\n");

            System.out.print(" Package Price :LKR"+price+".00\n\n");

            System.out.print("WANNA GO BACK [PRESS B] | WANNA GO BOOKING SECTION [PRESS Y] \n \n ");

            Scanner input = new Scanner(System.in);

            System.out.print("Your Choice : ");

            char input_to_system = input.next().charAt(0);

            mainmenu2(input_to_system,name,price);

        }

}

public static void mainmenu2(char sysback_choice, String name, int price) throws IOException
    {
        if((sysback_choice == 'b') || (sysback_choice == 'B'))
        {
            room_packages new_obj = new room_packages();

            new_obj.honeyrooms(sysback_choice);
        }
        else if((sysback_choice == 'y') || (sysback_choice == 'Y'))
        {
            booking room_booking_object = new booking();

            room_booking_object.hotel_room_booking(name,price);

        }

    }

}
