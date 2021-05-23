import java.io.*;

import java.sql.DatabaseMetaData;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class user
{
    static String admin_name;

    public static void login_page_admin() throws FileNotFoundException
    {
        do {
            boolean islogin = login_admin();

            if (islogin) {
                System.out.print("Login Sucessful!!\n\n");

                break;
            } else {
                System.out.print("Login Fail");

                System.exit(0);
            }
        } while (false);

        System.out.println("WEL COME " +admin_name );
    }

    public static boolean login_admin() throws FileNotFoundException {  // login

        boolean isAuthenticated = false;

        Scanner an = new Scanner(System.in);

        System.out.print("Admin User Name  : ");

        admin_name = an.nextLine();

        Scanner pass = new Scanner(System.in);

        System.out.print("\n\nPassword : ");

        String password = pass.nextLine();

        FileInputStream fis = new FileInputStream("admin.txt");

        Scanner inputBuffer = new Scanner(fis);

        while(inputBuffer.hasNext())
        {
            String line = inputBuffer.nextLine();

            String[] values = line.split("\t");

            if(values[0].equals(admin_name))
            {
                if(values[1].equals(password))
                {
                    isAuthenticated = true;
                }
            }
        }
        return isAuthenticated;

    }


}