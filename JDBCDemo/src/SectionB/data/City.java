package SectionB.data;

import java.util.Objects;

public class City {
    private String name;
    private boolean isTraversed;
    private int kilometersRequired;

    @Override
    public String toString() {
        return String.format(
                "%-15s, %-20s. %-4d",
                name,
                isTraversed ? "I have been there" : "I have not been there",
                kilometersRequired
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return isTraversed == city.isTraversed &&
                kilometersRequired == city.kilometersRequired &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isTraversed, kilometersRequired);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTraversed() {
        return isTraversed;
    }

    public void setTraversed(boolean traversed) {
        isTraversed = traversed;
    }

    public int getKilometersRequired() {
        return kilometersRequired;
    }

    public void setKilometersRequired(int kilometersRequired) {
        this.kilometersRequired = kilometersRequired;
    }

    public City(String name, boolean isTraversed, int kilometersRequired) {
        this.name = name;
        this.isTraversed = isTraversed;
        this.kilometersRequired = kilometersRequired;
    }
}
