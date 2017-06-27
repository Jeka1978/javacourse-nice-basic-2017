package mySpring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

import static mySpring.ObjectFactory.getInstance;

/**
 * Created by Evegeny on 27/06/2017.
 */
public class InjectByFieldTypeObjectConfigurer implements ObjectConfigurer {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectByFieldType.class)) {
                Object object = getInstance().createObject(field.getType());
                field.setAccessible(true);
                field.set(t,object);
            }
        }
    }
}
