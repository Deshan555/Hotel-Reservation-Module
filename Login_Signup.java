
import java.io.*;

import java.util.Scanner;

public class Login_Signup
{
    static String user_name;

    public void choise(char operator) throws FileNotFoundException
    {

        if (operator == '1') {
            System.out.println("\n\nPlease Input Your Username and Password \n\n");

            login_page(operator);

        } else if (operator == '2')
        {
            System.out.println("Please Input Your Information Correctly On Signup Form \n\n");

            create_new_account(operator);
        }
        else if (operator == '3')
        {
            System.out.print("Enter Your Administration User Name Password \n\n");

            user adminster = new user();

            adminster.login_page_admin();

            administration admins = new administration();

            admins.admin_choice();

            System.exit(0);

        }
        else {
            System.out.println("Invalid Request Please Try Again \n");

            System.out.println("Already Member Login Here - press 1 \n");

            System.out.println("Not Member Yet Sign Up Here - press 2 \n");

            System.out.println("Admin Login - press 3 \n");

            final Scanner decition = new Scanner(System.in);

            System.out.print("Your Chosie : ");

            final char ope = decition.next().charAt(0);

            choise(ope);
        }

    }

    public static void login_page(char operator) throws FileNotFoundException {
        do {
            boolean islogin = login();

            if (islogin) {
                System.out.print("Login Successfully!!\n\n");

                break;
            } else {
                System.out.print("Login Fail");

                System.exit(0);
            }
        } while (false);

        System.out.println("WEL COME " + user_name);
    }

    public static boolean login() throws FileNotFoundException {  // login

        boolean isAuthenticated = false;

        Scanner un = new Scanner(System.in);

        System.out.print("User Name : ");

        user_name = un.nextLine();

        Scanner pass = new Scanner(System.in);

        System.out.print("\nPassword : ");

        String password = pass.nextLine();

        FileInputStream userinput = new FileInputStream("signin.txt");

        Scanner inputBuffer = new Scanner(userinput);

        while(inputBuffer.hasNext())
        {
            String line = inputBuffer.nextLine();

            String[] values = line.split("\t");

            if(values[0].equals(user_name))
            {
                if(values[1].equals(password))
                {
                    isAuthenticated = true;
                }
            }
        }
        return isAuthenticated;

    }

    public static void create_new_account(char operator) throws FileNotFoundException {
        final Scanner fn = new Scanner(System.in);

        System.out.print("\nYour Full Name : "); //full name

        String full_name = fn.nextLine();

        final Scanner ln = new Scanner(System.in);

        System.out.print("\nYour Last Name : "); //last name

        String last_name = ln.nextLine();

        name_verify();

        final Scanner em = new Scanner(System.in); //email

        System.out.print("\nYour Email Address : ");

        String email = ln.nextLine();

        final Scanner pn = new Scanner(System.in); //phone number

        System.out.print("\nYour Phone Number / voice : ");

        final String number = pn.nextLine();

        final Scanner n_i_c = new Scanner(System.in); //nic

        System.out.print("\nYour Identity Card Number : ");

        final String nic = n_i_c.nextLine();

        final Scanner pass = new Scanner(System.in);//password

        System.out.print("*** USE STRONG UNIQUE PASSWORD*** \n");

        System.out.print("\nYour Password : ");

        String password = pass.nextLine();

        final Scanner pre = new Scanner(System.in);

        System.out.print("\nWanna See Preview Your Account : y/n \n "); //account preview

        final char preview = pre.next().charAt(0);

        if (preview == 'y' || preview =='Y')
        {
            System.out.print("\nFull Name : "+full_name+"\n");

            System.out.print("Last Nmae : "+last_name+"\n\n");

            System.out.print("User Name : "+user_name+"\n\n");

            System.out.print("Email     : "+email+"\n\n");

            System.out.print("Phone Num : "+number+"\n\n");

            System.out.print("N.I.C     : "+nic+"\n\n");

            System.out.print("Password  : "+password+"\n\n");
        }

        else
        {
            System.out.print("Thank You Register Our E-Portel\n\n");
        }

        FileOutputStream signup = new FileOutputStream("signup.txt",true);

        FileOutputStream signin = new FileOutputStream("signin.txt",true);

        FileOutputStream usernames = new FileOutputStream("users.txt",true);

        try
        {
            PrintWriter file = new PrintWriter(signup);

            PrintWriter file_two = new PrintWriter(signin);

            PrintWriter file_three = new PrintWriter(usernames);

            BufferedWriter sign_up = new BufferedWriter(file);

            BufferedWriter signup_two = new BufferedWriter(file_two);

            BufferedWriter signup_three = new BufferedWriter(file_three);

            sign_up.write(full_name+"\t"+last_name+"\t"+user_name+"\t"+email+"\t"+number+"\t"+nic+"\t"+password);

            sign_up.newLine();

            sign_up.close();

            file.close();

            signup_two.write(user_name+"\t"+password);

            signup_two.newLine();

            signup_two.close();

            file_two.close();

            signup_three.write(user_name+"\n");

            signup_three.newLine();

            signup_three.close();

            file_three.close();

        }
        catch (Exception e)
        {
            System.out.print("Error Please Try Again!!");
        }

        System.out.print("Please Log In Using User Name And Password\n");

        login_page(operator);

    }

    public static void name_verify() throws FileNotFoundException {
        do {
            boolean islogin = uname_checker();

            if (islogin) {

                System.out.print("Your User Name Alrady Used By Another Please Try Another\n\n");

                boolean isloginz = uname_checker();

            } else
            {
                System.out.print("Sucess !!");
            }
        } while (false);


    }

    public static boolean uname_checker() throws FileNotFoundException {

        boolean isAuthenticated = false;

        Scanner un = new Scanner(System.in);

        System.out.print("\nUser Name : ");

        user_name = un.nextLine();

        FileInputStream fIS = new FileInputStream("users.txt");

        Scanner inputBuffer = new Scanner(fIS);

        while(inputBuffer.hasNext())
        {
            String line = inputBuffer.nextLine();

            String[] values = line.split("\n");

            if(values[0].equals(user_name))
            {
                isAuthenticated = true;
            }
        }
        return isAuthenticated;

    }


}
