package JavaPractics;
import java.util.ArrayList;
import java.util.Scanner;


public class user<firstname> {
    String firstname;
    String lastname;
    String phonenumber;
    String email;
    String address;
    String state;
    String country;

     user(String firstname, String lastname, String phonenumber, String email, String address, String state, String country){
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;

        this.email=email;
        this.address=address;
        this.state=state;
        this.country=country;
     }

    public void firstname(String firstname) {
        this.firstname = firstname;
    }

    public void lastname(String lastname) {
        this.lastname = lastname;
    }

    public void phonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void email(String email) {
        this.email = email;
    }

    void address(String address) {
        this.address = address;
    }

    public void state(String state) {
        this.state = state;
    }

    public String firstname() {
        return this.firstname;
    }

    public String phonenumber() {
        return this.phonenumber;
    }

    public String getemail() {
        return this.email;
    }

    public String getaddress() {
         return this.address;

    }

    public String state() {
        return this.state;
    }

    public String country() {
        return this.country;
    }
}
public class userdetails{
    public static void main(String[] args) {
        int f;
        {
            ArrayList<user> userlist = new ArrayList<>();
            user u = new user("mallika", "maguluri", "6303572476", "mallikamaguluri@gmail.com", "H.no:4-26,madhapur", "telangana", "india");
            userlist.add(u);
            u = new user("mani", "reddy", "633578476", "manireddy@gmail.com", "H.no:4-16,kphb", "telangana", "india");
            userlist.add(u);
            u = new user("sai", "naidu", "9908226476", "sainaidu@gmail.com", "H.no:4-26,madhapur", "telangana", "india");
            userlist.add(u);
            u = new user("pooji", "chowdary", "870972476", "poojichowdary@gmail.com", "H.no:4-26,madhapur", "telangana", "india");
            userlist.add(u);
            u = new user("deepthi", "swami", "6303572476", "deepyhiswami@gmail.com", "H.no:4-26,madhapur", "telangana", "india");
            userlist.add(u);
            u = new user("abhi", "madire", "63668976", "abhimadire@gmail.com", "H.no:4-26,madhapur", "telangana", "india");
            u = new user("vanaja", "sri", "6300879", "vanajasri@gmail.com", "H.no:4-26,madhapur", "telangana", "india");
            userlist.add(u);
            u = new user("sandeep", "chari", "630546476", "sandeepchari@gmail.com", "H.no:4-26,madhapur", "telangana", "india");
            userlist.add(u);
            u = new user("mona", "mova", "633872476", "monamova@gmail.com", "H.no:4-26,madhapur", "telangana", "india");
            userlist.add(u);
            u = new user("likhitha", "sri", "630367876", "likhithasri@gmail.com", "H.no:4-26,madhapur", "telangana", "india");
            userlist.add(u);
            String checkuser = "";
            f = 0;
            System.out.println("entr phonenumber or emailid to get user details:");
            checkuser = new Scanner(System.in).next();
            for (int i = 0; i < userlist.size(); i++) {
                user us = userlist.get(i);
                if (us.firstname().equals(checkuser) || us.getemail().equals(checkuser))
                    f = 1;
                break;
            }
        }
        if (f == 0) {
            System.out.println("details not present");
        }
    }
    }


