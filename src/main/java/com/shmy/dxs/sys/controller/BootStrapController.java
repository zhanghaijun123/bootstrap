package com.shmy.dxs.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BootStrapController {
    @GetMapping("/success")
    public String success(){
        return "success";
    }
    @GetMapping("/typeset")
    public String typeset(){
        /*排版练习*/
        return "typeset";
    }
    @GetMapping("/code")
    public String code(){
        /*代码练习*/
        return "code";
    }
    @GetMapping("/table")
    public String table(){
        /*表格练习*/
        return "table";
    }
    @GetMapping("/form")
    public String form(){
        /*表单练习*/
        return "form";
    }
    @GetMapping("/button")
    public String button(){
        /*按钮练习*/
        return "button";
    }
    @GetMapping("/images")
    public String images(){
        /*图片练习*/
        return "images";
    }
    @GetMapping("/auxiliary")
    public String auxiliary(){
        /*辅助工具练习*/
        return "auxiliary";
    }
    @GetMapping("/glyphicons")
    public String glyphicons(){
        /*辅助工具练习*/
        return "glyphicons";
    }
    @GetMapping("/dropdowns")
    public String dropdowns(){
        /*下拉菜单练习*/
        return "dropdowns";
    }
    @GetMapping("/buttongroup")
    public String buttongroup(){
        /*下拉菜单练习*/
        return "buttongroup";
    }
    @GetMapping("/buttondropdownmenu")
    public String buttondropdownmenu(){
        /*按钮下拉菜单练习*/
        return "buttondropdownmenu";
    }
    @GetMapping("/inputgroup")
    public String inputgroup(){
        /*输入框组练习*/
        return "inputgroup";
    }
    @GetMapping("/navelement")
    public String navelement(){
        /*导航元素练习*/
        return "navelement";
    }
    @GetMapping("/navigationbar")
    public String navigationbar(){
        /*导航栏练习*/
        return "navigationbar";
    }
    @GetMapping("/breadcrumbs")
    public String breadcrumbs(){
        /*面包屑导航练习*/
        return "breadcrumbs";
    }
    @GetMapping("/pagination")
    public String pagination(){
        /*分页练习*/
        return "pagination";
    }
    @GetMapping("/label")
    public String label(){
        /*标签练习*/
        return "label";
    }
    @GetMapping("/badge")
    public String badge(){
        /*徽章练习*/
        return "badge";
    }
    @GetMapping("/jumbotron")
    public String jumbotron(){
        /*超大屏幕练习*/
        return "jumbotron";
    }
    @GetMapping("/pageheader")
    public String pageheader(){
        /*页面标题练习*/
        return "pageheader";
    }
    @GetMapping("/thumbnail")
    public String thumbnail(){
        /*缩略图练习*/
        return "thumbnail";
    }
    @GetMapping("/alerts")
    public String alerts(){
        /*警告练习*/
        return "alerts";
    }
    @GetMapping("/progress")
    public String progress(){
        /*进度条练习*/
        return "progress";
    }
    @GetMapping("/mediaobject")
    public String mediaobject(){
        /*多媒体对象练习*/
        return "mediaobject";
    }
    @GetMapping("/listgroup")
    public String listgroup(){
        /*列表组练习*/
        return "listgroup";
    }
    @GetMapping("/panels")
    public String panels(){
        /*面板练习*/
        return "panels";
    }
    @GetMapping("/well")
    public String well(){
        /*well练习*/
        return "well";
    }
    @GetMapping("/exampleone")
    public String exampleone(){
        /*创建一个网页*/
        return "exampleone";
    }
    @GetMapping("/tologin")
    public String tologin(){
        /*创建一个网页*/
        return "tologin";
    }
}
