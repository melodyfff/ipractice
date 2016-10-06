package com.xinchen.spring.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月5日 下午5:10:17 
* @version V1.0   
*/
//@Order(value=1)
@Order(1)
@Component
public class BeanImplTwo implements BeanInterface {

}
