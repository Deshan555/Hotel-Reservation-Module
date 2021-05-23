import java.io.*;

import java.util.Scanner;

import java.util.Date;

import java.util.Random;

import java.text.SimpleDateFormat;

public class booking
{
    public void hotel_room_booking(String roomtype, int price) throws IOException
    {

        Scanner client = new Scanner(System.in);

        System.out.print("Enter Your Name : ");

        String client_name = client.nextLine();

        System.out.print("Room Type : " + roomtype+"\n");

        Scanner mobile_num = new Scanner(System.in);

        System.out.print("Personal Number : ");

        int mobile_number = mobile_num.nextInt();

        Scanner nights = new Scanner(System.in);

        System.out.print("Enter Days Want To Stay : ");

        int nights_stay = nights.nextInt();

        int total_bill = price * nights_stay;

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date = new Date();

        Random rand = new Random();

        // Generate random integers in range 0 to 10000

        int randomid = rand.nextInt(10000);

        System.out.print("Your BOOKING ID : OID" + randomid+"\n");

        Scanner comferm = new Scanner(System.in);

        String status = "Unconformed";

        System.out.print("Want a Comferm Your Booking [Y/N] : ");

        char comferm_booking = comferm.next().charAt(0);

        if ((comferm_booking == 'y') || (comferm_booking == 'y')) {
            System.out.print("Your Order Successfully Recorded\n\n");

            System.out.print("Customer Name : " + client_name + "\n");

            System.out.print("Room Type : " + roomtype + "\n\n");

            System.out.print("Booking ID : " + randomid + "\n\n");

            System.out.print("Booking Status    : "+status+ "\n\n");

            System.out.print("Booking Time and Date " + formatter.format(date) + "\n\n");

            System.out.print("Mobile Phone Name   : " + mobile_number + "\n\n");

            System.out.print("Payment : LKR " + total_bill + ".00\n\n");

            System.out.print("Thanks "+client_name+" Using Our Service.\n\n");


        } else if ((comferm_booking == 'n') || (comferm_booking == 'N')) {
            Scanner gomainmenu = new Scanner(System.in);

            System.out.print("Wanna Go Main Menu (Y | N) : ");

            char gom_menu = gomainmenu.next().charAt(0);

            if ((gom_menu == 'y') || (gom_menu == 'Y')) {
                System.out.print("\n1.Hotel Rooms Booking \n\n2.Honeymoon Special \n\n3.Feedbacks\n\n4.About Us\n\n");

                final Scanner select = new Scanner(System.in);

                System.out.print("Your Choice : ");

                char choise = select.next().charAt(0);

                room_packages nPackages = new room_packages();

                nPackages.user_choise_controller(choise);

            }


        }

        pending_database(randomid,status,client_name,mobile_number,total_bill);

        FileOutputStream fos = new FileOutputStream("booking.txt",true);

        PrintWriter myobj = new PrintWriter(fos);

        myobj.println(randomid+"\t"+status+"\t"+client_name+"\t"+mobile_number+"\t"+total_bill+"\n");

        myobj.close();

    }

    public void pending_database(int randomid,String status,String client_name, int mobile_number, int total_bill)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("Database.txt",true);

            PrintWriter myobj = new PrintWriter(fos);

            myobj.println(randomid+","+status+","+client_name+","+mobile_number+","+total_bill);

            myobj.close();

        }
        catch(Exception e)
        {

        }
    }

    }



















