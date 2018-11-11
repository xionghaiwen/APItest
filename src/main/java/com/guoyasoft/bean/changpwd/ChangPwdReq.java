package com.guoyasoft.bean.changpwd;

/**
 * @program: atuo-test3
 * @description:
 * @author: guoya
 * @create: 2018-11-11 17:22
 **/
public class ChangPwdReq {
    private String newPwd;
    private String oldPwd;
    private String reNewPwd;
    private String userName;

    public String getNewPwd() {
      return newPwd;
    }

    public void setNewPwd(String newPwd) {
      this.newPwd = newPwd;
    }

    public String getOldPwd() {
      return oldPwd;
    }

    public void setOldPwd(String oldPwd) {
      this.oldPwd = oldPwd;
    }

    public String getReNewPwd() {
      return reNewPwd;
    }

    public void setReNewPwd(String reNewPwd) {
      this.reNewPwd = reNewPwd;
    }

    public String getUserName() {
      return userName;
    }

    public void setUserName(String userName) {
      this.userName = userName;
    }

    @Override
    public String toString() {
      return "ChangPwd{" +
          "newPwd='" + newPwd + '\'' +
          ", oldPwd='" + oldPwd + '\'' +
          ", reNewPwd='" + reNewPwd + '\'' +
          ", userName='" + userName + '\'' +
          '}';
    }
  }

