package immutable;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by Evegeny on 15/06/2017.
 */
@Getter
@RequiredArgsConstructor
public class ImmutablePerson {
    private final int age;



    public ImmutablePerson setAge(int newAge) {
        return new ImmutablePerson(newAge);
    }
}
