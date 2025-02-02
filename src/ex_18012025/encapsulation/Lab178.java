package ex_18012025.encapsulation;
//Encapsulation
public class Lab178 {
    public static void main(String[] args) {
        VWOLogin vwl =new VWOLogin("admin","Test@123");
        System.out.println(vwl.password);
        vwl.password="Test@1234";
        System.out.println(vwl.password);

    }
}

    class VWOLogin  // Multiple classes can exist but only one public class recommended
    {
public String username;
public String password;

        public VWOLogin (String usn,String pwd)  //parameterized constructor with 2 Arguments
        {
            this.username=usn;
            this.password=pwd;
        }
    }


