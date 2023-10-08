package org.levtio.demo.design.door.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/8  11:00
 * @Describe:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoDoor {
    String key() default "";
    String returnJson() default "";
}
