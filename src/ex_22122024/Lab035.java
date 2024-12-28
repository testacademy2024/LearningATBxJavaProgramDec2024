package ex_22122024;



public class Lab035 {
    public static void main(String[] args) {
        char c='\n';  //   New/Next Line
        char c1='\t'; //Add Tab
        char c2='\b';// delete 1st char
        char c3='\r'; //delete 1st word
        String s="SANKET";
        String s1="UMRANI";

        System.out.printf(s+c+s1+"\n");//last word printed in next line
        System.out.println("*****");
        System.out.printf(s+c1+s1+"\n");//added extra space between two words
        System.out.println("*****");
        System.out.printf(s+c2+s1+"\n");//deleted space between two words
        System.out.println("*****");
        System.out.printf(s+c3+s1);//deleted 1st word


    }





}
