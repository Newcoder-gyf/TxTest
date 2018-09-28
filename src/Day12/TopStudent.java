package Day12;

import java.util.Date;

public class TopStudent extends Student  {

    private int rank;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "TopStudent{" +
                "rank=" + rank +
                "} " + super.toString();
    }
}
