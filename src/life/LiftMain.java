package life;

import exceple.ExcepleBean;
import exceple.ExcepleConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 15:40 2019/5/7
 * @Modified By :
 */
public class LiftMain {
    public  static  void main(String[] args){
        AnnotationConfigApplicationContext acc=new AnnotationConfigApplicationContext(ExcepleConfig.class);
        Car car=(Car) acc.getBean(Car.class);

        System.out.println("----------------------------");
        System.out.println(car.getColor());

        System.out.println("bean count:"+acc.getBeanDefinitionCount());

    }
}
