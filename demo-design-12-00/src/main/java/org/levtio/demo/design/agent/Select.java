package org.levtio.demo.design.agent;

import java.lang.annotation.*;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/17  15:26
 * @Describe:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Select {
    String value() default "";
}
