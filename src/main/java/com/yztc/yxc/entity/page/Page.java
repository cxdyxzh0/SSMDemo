package com.yztc.yxc.entity.page;

import java.util.List;

public class Page<T> {
    // 已知数据
    private int pageNum; //当前页，从请求那边传过来
    private int pageSize;// 每页显示的记录数
    private int totalRecord;// 总记录数，查询数据库得到的数据

    // 需要计算的来
    private int totalPage; //总页数  //通过totalRecord 和pageSize计算课题得来
    // 开始索引，也就是我们在数据库中要从第几行数据开始拿 ，有了startIndex 和pageSize
    //就知道了limit语句的两个数据 ，就能获得每页需要显示的数据
    private int startIndex;// 起始页

    // 将每页要显示的数据放在list集合中
    List<T> list;

    //分页显示的页数 ，比如在页面上显示1,2,3,4, 页 ，start就为1，end 就是4
    private int start;
    private int end;


    //通过pageNum，pageSize ，totalRecord计算得来 totalPage和startIndex
    //构造方法中将pageNum，pageSize，totalRecord获得


    public Page(int pageNum, int pageSize, int totalRecord) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalRecord = totalRecord;

        //totalPage 总页数
        if(totalRecord%pageSize==0){
            //说明整除 ，正好每页显示pageSize 条数据 ，没有多余一页要显示少于PageSize条数据的
            this.totalPage = totalRecord / pageSize;
        }else{
            // 不整除就要在加一夜 ，来显示多余的数据
            this.totalPage = totalRecord /pageSize +1;
        }

        // 开始索引
        this.startIndex = (pageNum-1)*pageSize;
        //显示5页,这里自己可以设置,想显示几页就自己通过下面算法修改i
        this.start = 1;
        this.end = 5;
        //显示页数的算法

        if(totalPage<=5){
            //总页数小于5 那么end就为总页数的值了
            this.end = this.totalPage;
        }else {
            //总页数大于5 那么就要根据当前是第几页,来判断start和edn是多少了
            this.start = pageNum-2;
            this.end = pageNum+2;
            if (start <0){
                //如果当前是第一页 ,或者第二页 那么久不加入这个规则
                this.start=1;
                this.end=5;
            }
            if(end > this.totalPage){
                //如果当前页是当属第二页或者最后一页,也同样不符合上面的规则
                this.end =totalPage;
                this.start =end-5;
            }
        }
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
