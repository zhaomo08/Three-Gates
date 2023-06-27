import javax.sound.sampled.Port;

/**
 * @author jiacheng
 * @date 28/6/23 12:19 am Wednesday
 * @description :
 */
public class WinningPrize {

    private double chance;
    private int playTime;

    private int N;

    public WinningPrize(double chance, int playTime, int n) {
        // TODO: 28/6/23 判断  参数是否符合逻辑
        this.chance = chance;
        this.playTime = playTime;
        N = n;
    }

    public void  run(){

        int wins = 0;
        for (int i = 0; i < N; i++)
            if (play())
                wins ++;
        System.out.println("winning rate: " + (double) wins/N);
    }

    private boolean play() {
        for (int i = 0; i < playTime; i++)
            if (Math.random() < chance)
                return true;

        return false;
    }


    public static void main(String[] args) {
        double chance = 0.2;
        int playTime = 10;

        int N = 1000000;

        WinningPrize exp = new WinningPrize(chance, playTime, N);
        exp.run();

    }
}
