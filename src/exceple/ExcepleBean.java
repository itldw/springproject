package exceple;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 14:18 2019/4/22
 * @Modified By :
 */
@Component
public class ExcepleBean {

    {
        System.out.println(this.getClass().getName());
    }
}
