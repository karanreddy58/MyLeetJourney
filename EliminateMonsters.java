import java.util.Arrays;

public class EliminateMonsters {
    public int eliminateMaximum(int[] dist, int[] speed) {
        for (int i = 0; i < dist.length; ++i)
            dist[i] = (dist[i]+speed[i]-1) / speed[i];
        Arrays.sort(dist);
        for (int i = 0; i < dist.length; ++i)
            if (i >= dist[i])
                return i;
        return dist.length;
    }

    public static void main(String[] args) {
        int dist[]= {4,2,8};
        int speed[]= {2,1,4};

        EliminateMonsters em = new EliminateMonsters();
        System.out.println(em.eliminateMaximum(dist, speed));


    }
}
