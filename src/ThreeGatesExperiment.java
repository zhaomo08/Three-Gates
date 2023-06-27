/**
 * @author jiacheng
 * @date 27/6/23 11:54 pm Tuesday
 * @description :
 */
public class ThreeGatesExperiment {


    private int N;

    public ThreeGatesExperiment(int n) {
        // TODO: 27/6/23   判断 N不能小于 0
        N = n;
    }

    public void run(boolean changeDoor){
        int wins = 0;
        for (int i = 0; i <N; i++)
            if (play(changeDoor))
                wins ++;

        System.out.println(changeDoor ? "Change" : "Not Change");
        System.out.println("winning rate: " + (double)wins / N);

    }

    private boolean play(boolean changeDoor) {
        //  Door  0 1 2
        int prizeDoor = (int)(Math.random() * 3);
        int playerChoice =  (int)(Math.random() * 3);

        if (playerChoice == prizeDoor){
            return !changeDoor;
        }else {
//            return changeDoor ? true :false;
            return changeDoor;
        }
     }

    public static void main(String[] args) {

        int N =  10000000;

        ThreeGatesExperiment exp = new ThreeGatesExperiment(N);

        exp.run(true);
        System.out.println();
        exp.run(false);


    }
}
