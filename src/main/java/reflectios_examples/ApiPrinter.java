package reflectios_examples;

import heroes.Elf;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class ApiPrinter {
    public void printApi(Object o) {
        Class<?> type = o.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            System.out.println("field name = " + name);
            Class<?> fieldType = field.getType();
            System.out.println(fieldType.getSimpleName());
        }
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            int modifiers = method.getModifiers();
          /*  Modifier.isAbstract(modifiers)*/

            String name = method.getName();
            System.out.println("method name = " + name);
        }
    }

    public static void main(String[] args) {
        Elf elf = new Elf();
        ApiPrinter apiPrinter = new ApiPrinter();
        apiPrinter.printApi(elf);
    }
}





