package moe.quill.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public @Retention(RetentionPolicy.RUNTIME)
@interface Keyable {
    String pluginId() default "";
}

