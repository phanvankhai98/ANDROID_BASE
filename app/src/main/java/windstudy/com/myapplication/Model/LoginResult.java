package windstudy.com.myapplication.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import windstudy.com.myapplication.Model.User;

public class LoginResult {

    @SerializedName("status")
    @Expose
    public Integer status;
    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("data")
    @Expose
    public User user;

}