package im.wangchao.http;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Description  : Post.</p>
 * <p/>
 * <p>Author       : wangchao.</p>
 * <p>Date         : 15/10/17.</p>
 * <p>Time         : 下午5:55.</p>
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface Post {
    /**
     * the request url
     */
    String url();

    /**
     * the request tag
     */
    String tag() default "";

    /**
     * timeout
     */
    int timeout() default 30;

    /**
     * request heads
     */
    String[] heads() default {};
}
