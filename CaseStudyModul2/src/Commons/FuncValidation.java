package Commons;

import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

import java.util.Random;

public class FuncValidation {
    private static String pattern ="";
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
    public static boolean isValidNameServices (String str){
pattern = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
return str.matches(pattern);
    }
    public  static boolean isValidFreeServices(String str){
pattern = "^massage|karaoke|food|drink|car$";
    }
    public  static String getValidIdService(Services service,String strDisplay, String erroMess){

    }
}
