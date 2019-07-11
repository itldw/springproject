package life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 16:05 2019/5/7
 * @Modified By :
 */
@Component
public class MyBeanPostProcessor  implements BeanPostProcessor{

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof  Car) {
            System.out.println("MyBeanPostProcessor.postProcessBeforeInitialization:" + beanName);
        }
        return bean;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof  Car) {
            Car car=(Car)bean;
            car.setColor("黑色"); //更改属性值
            System.out.println("MyBeanPostProcessor.postProcessAfterInitialization:" + beanName);
        }
        return bean;
    }
}
