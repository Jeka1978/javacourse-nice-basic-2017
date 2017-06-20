package inheritance;

import lombok.Getter;

/**
 * Created by Evegeny on 20/06/2017.
 */
public abstract class Shape {
    @Getter
    private Point center;

    public abstract void draw();
}
