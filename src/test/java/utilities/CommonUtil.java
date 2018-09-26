package utilities;
import java.util.UUID;
import com.mifmif.common.regex.Generex;

public class CommonUtil {
    public static String generateUUIDString() {
        return UUID.randomUUID().toString();
    }

    public static String generateRandomString() {
        return generateRandomString(10);
    }

    public static String generateRandomEmailId() {
        String email = CommonUtil.generateRandomString(5) + "@" + CommonUtil.generateRandomString(5) + ".com";
        return email;
    }

    public static String generateRandomString(String regexPattern, int length) {
        String generexPattern = "(" + regexPattern + "{" + length + "})";
        return generex(generexPattern);

    }

    public static String generateRandomString(int length) {
        String generexPattern = "([a-z][A-Z][0-9]{" + (length - 2) + "})";
        return generex(generexPattern);

    }

    public static String generateRandomNumber(int length) {
        String generexPattern = "([0-9]{" + length + "})";
        return generex(generexPattern);
    }

    public static String generex(String regexPattern) {
        Generex generex = new Generex(regexPattern);
        return generex.random();
    }

}
