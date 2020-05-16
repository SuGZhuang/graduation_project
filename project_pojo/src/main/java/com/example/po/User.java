package com.example.po;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;


public class User implements Serializable {

    @NotBlank(message = "邮箱不能为空")
    @Email
    private String uemail;
    @NotBlank(message = "用户名不能为空")
    private String uname;
    @NotBlank(message = "密码不能为空")
    private String upassword;
    private String usex;
    private Integer uage;

    public User(@NotBlank(message = "邮箱不能为空") @Email String uemail, @NotBlank(message = "用户名不能为空") String uname, @NotBlank(message = "密码不能为空") String upassword, String usex, Integer uage) {
        this.uemail = uemail;
        this.uname = uname;
        this.upassword = upassword;
        this.usex = usex;
        this.uage = uage;
    }

    public User() {
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }
}
