<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/24
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title></title>
    <link rel="stylesheet" href="../../css/pintuer.css">
    <link rel="stylesheet" href="../../css/admin.css">
    <script src="../../js/jquery.js"></script>
    <script src="../../js/pintuer.js"></script>
    <script src="http://img.jb51.net/jslib/jquery/jquery.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $("#province").change(function(){
                $("#province option").each(function(i,o){
                    if($(this).attr("selected"))
                    {
                        $(".city").hide();
                        $(".city").eq(i).show();
                    }
                });
            });
            $("#province").change();
        });
    </script>
</head>
<div class="panel admin-panel">
    <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加内容</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" action="/product/add.do">

            <div class="form-group">
                <div class="label">
                    <label>核算状态：</label>
                </div>
                <div class="field">
                    <select name="price_status" class="input w50">
                        <option value="">请选择分类</option>
                        <option value="1">核算完成</option>
                        <option value="0">核算中</option>
                    </select>
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>出发时间：</label>
                </div>

            </div>

            <div class="form-group">
                <div class="label">
                    <label>儿童价：</label>
                </div>
                <div class="field">
                    <input onkeyup="if(isNaN(value))execCommand('undo')" type="text" class="input w50" value="" name="child_price"/>
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>成人价：</label>
                </div>
                <div class="field">
                    <input onkeyup="if(isNaN(value))execCommand('undo')" type="text" class="input w50" value="" name="adult_price" data-validate="required:请输入成人价"/>
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>产品名称：</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="product_name" value=""/>
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>副名称：</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="sub_name" value=""/>
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>sitecode：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="sitecode" value=""/>
                    <div class="tips"></div>
                </div>
            </div>



            <div class="form-group">
                <div class="label">
                    <label>省份：</label>
                </div>
                <div class="field">
                    <select id="province" name="province_id" class="input w50">
                        <option value="">请选择省份</option>
                        <option value="1">坝上草原</option>
                        <option value="2">浙江</option>
                        <option value="3">江苏</option>
                        <option value="4">海南</option>
                        <option value="5">陕西</option>
                        <option value="6">湖北</option>
                        <option value="7">四川</option>
                    </select>
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>city_id：</label>
                </div>
                <div class="field">
                    <select  name="city_id" class="input w50 city">
                        <option value="">请选择城市</option>
                    </select>
                    <select  name="city_id" class="input w50 city">
                        <option value="1">西宁</option>
                        <option value="2">张家口</option>
                    </select>
                    <select  name="city_id" class="input w50 city">
                        <option value="3">杭州</option>
                        <option value="4">宁波</option>
                    </select>
                    <select  name="city_id" class="input w50 city">
                        <option value="5">苏州</option>
                        <option value="6">南京</option>
                    </select>
                    <select  name="city_id" class="input w50 city">
                        <option value="7">三亚</option>
                        <option value="8">海口</option>
                    </select>
                    <select  name="city_id" class="input w50 city">
                        <option value="9">西安</option>
                    </select>
                    <select  name="city_id" class="input w50 city">
                        <option value="10">武汉</option>
                    </select>
                    <select  name="city_id" class="input w50 city">
                        <option value="11">甘孜藏族自治州</option>
                    </select>
                    <div class="tips"></div>
                </div>
            </div>



            <div class="form-group">
                <div class="label">
                    <label>天数：</label>
                </div>
                <div class="field">
                    <input onkeyup="value=value.replace(/\D/g,'')" type="text" class="input w50" name="days" value=""/>
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>价格：</label>
                </div>
                <div class="field">
                    <input onkeyup="if(isNaN(value))execCommand('undo')" type="text" class="input w50" name="price" value=""/>
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>图片链接：</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="thumb" value=""/>
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>集合地点：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="place_label" value=""/>
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>活动类型：</label>
                </div>
                <div class="field">
                    <select name="product_cat" class="input w50">
                        <option value="">请选择分类</option>
                        <option value="">草原行游</option>
                        <option value=""></option>
                    </select>
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>class_theme_id：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="class_theme_id" value=""/>
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>旅行方式：</label>
                </div>
                <div class="field">
                    <select name="cid" class="input w50" name="product_type">
                        <option value="">请选择分类</option>
                        <option value="">跟团游</option>
                        <option value="">自由行</option>
                    </select>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>交通方式：</label>
                </div>
                <div class="field">
                    <input type="checkbox" name="checkbox1" value="飞机"> 飞机
                    <input type="checkbox" name="checkbox2" value="轮船"> 轮船
                    <input type="checkbox" name="checkbox3" value="汽车"> 汽车
                    <input type="checkbox" name="checkbox4" value="步行"> 步行

                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>目的地：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="destination" value=""/>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>参加人数：</label>
                </div>
                <div class="field">
                    <input onkeyup="value=value.replace(/\D/g,'')" type="text" class="input w50" name="destination" value=""/>人
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
                    <div class="tips"></div>
                </div>
            </div>
        </form>
    </div>
</div>

</body>
</html>
