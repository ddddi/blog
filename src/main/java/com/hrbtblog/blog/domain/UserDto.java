package com.hrbtblog.blog.domain;

public class UserDto {
    public String userDto;
    public String userName;
    public String userPsw;
    public String loginError;


    @Override
    public String toString() {
        return "UserDto{" +
                "userDto='" + userDto + '\'' +
                ", userName='" + userName + '\'' +
                ", userPsw='" + userPsw + '\'' +
                ", loginError='" + loginError + '\'' +
                '}';
    }

    public String getUserDto() {
        return userDto;
    }

    public void setUserDto(String userDto) {
        this.userDto = userDto;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw;
    }

    public String getLoginError() {
        return loginError;
    }

    public void setLoginError(String loginError) {
        this.loginError = loginError;
    }
}
