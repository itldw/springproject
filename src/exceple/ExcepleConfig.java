package exceple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 13:56 2019/4/22
 * @Modified By :
 */

@ComponentScan({"exceple","life"})
@Import(ImportService.class)
@Configuration
public class ExcepleConfig {


    {
        System.out.println(ExcepleConfig.class.getName());
    }




}
