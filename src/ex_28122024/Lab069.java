package ex_28122024;

public class Lab069 {
    public static void main(String[] args) {
        // String Immutable concept
        String s1 = "Pramod";
        // 1 , SCP String Constant Pool
        s1 = "Amit";
        // 2 , SCP SCP String Constant Pool
        s1 = "Dutta";
        // 3 . SCP SCP String Constant Pool
        s1 = "Pramod";
        // 3, SCP  this will point to Pramod again so SCP is 3 and Pramod is re used
    }
}
