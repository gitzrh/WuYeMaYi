package com;

import com.ucpaas.restDemo.client.AbsRestClient;
import com.ucpaas.restDemo.client.JsonReqClient;


public class RestTest
{
  static AbsRestClient InstantiationRestAPI() { return new JsonReqClient(); }

  
  public static void testSendSms(String sid, String token, String appid, String templateid, String param, String mobile, String uid) {
    try {
      String str = InstantiationRestAPI().sendSms(sid, token, appid, templateid, param, mobile, uid);
    }
    catch (Exception e) {
      e.printStackTrace();
    } 
  }
}
