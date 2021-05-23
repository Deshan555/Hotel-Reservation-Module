import java.io.*;

import java.util.Scanner;

class update_file
{
    public void database_update()
    {
        update_file uf=new update_file();

        uf.update();
    }
    public void update()
    {

        System.out.print("\nEnter Order ID You Want Conform : ");

        Scanner sc=new Scanner(System.in);

        int id_to_change=sc.nextInt();

        String to_change_column_names[]={"Order_status : ","client_name","mobile_number","total_bill"};

        int yes_no[]=new int[4];

        String to_update[]=new String[4];

        System.out.print("\nWant To Conform That Order -Yes Press 1 | No Press 0\n\n");

        for(int i=0;i<1;i++)
        {
            System.out.print(to_change_column_names[i]+"");

            int temp=sc.nextInt();

            yes_no[i]=temp;
        }

        System.out.println("_______________________________________________________");

        for(int i=0;i<1;i++)
        {
            System.out.println(to_change_column_names[i]+"");

            if(yes_no[i]==1)
            {

                Scanner choice = new Scanner(System.in);

                System.out.print("\n\nYou Really Want Conform That Order : (Y/N) :");

                char choice_z = choice.next().charAt(0);

                if((choice_z == 'y')||(choice_z == 'Y'))
                {
                    String string1 = "Conform";

                    to_update[i]=string1;

                    System.out.println();
                }
                else if((choice_z == 'n')||(choice_z == 'N'))
                {
                    String string1 = "Unconfirmed";

                    to_update[i]=string1;

                    System.out.println();
                }
                else
                {
                    String string1 = "Pending";

                    to_update[i]=string1;

                    System.out.println();
                }
            }
            else
            {
                System.out.println("Cannot be changed");
            }
        }

        StringBuffer sb=new StringBuffer();
        try
        {
            BufferedReader br=new BufferedReader(new FileReader("Database.txt"));

            String s="";

            while((s=br.readLine())!=null)
            {
                String data[]=new String[6];

                data=s.split(",");

                if(id_to_change==Integer.parseInt(data[0]))
                {
                    String row=data[0]+",";

                    for(int i=0;i<4;i++)
                    {
                        if(yes_no[i]==1)
                        {
                            row=row+to_update[i]+",";
                        }
                        else
                        {
                            row=row+data[i+1]+",";
                        }

                    }
                    sb.append(row);

                    sb.append("\n");
                }
                else
                {
                    sb.append(s);

                    sb.append("\n");
                }
            }



            File f=new File("Database.txt");

            PrintWriter pw=new PrintWriter(new FileOutputStream(f,false));

            pw.print(sb.toString());

            pw.close();
        }
        catch(Exception e)
        {

        }

        System.out.print("Booking Successfully Conformed !!!");


    }
}