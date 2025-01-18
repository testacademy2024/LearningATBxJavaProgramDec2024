package ex_05012025;

public class Lab145 {
    public static void main(String[] args) {
        System.out.println(args[0]);  //Click on Three Dots of current lab exercise->Under Configurations->Edit->Pass the arguments in the box
        if(args.length>0)
        {
            for (int i=0;i< args.length;i++)
            {
                System.out.println(args[i]);
            }

        }
        else
        {
            System.out.println("No Arguments given");
        }
    }
}
