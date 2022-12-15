import java.util.Scanner;

public class RegExName
{
    Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int age;
    private boolean isActive;
    private int iD;


    public RegExName()
    {
        firstName = "";
        lastName = "";
        age = 0;
        isActive = false;
        iD = 00000;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String validateFirstName(String firstName)
    {
        while(!firstName.matches("[A-Z][a-zA-Z]]*"))
        {
            System.out.println("Format Wrong");
            firstName = input.nextLine();
        }
        return firstName;
    }

    @Override
    public String toString() {
        return "RegExStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", active=" + isActive +
                ", iD=" + iD +
                '}';
    }
}
