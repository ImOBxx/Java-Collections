
import java.util.Currency;
import java.util.Locale;
import java.util.Set;

public class AllCurrencies {
    public static void main(String[] args) {
        Set<Currency> currencies = Currency.getAvailableCurrencies();
        
        for (Currency currency : currencies) {
            StringBuilder cBuilder = new StringBuilder();
            cBuilder.append(currency.getCurrencyCode());
            cBuilder.append(" | ");
            cBuilder.append(currency.getDisplayName(Locale.ENGLISH)); // Display in English
            cBuilder.append(" | ");
            cBuilder.append(currency.getSymbol());
            System.out.println(cBuilder);
        }
    }
}
