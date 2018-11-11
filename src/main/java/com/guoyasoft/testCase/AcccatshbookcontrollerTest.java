package com.guoyasoft.testCase;

import com.alibaba.fastjson.JSON;
import com.guoyasoft.bean.changpwd.ChangPwdReq;
import com.guoyasoft.bean.changpwd.ChangPwdResp;
import com.guoyasoft.bean.login.LoginReq;
import com.guoyasoft.bean.login.LoginResp;
import com.guoyasoft.bean.logup.LogUpReq;
import com.guoyasoft.bean.logup.LogUpResp;
import com.guoyasoft.tools.HttpTools;
import com.guoyasoft.tools.PinYinTools;
import com.guoyasoft.tools.PropertiesTools;
import com.guoyasoft.tools.RandomTools;
import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: atuo-test3
 * @description:
 * @author: guoya
 * @create: 2018-11-10 15:13
 **/
  public class AcccatshbookcontrollerTest {
    public static String name;
  //设置全局变量
    //生成随机变量
    //随机生成电话号码
    String phone= RandomTools.getTel();
    String pwd="xhw123456";
    //随机生成姓名拼音的首字母+数字（100-999）
    String username= PinYinTools.toFirstChar(RandomTools.getChineseName()+RandomTools.getNum(100,999));
    String result="0000";
    //将ulr文件的路径赋值给properties
    Properties properties = PropertiesTools.getProperties("src\\main\\resources\\application.properties");
    //将applicati.properties文件里面的变量名值赋值给自定义变量
    String http=properties.getProperty("api.host.protocal");
    String ip=properties.getProperty("api.host.ip");
    String host=properties.getProperty("api.host.port");


  //注册接口的测试：参数随机生成
  @Test
  //注册接口
    public void testlogup(){
   /* //生成随机变量
    //随机生成电话号码
    String phone= RandomTools.getTel();
    String pwd="xhw123456";
    //随机生成姓名拼音的首字母+数字（100-999）
    String username= PinYinTools.toFirstChar(RandomTools.getChineseName()+RandomTools.getNum(100,999));
    String result="0000";
    //将ulr文件的路径赋值给properties
    Properties properties = PropertiesTools.getProperties("src\\main\\resources\\application.properties");
    //将applicati.properties文件里面的变量名值赋值给自定义变量
    String http=properties.getProperty("api.host.protocal");
    String ip=properties.getProperty("api.host.ip");
    String host=properties.getProperty("api.host.port");
    //组成完整的url地址（变量名+）（需要的特殊符号用双引号）
    String url= http+"://"+ip+":"+host+"/user/signup";
    System.out.println(url);*/

    //请求参数
    LogUpReq logUpReq=new LogUpReq();
    logUpReq.setPhone(phone);
    logUpReq.setPwd(pwd);
    logUpReq.setRePwd(pwd);
    logUpReq.setUserName(username);
    //baen格式转换为java
    String req=JSON.toJSONString(logUpReq,true);
    System.out.println("---------------登录接口：请求报文-----------");
    System.out.println(req);
    //发送请求
    //组成完整的url地址（变量名+）（需要的特殊符号用双引号）
    String url= http+"://"+ip+":"+host+"/user/signup";

    String resp=HttpTools.doPostByJson(url,req,"UTF-8");
    System.out.println("------------登录接口：响应报文---------");
    System.out.println(resp);
    //json转baen
    LogUpResp json=JSON.parseObject(resp,LogUpResp.class);
    Assert.assertEquals(json.getRespBase().getRespCode(),result);
    System.out.println("----------是否成功-----------");
    System.out.println(json.getRespBase().getRespCode());

    name = json.getUserName();
  }

  @Test
  //登录接口
  public void logintest(){
    //组成完整的url地址（变量名+）（需要的特殊符号用双引号）
    String url= http+"://"+ip+":"+host+"/user/login";

    LoginReq loginReq=new LoginReq();
    loginReq.setUserName(name);
    loginReq.setPwd(pwd);
    String req=JSON.toJSONString(loginReq,true);

    String resp=HttpTools.doPostByJson(url,req);
    LoginResp bean=JSON.parseObject(resp,LoginResp.class);
    Assert.assertEquals(bean.getRespCode(),"0000");
    System.out.println("---------登录接口-------------");
    System.out.println(bean.getRespCode());
}

  @Test
  //修改密码接口
    public void changpwd(){
    ChangPwdReq changPwdReq=new ChangPwdReq();
    changPwdReq.setOldPwd(pwd);
    changPwdReq.setNewPwd("xpp654321");
    changPwdReq.setReNewPwd("xpp654321");
    changPwdReq.setUserName(name);

    String req=JSON.toJSONString(changPwdReq,true);

    String url= http+"://"+ip+":"+host+"/user/changepwd";
    String resp=HttpTools.doPostByJson(url,req);
    ChangPwdResp baen= JSON.parseObject(resp,ChangPwdResp.class);
    Assert.assertEquals(baen.getRespCode(),"0000");
    System.out.println("----------------修改密码接口-------------");
    System.out.println(baen.getRespCode());
    pwd="xpp654321";
    logintest();

  }
}