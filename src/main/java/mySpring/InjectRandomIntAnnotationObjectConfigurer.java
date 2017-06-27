package mySpring;

import heroes.util.RandomUtil;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * Created by Evegeny on 27/06/2017.
 */
public class InjectRandomIntAnnotationObjectConfigurer implements ObjectConfigurer {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomInt.class)) {
                InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
                int min = annotation.min();
                int max = annotation.max();
                field.setAccessible(true);
                field.set(t, RandomUtil.getRandomBetween(min, max));
            }
        }
    }
}
