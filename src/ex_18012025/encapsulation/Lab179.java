package ex_18012025.encapsulation;
//Encapsulation
public class Lab179 {
    public static void main(String[] args) {
        VWOLogin1 vwl =new VWOLogin1("admin","Test@123");
        System.out.println(vwl.getUsername());
        vwl.setUsername("Admin");
        System.out.println(vwl.getUsername());
        System.out.println(vwl.getPassword());
        vwl.setPassword("Test@1234",true);
        System.out.println(vwl.getPassword());

    }
}

    class VWOLogin1  // Multiple classes can exist but only one public class recommended
        //Data Members   If you need to access Data Members then you will have to do it with the help of Getters and Setters only
    {
private String username;
private String password;


        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password,boolean IsAuth) {
            if(IsAuth){
                this.password = password;

            }
            else {
                System.out.println("Not Allowed");
            }

        }

        public VWOLogin1 (String usn, String pwd)  //parameterized constructor with 2 Arguments
        {
            this.username=usn;
            this.password=pwd;
        }
    }


