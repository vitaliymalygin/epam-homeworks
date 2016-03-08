import java.awt.*;
import java.util.Objects;

/**
 * Created by vitaliy on 03.03.16.
 */
public class Pen {
    private PenType penType;
    private Color color;
    public Pen(PenType penType, Color color){
        this.penType=penType;
        this.color=color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return penType == pen.penType &&
                Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(penType, color);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "penType=" + penType +
                ", color=" + color +
                '}';
    }

    protected enum PenType{
        GEL,
        BALL,
        FOUNTAIN
    }
}
