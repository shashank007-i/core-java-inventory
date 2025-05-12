package methods_functions;

import java.net.StandardSocketOptions;

public class Example1 {

    static void printuserprofile(String name,int age,String location,String status,String interests){
        System.out.println("user:"+name);
        System.out.println("Age:"+age);
        System.out.println("Location:"+location);
        System.out.println("Status:"+status);
        System.out.println("Interests:"+interests);
        System.out.println("----------------------------");

        return;
    }
    public static void main(String args[]){

        printuserprofile("shashank", Integer.parseInt("21"),"nagpur","active","music,coding");

    }

}
