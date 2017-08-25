package com.yztc.yxc.entity.admin;

public class User {
    private int id;
    private String username;
    private String telephone;
    private String email;
    private String nickname;
    private  int gender;
    private String province;
    private String city;
    private String password;
    private  String status;

    public User() {
    }

    public User(int id, String username, String telephone, String email, String nickname, int gender, String province, String city, String password, String status) {
        this.id = id;
        this.username = username;
        this.telephone = telephone;
        this.email = email;
        this.nickname = nickname;
        this.gender = gender;
        this.province = province;
        this.city = city;
        this.password = password;
        this.status = status;
    }

    public User(String username, String telephone, String email, String nickname, int gender, String province, String city, String password, String status) {
        this.username = username;
        this.telephone = telephone;
        this.email = email;
        this.nickname = nickname;
        this.gender = gender;
        this.province = province;
        this.city = city;
        this.password = password;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", gender=" + gender +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
