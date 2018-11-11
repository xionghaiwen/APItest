package com.guoyasoft.bean.changpwd;

/**
 * @program: atuo-test3
 * @description:
 * @author: guoya
 * @create: 2018-11-11 17:23
 **/
public class ChangPwdResp {
  private String respCode;
  private String respDesc;

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
    return "ChangPwdResp{" +
        "respCode='" + respCode + '\'' +
        ", respDesc='" + respDesc + '\'' +
        '}';
  }
}
