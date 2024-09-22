import java.util.Locale;
import java.util.ResourceBundle;

public class Program {

 public static void main(String[] args) {
  ResourceBundle myResourseBundle=ResourceBundle.getBundle("MessageBundle",Locale.CHINESE);
  
  System.out.println(myResourseBundle.getString("message"));

 }

}

