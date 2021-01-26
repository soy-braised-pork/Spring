package com.example.archiecture.controller;



@Controller //表示在tomcat启动的时候，把这个类作为一个控制器加载到Spring的Bean工厂，如果不加，就是一个普通的类，和Spring没有半毛钱关系
public class ClazzController {

    @Autowired  //它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。 通过 @Autowired的使用来消除 set ，get方法。
    private UserClazzServiceImpl userClazzService;

    @Autowired
    private ClazzServiceImpl clazzService;

    //就是通过它来指定控制器可以处理哪些URL请求，相当于Servlet中在web.xml中配置
    @RequestMapping(value = "add_clazz", method = RequestMethod.POST)
    @ResponseBody
    public String registry(@RequestBody Clazz clazz) {
        int result = clazzService.insertClazz(clazz);
        if (result != 0){
            return "sucess insert" + clazz.getClazzName();
        }
        return "添加班级失败";
    }
}
