package guess_game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * Created by Evegeny on 15/06/2017.
 */
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Player {
    private final String name;
    private double score;



}
