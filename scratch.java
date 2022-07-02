

import java.util.Objects;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
       String username, password,answer,newpassword,password1;
       password1="Password";

       Scanner inp=new Scanner(System.in);

       System.out.println("Username:");
       username=inp.nextLine();

       System.out.println("Password:");
       password=inp.nextLine();
        if ((username.equals("Username"))&&(password.equals(password1))){
            System.out.println("Welcome");

        } else if (username.equals("Username")) {
            System.out.println("To reset your password type 'yes':");
            answer=inp.nextLine();
            if (answer.equals("yes")){
                System.out.println("Please enter your new password:");
                newpassword=inp.nextLine();
                if (newpassword.equals(password1)){
                    System.out.println("Error!. Please try different combination");


                }else{
                    password1=newpassword;
                    System.out.println("Your password has successfully changed.");

                }




            }else{
                System.out.println("Please check your password and username.");
            }


        } else{
            System.out.println("Please check your password and username.");

        }









    }
}


