package mySpring;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evegeny on 27/06/2017.
 */
public class JavaConfig implements Config {
    private Map<Class, Class> ifc2Impl = new HashMap<>();

    public JavaConfig() {
        ifc2Impl.put(Speaker.class, ConsoleSpeaker.class);
        ifc2Impl.put(Cleaner.class, PowerCleaner.class);
    }

    @Override
    public <T> Class<T> resolveImpl(Class<T> type) {
        return ifc2Impl.get(type);
    }
}
