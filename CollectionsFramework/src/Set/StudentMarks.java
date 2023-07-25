package Set;

import java.util.Objects;

public class StudentMarks implements Comparable{

    private int maths;
    private int science;
    private int geography;

    public StudentMarks(int maths, int science, int geography) {
        this.maths = maths;
        this.science = science;
        this.geography = geography;
    }

    public int getMaths() {
        return maths;
    }

    public int getScience() {
        return science;
    }

    public int getGeography() {
        return geography;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public void setGeography(int geography) {
        this.geography = geography;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "maths=" + maths +
                ", science=" + science +
                ", geography=" + geography +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentMarks that = (StudentMarks) o;
        return maths == that.maths && science == that.science && geography == that.geography;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maths, science, geography);
    }


    @Override
    public int compareTo(Object o) {
        return this.maths - ((StudentMarks)o).maths;
    }
}
