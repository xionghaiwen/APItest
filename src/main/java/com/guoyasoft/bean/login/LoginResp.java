package com.guoyasoft.bean.login;

/**
 * @program: atuo-test3
 * @description:
 * @author: guoya
 * @create: 2018-11-10 15:06
 **/
public class LoginResp {
  private String respCode;
  private  String respDesc;

  public String getRespCode() {
    return respCode;
  }

  public void setRespCode(String respCode) {
    this.respCode = respCode;
  }

  public String getRespDesc() {
    return respDesc;
  }

  public void setRespDesc(String respDesc) {
    this.respDesc = respDesc;
  }

  @Override
  public String toString() {
    return "LoginResp{" +
        "respCode='" + respCode + '\'' +
        ", respDesc='" + respDesc + '\'' +
        '}';
  }
}
