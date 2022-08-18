package com.baizhi.lj.factory;

import com.baizhi.lj.pojo.A;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Author: LiJin
 * @Date: 2022/8/10
 * @Description:
 */
public class PropertiesSingletonFactory {
    private Map<String, Object> instanceMap=new HashMap<>();
    public PropertiesSingletonFactory() throws Exception{
        Properties properties=new Properties();
        properties.load(PropertiesSingletonFactory.class.getResourceAsStream("/factory.properties"));
        for(String key:properties.stringPropertyNames()){//拿到properties中所有的key
            String classNane=properties.getProperty(key);
            instanceMap.put(key,Class.forName(classNane).newInstance());
        }
    }
    public Object getBean(String key){
        return instanceMap.get(key);
    }

    public static void main(String[] args) throws Exception {
        PropertiesSingletonFactory factory=new PropertiesSingletonFactory();
        Object a1=factory.getBean("a");
        Object a2=factory.getBean("a");
        System.out.println(a1==a2);//ture
        A a3=(A)factory.getBean("a");
        System.out.println(a3.name);//"A"
    }
}
