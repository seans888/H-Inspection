package ispector.edu.apc.global;

import android.app.Application;

/**
 * Created by ispector on 2017-10-25.
 */

public class HousekeepingApp extends Application {

    public static String ServerAddress = "http://172.20.10.2/housekeepingapp";
    public static String UserNo, UserType, QRCode, RoomNo;


    public static void setUserNo(String userNo){
        UserNo = userNo;
    }

    public static String getUserNo(){
        return UserNo;
    }

    public static void setUserType(String userType){
        UserType = userType;
    }

    public static String getUserType(){
        return UserType;
    }

    public static void setQRCode(String qrCode){
        QRCode = qrCode;
    }

    public static String getQRCode(){
        return QRCode;
    }
    public static void setRoomNo(String roomNo){
        RoomNo = roomNo;
    }

    public static String getRoomNo(){
        return RoomNo;
    }
}
