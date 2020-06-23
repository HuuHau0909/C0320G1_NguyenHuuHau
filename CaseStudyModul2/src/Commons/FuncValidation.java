package Commons;

import CustomerException.*;
import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class FuncValidation {
    public static Scanner scanner = new Scanner(System.in);
    private static String pattern = "";

    public static boolean isValidadIdService(Services service, String str) {
        if (service instanceof Villa) {
            pattern = "^SVVL-\\d{4}$";
        } else if (service instanceof House) {
            pattern = "^SVHO-d{4}$";
        } else if (service instanceof Room) {
            pattern = "^SVRO-d{4}$";
        }
        return str.matches(pattern);
    }

    public static boolean isValidNameServices(String string) {
        pattern = "^[A-Z][a-z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
        return string.matches(pattern);
    }

    public static boolean isValidFreeServices(String string) {
        pattern = "^massage|karaoke|food|drink|car$";
        return string.matches(pattern);
    }

    public static boolean isValidBirthday(String string) {
        pattern = "^[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}$";
        return string.matches(pattern);
    }

    public static boolean isValidEmail(String string) {
        pattern = "\\S+@\\S+.\\S+";
        return string.matches(pattern);
    }

    public static boolean isValidGender(String string) {
        pattern = "^(?i:Male|Female|Unknown)$";
        return string.matches(pattern);
    }

    public static boolean isValidID (String string){
        pattern = "^\\d{9}$";
        return string.matches(pattern);
    }

    public static String getValidIdService(Services service, String strDisplay, String erroMess) {
        System.out.println(strDisplay);
        String result = scanner.nextLine();
        if (!isValidadIdService(service, result)) {
            System.out.println(erroMess);
            result = getValidIdService(service, strDisplay, erroMess);
        }
        return result;
    }

    public static String getValidName(String strDisplay, String erroMess) {
        System.out.println(strDisplay);
        String result = scanner.nextLine();
        if (!isValidNameServices(result)) {
            System.out.println(erroMess);
            result = getValidName(strDisplay, erroMess);
        }
        return result;
    }

    public static Double getValidNumberDouble(String strDisplay, String erroMess, Double min) {
        double result = 0;
        System.out.println(strDisplay);
        try {
            result = Double.parseDouble(scanner.nextLine());
            if (min != null && result <= min) {
                throw new Exception(erroMess);
            }
        } catch (Exception e) {
            System.out.println(erroMess);
            result = getValidNumberDouble(strDisplay, erroMess, min);
        }
        return result;
    }

    public static Double getValidNumberDouble(String strDisplay, String erroMess) {
        return getValidNumberDouble(strDisplay, erroMess, null);
    }

    public static Integer getValidNumberInteger(String strDisplay, String errMess, Integer min, Integer max) {
        int result = 0;
        System.out.println(strDisplay);
        try {
            result = Integer.parseInt(scanner.nextLine());
            if (min != null && result <= min) {
                throw new Exception(errMess);
            }
            if (max != null && result >= max) {
                throw new Exception(errMess);
            }
        } catch (Exception e) {
            System.out.println(errMess);
            result = getValidNumberInteger(strDisplay, errMess, min, max);
        }
        return result;
    }

    public static Integer getValidNumberInteger(String strDisplay, String errMess, Integer min) {
        return getValidNumberInteger(strDisplay, errMess, min, null);
    }

    public static String getValidFreeServices(String strDisplay, String errMess) {
        System.out.println(strDisplay);
        String result = scanner.nextLine();
        if (!isValidFreeServices(result)) {
            System.out.println(errMess);
            result = getValidFreeServices(strDisplay, errMess);
        }
        return result;
    }

    public static String getValidCustomerName(String strDisplay, String errMess) {
        String result = "";
        System.out.println(strDisplay);
        try {
            result = scanner.nextLine();
            if (!isValidNameServices(result)) {
                throw new NameException(errMess);
            }
        } catch (NameException e) {
            System.out.println(errMess);
            result = getValidCustomerName(strDisplay, errMess);
        }
        return result;
    }

    public static String getValidBirthday(String strDisplay, String errMess) {
        String result = "";
        System.out.println(strDisplay);
        try {
            result = scanner.nextLine();
            if (!isValidBirthday(result)) {
                throw new BirthdayException(errMess);
            }
            int year = Integer.parseInt(result.substring(6, 10));
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            if (year <= 1900 || currentYear - year <= 18) {
                throw new BirthdayException(errMess);
            }
        } catch (BirthdayException e) {
            System.out.println(errMess);
            result = getValidBirthday(strDisplay, errMess);
        }
        return result;
    }

    public static String getValidEmail(String strDisplay, String errMess) {
        String result = "";
        try {
            result = scanner.nextLine();
            if (!isValidEmail(result)) {
                throw new EmailExcepction(errMess);
            }
        } catch (EmailExcepction e) {
            System.out.println(errMess);
            result = getValidEmail(strDisplay, errMess);
        }
        return result;
    }

    public static String getValidGender(String strDisplay, String errMess) {
        String result = "";
        System.out.println(strDisplay);
        try {
            result = scanner.nextLine();
            if (!isValidGender(result)) {
                throw new GenderExcepction(errMess);
            }
        } catch (GenderExcepction e) {
            System.out.println(errMess);
            result = getValidGender(strDisplay, errMess);
        }
        return result;
    }

    public static String getValidID(String strDisplay, String errMess){
        String result = "";
        System.out.println(strDisplay);
        try {
            result = scanner.nextLine();
            if (!isValidID(result)){
                throw new IDException(errMess);
            }
        }catch (IDException e){
            System.out.println(errMess);
            result = getValidID(strDisplay,errMess);
        }
        return result;
    }
}
