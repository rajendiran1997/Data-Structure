import java.util.regex.*;

public class EmailValidator{
    public static void main(String args[]){
        Pattern p = Pattern.compile("([a-zA-Z%0-9_-]+[\\.0-9a-zA-Z]+@[a-zA-Z.]+[a-zA-Z]{2,3})");
        Matcher m = p.matcher("mongoosem43mandayan@gmail.com");
        
        while(m.find()){
            System.out.println(m.group());
        }
        //System.out.println();
        if(m.find() == false){
            System.out.println("Data not found");
        }
    }
}
