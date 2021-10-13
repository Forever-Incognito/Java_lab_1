package Task7;

import java.util.Objects;

public class User{
    public String firstname;
    public String lastname;
    public int age;
    public String email;

    public User(String firstname, String secondname, int age, String email){
        this.firstname = firstname;
        this.lastname = secondname;
        this.age = age;
        this.email = email;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        if(firstname != user.firstname || lastname != user.lastname || age != user.age || email != user.email)
            return false;
        return age == user.age && Objects.equals(firstname, user.firstname) && Objects.equals(lastname, user.lastname) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return 13 * email.hashCode() +
                13 * firstname.hashCode() +
                13 * lastname.hashCode() +
                13 * age;
    }
}
