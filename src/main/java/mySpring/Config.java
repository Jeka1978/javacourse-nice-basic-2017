package mySpring;

/**
 * Created by Evegeny on 27/06/2017.
 */
public interface Config {
    <T> Class<T> resolveImpl(Class<T> type);
}
