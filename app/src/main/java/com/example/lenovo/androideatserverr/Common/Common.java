package com.example.lenovo.androideatserverr.Common;

import com.example.lenovo.Remote.APIService;
import com.example.lenovo.Remote.RetrotitClient;
import com.example.lenovo.androideatserverr.Model.Request;
import com.example.lenovo.androideatserverr.Model.User;

/**
 * Created by LENOVO on 16.01.2018.
 */

public class Common {

   // private static final String BASE_URL="http://fcm.googleapis.com";

  //  public static APIService getFCMService()
   // {
       // return RetrotitClient.getClient(BASE_URL).create(APIService.class);

 //   }


    public static User currentUser;
    public static Request currentRequest;
    public  static  final  String UPDATE="Düzenle";
    public  static  final  String DELETE="Sil";

    public static final int PICK_IMAGE_REQUEST=71;

    public static String convertCodeToStatus(String code)
    {
        if(code.equals("0"))
            return "Sipariş alındı";
        else if(code.equals("1"))
            return "Hazırlanıyor";
        else
            return "Hazır";


    }

}
