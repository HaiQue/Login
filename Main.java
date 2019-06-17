import java.io.File;
import java.util.Scanner;

public class Main {

    private static Scanner x;

    public static void main(String[] args) {
        String username = "Bob69";
        String password = "123";
        String filepath = "G:\\Intellij projektukai\\Login\\src\\members.txt";

        verifyLogin (username,password,filepath);

    }

    public static void verifyLogin (String username, String password, String filepath)
    {
        boolean found = false;
        String tempUsername = "";
        String tempPassword = "";

        try
        {
            x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]"); // each field will be separated by a comma (members.txt is separated like that)
            while(x.hasNext() && !found)
            {
                tempUsername = x.next();
                tempPassword = x.next();

                if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()))
                {
                    found = true;
                }
            }
            x.close();
            System.out.println(found);
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }
}
