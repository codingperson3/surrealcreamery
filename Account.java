


public class Account {
    private String email;
    private String password;
    private String phoneNum;

   
    public Account() {
        email = " ";
        password = " ";
        phoneNum = " ";
    }

   
    public Account(String newemail, String newpassword, String newphoneNum) {
        email = newemail;
        password = newpassword;
        phoneNum = newphoneNum;
    }

    
    public String getEmail() {
        return email;
    }

    public String getPass() {
        return password;
    }

    public String getPhone(){
        return phoneNum;
    }



}

