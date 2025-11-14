package Curs3;

public class challenge17 {
    public static void main(String[] args) {
        boolean hasUsername = true;
        boolean hasPassword = true;

        if(hasUsername && hasPassword){
            System.out.println("Authentication successful");
        }   else if (hasUsername && !hasPassword){
            System.out.println("Password is incorrect");
        }   else if(!hasUsername || !hasPassword){
            System.out.println("Authentication failed");
        }

    }
}
