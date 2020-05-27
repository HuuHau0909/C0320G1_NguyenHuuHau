package Commons;

import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;
import org.omg.PortableInterceptor.INACTIVE;

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

    public static boolean isValidNameServices(String str) {
        pattern = "^[A-Z][a-z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
        return str.matches(pattern);
    }

    public static boolean isValidFreeServices(String str) {
        pattern = "^massage|karaoke|food|drink|car$";
        return str.matches(pattern);
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

    public static Integer getValidNumberInteger(String strDisplay, String erroMess, Integer min, Integer max) {
        int result = 0;
        System.out.println(strDisplay);
        try {
            result = Integer.parseInt(scanner.nextLine());
            if (min != null && result <= min) {
                throw new Exception(erroMess);
            }
            if (max != null && result >= max) {
                throw new Exception(erroMess);
            }
        } catch (Exception e) {
            System.out.println(erroMess);
            result = getValidNumberInteger(strDisplay, erroMess, min, max);
        }
        return result;
    }

    public static Integer getValidNumberInteger(String strDisplay, String erroMess, Integer min) {
        return getValidNumberInteger(strDisplay, erroMess, min, null);
    }

    public static String getValidFreeServices(String strDisplay,String erromess){
        System.out.println(strDisplay);
        String result = scanner.nextLine();
        if (!isValidFreeServices(result)){
            System.out.println(erromess);
            result = getValidFreeServices(strDisplay,erromess);
        }
        return result;
    }
}
