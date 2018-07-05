import com.sun.istack.internal.tools.ParallelWorldClassLoader;
import sun.font.CoreMetrics;

public interface Carta {
    Carta truco(Carta carta);

    boolean equals(Object other);

    String palo();

    Integer numero();
}
