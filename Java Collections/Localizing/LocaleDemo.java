import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        //Locale locale = Locale.getDefault();
        Locale locale = new Locale("sa", "IN");
        System.out.println("Default locale: " + locale);
    }
}
