package insurance;

import java.time.LocalDate;

public abstract class Insurance {
    String name;
    double fee;
    LocalDate startEndDate;

    abstract double Calculate();
}
