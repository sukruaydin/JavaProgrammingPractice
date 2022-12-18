package day35_OOP_Encapsulation.Tasks;

public class Credentials {

    private String username;
    private String password;


    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        if (!isStrongPassWord(password)){
            System.err.println("Password is NOT strong enough");
            System.exit(0);
        }
        this.password = password;
    }


    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }


    public boolean isStrongPassWord(String password){
        boolean result = false;
        char[] arr = password.toCharArray();

        int countLetter = 0;
        int countDigit = 0;
        int countSpeChar = 0;
        for (char each : arr) {
            if (Character.isLetter(each)){
                countLetter++;
            } else if (Character.isDigit(each)) {
                countDigit++;
            } else {
                countSpeChar++;
            }
        }

        if (countLetter>0 && countDigit>0 && countSpeChar>0 && password.length()>=8 && !password.contains(" ")){
            result = true;
        }

        return result;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}

/*
2. create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)


 */
