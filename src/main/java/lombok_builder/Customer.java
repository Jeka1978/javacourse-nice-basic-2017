package lombok_builder;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;

import java.util.List;
import java.util.Map;

/**
 * Created by Evegeny on 20/06/2017.
 */
@Data
@Builder
public class Customer {
    private String name;
    @NonNull
    private Integer age;
    private int salary;

    @Singular
    private Map<String,Integer> priorities;
    @Singular
    private List<String> beers;

    @Singular("oneFish")
    private List<String> fish;
}
