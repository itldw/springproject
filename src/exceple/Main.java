package exceple;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.xml.ws.Service;
import java.io.Serializable;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 13:53 2019/4/22
 * @Modified By :
 */

public class Main {

    @Autowired
    private  ImportService service;

    public static  void main(String[] args){
        System.out.println("java main method.....");
        AnnotationConfigApplicationContext acc=new AnnotationConfigApplicationContext(ExcepleConfig.class);
       // ExcepleBean bean= (ExcepleBean)acc.getBean("excepleBean");
        ExcepleBean excepleBean=(ExcepleBean) acc.getBean("excepleBean");
        System.out.println("bean count:"+acc.getBeanDefinitionCount());

        ImportService service=acc.getBean(ImportService.class);
        service.doSomething();

        String ss="43560";
        int ssss= Integer.parseInt(ss);

        System.out.println("fdsfdsdd"+ssss);



    }
}
