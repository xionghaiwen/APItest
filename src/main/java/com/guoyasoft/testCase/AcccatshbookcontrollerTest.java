package com.guoyasoft.testCase;

import com.alibaba.fastjson.JSON;
import com.guoyasoft.bean.login.LoginReq;
import com.guoyasoft.bean.login.LoginResp;
import com.guoyasoft.tools.HttpTools;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: atuo-test3
 * @description:
 * @author: guoya
 * @create: 2018-11-10 15:13
 **/
public class AcccatshbookcontrollerTest {
  @Test
  public void testlogin(){
    LoginReq loginReq=new LoginReq();
    loginReq.setPwd("xpp123456");
    loginReq.setUserName("xpp66");
    String reqjson=JSON.toJSONString(loginReq,true);
    System.out.println("-----------请求报文------------");
    System.out.println(reqjson);

    String respSting=HttpTools.doPostByJson("http://qa.guoyasoft.com:8080/user/login",reqjson,"UTF-8");
    System.out.println("--------------响应报文--------------");
    System.out.println(respSting);


    LoginResp loginResp=JSON.parseObject(respSting,LoginResp.class);
    System.out.println("-----------respcode-----------");
    System.out.println(loginResp);
    Assert.assertEquals(loginResp.getRespCode(),"9999");

  }

}
