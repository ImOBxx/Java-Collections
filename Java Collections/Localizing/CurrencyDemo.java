
import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {
    public static void main(String[] args) {
        Locale locale = new Locale("hi", "CH");  // Hindi locale for India
        Currency bhartiyaCurrency = Currency.getInstance(locale);
        StringBuilder builder = new StringBuilder();
        
        builder.append(bhartiyaCurrency.getCurrencyCode()); // Currency code (e.g., INR)
        builder.append(" | ");
        builder.append(bhartiyaCurrency.getDisplayName());  // Currency name (e.g., Indian Rupee)
        builder.append(" | ");
        builder.append(bhartiyaCurrency.getSymbol());       // Currency symbol (e.g., ₹)
        
        System.out.println(builder);
    }
}
