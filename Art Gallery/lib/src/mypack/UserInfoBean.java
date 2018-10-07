package mypack;


public class UserInfoBean{
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private char gender;
    private String phone;
    public UserInfoBean(){}

    public UserInfoBean(String firstName, String lastName, String userName, String email, String password,char gender,String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.phone = phone;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setGender(char gender){
        this.gender = gender;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getUserName(){
        return userName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getGender(){
        if(gender=='F'){
            return "Female";
        }
        return "MALE";
    }

    public String getPhone(){
        return phone;
    }

}
