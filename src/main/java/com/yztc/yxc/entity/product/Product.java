package com.yztc.yxc.entity.product;

import java.sql.Date;

public class Product {

    private int pid;  //
    private Date starttime;  //开始时间
    private int price_status; //价格状态
    private double adult_price; //成人价格
    private double child_price; //儿童价格
    private int class_id; //类ID
    private String product_name;// 产品名称
    private String sub_name; //二级名称
    private int sitecode; //站点代码
    private int city_id;// 城市编号
    private int province_id; //省ID
    private String days; //天数
    private double price;  //价格
    private String thumb; //略缩图
    private String place_label;  //地方标签
    private String product_cat;  //产品分类
    private String class_theme_id;  //类主题ID
    private String product_type; // 产品类型
    private String vehicle;  // 交通工具
    private String destination; // 目的地
    private String num_people; //参加人数

    public Product(int pid, Date starttime, int price_status, double adult_price, double child_price, int class_id, String product_name, String sub_name, int sitecode, int city_id, int province_id, String days, double price, String thumb, String place_label, String product_cat, String class_theme_id, String product_type, String vehicle, String destination, String num_people) {
        this.pid = pid;
        this.starttime = starttime;
        this.price_status = price_status;
        this.adult_price = adult_price;
        this.child_price = child_price;
        this.class_id = class_id;
        this.product_name = product_name;
        this.sub_name = sub_name;
        this.sitecode = sitecode;
        this.city_id = city_id;
        this.province_id = province_id;
        this.days = days;
        this.price = price;
        this.thumb = thumb;
        this.place_label = place_label;
        this.product_cat = product_cat;
        this.class_theme_id = class_theme_id;
        this.product_type = product_type;
        this.vehicle = vehicle;
        this.destination = destination;
        this.num_people = num_people;
    }

    public Product() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public int getPrice_status() {
        return price_status;
    }

    public void setPrice_status(int price_status) {
        this.price_status = price_status;
    }

    public double getAdult_price() {
        return adult_price;
    }

    public void setAdult_price(double adult_price) {
        this.adult_price = adult_price;
    }

    public double getChild_price() {
        return child_price;
    }

    public void setChild_price(double child_price) {
        this.child_price = child_price;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public int getSitecode() {
        return sitecode;
    }

    public void setSitecode(int sitecode) {
        this.sitecode = sitecode;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getPlace_label() {
        return place_label;
    }

    public void setPlace_label(String place_label) {
        this.place_label = place_label;
    }

    public String getProduct_cat() {
        return product_cat;
    }

    public void setProduct_cat(String product_cat) {
        this.product_cat = product_cat;
    }

    public String getClass_theme_id() {
        return class_theme_id;
    }

    public void setClass_theme_id(String class_theme_id) {
        this.class_theme_id = class_theme_id;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getNum_people() {
        return num_people;
    }

    public void setNum_people(String num_people) {
        this.num_people = num_people;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", starttime=" + starttime +
                ", price_status=" + price_status +
                ", adult_price=" + adult_price +
                ", child_price=" + child_price +
                ", class_id=" + class_id +
                ", product_name='" + product_name + '\'' +
                ", sub_name='" + sub_name + '\'' +
                ", sitecode=" + sitecode +
                ", city_id=" + city_id +
                ", province_id=" + province_id +
                ", days='" + days + '\'' +
                ", price=" + price +
                ", thumb='" + thumb + '\'' +
                ", place_label='" + place_label + '\'' +
                ", product_cat='" + product_cat + '\'' +
                ", class_theme_id='" + class_theme_id + '\'' +
                ", product_type='" + product_type + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", destination='" + destination + '\'' +
                ", num_people='" + num_people + '\'' +
                '}';
    }
}
