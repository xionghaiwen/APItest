package com.guoyasoft.bean.logup;

/**
 * @program: atuo-test3
 * @description:
 * @author: guoya
 * @create: 2018-11-11 14:38
 **/
public class LogUpResp {
  private RespBase respBase;
  private String userName;
  private  String accoutId;
  private String cstId;
  private String userId;

  public RespBase getRespBase() {
    return respBase;
  }

  public void setRespBase(RespBase respBase) {
    this.respBase = respBase;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getAccoutId() {
    return accoutId;
  }

  public void setAccoutId(String accoutId) {
    this.accoutId = accoutId;
  }

  public String getCstId() {
    return cstId;
  }

  public void setCstId(String cstId) {
    this.cstId = cstId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public String toString() {
    return "LogUpResp{" +
        "respBase=" + respBase +
        ", userName='" + userName + '\'' +
        ", accoutId='" + accoutId + '\'' +
        ", cstId='" + cstId + '\'' +
        ", userId='" + userId + '\'' +
        '}';
  }
}
