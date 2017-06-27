package mySpring;

import lombok.SneakyThrows;

/**
 * Created by Evegeny on 27/06/2017.
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            type = config.resolveImpl(type);
        }

        T t = type.newInstance();


        return t;

    }

















}
