package inner_classes;

import lombok.Data;

/**
 * Created by Evegeny on 20/06/2017.
 */
@Data
public class Person {
    private int age;
    private int salary;

    private Person(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    public static class Builder {
        private int age;
        private int salary;

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Person build() {
            validate();
            Person person = new Person(age, salary);
            clean();
            return person;
        }

        private void clean() {
            salary = 0;
            age = 0;
        }

        private void validate() {

            if (salary <= 0) {
                throw new RuntimeException("salary can't be null");
            }
        }

    }


}
