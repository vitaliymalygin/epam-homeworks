import java.lang.annotation.*;

/**
 * Created by vitaliy on 08.03.16.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface Version {
    public int value();
}
