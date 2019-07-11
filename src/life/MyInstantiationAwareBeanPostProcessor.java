package life;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 15:59 2019/5/7
 * @Modified By :
 */
@Component
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if(beanClass.equals(Car.class)){
            System.out.println("InstantiationAwareBeanPostProcessorAdapter.postProcessBeforeInstantiation");
        }
        return super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        if(bean instanceof  Car){
            System.out.println("InstantiationAwareBeanPostProcessorAdapter.postProcessPropertyValues");
        }
        return super.postProcessPropertyValues(pvs, pds, bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof  Car){
            System.out.println("InstantiationAwareBeanPostProcessorAdapter.postProcessAfterInitialization");
        }
        return super.postProcessAfterInitialization(bean, beanName);
    }
}
