package reflectios_examples;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class TestRunner {
    public void runTestMethods(Object o) throws InvocationTargetException, IllegalAccessException {
        Class<?> type = o.getClass();
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("test")||
                    method.isAnnotationPresent(TestMethod.class)) {
                method.invoke(o);
            }
        }
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestRunner testRunner = new TestRunner();
        TestClass testClass = new TestClass();
        testRunner.runTestMethods(testClass);
    }
}






