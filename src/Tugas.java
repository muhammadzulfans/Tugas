import java.util.ArrayList;


public class Tugas {

    public class Biskota {

        public static void main(String[] args) {
            ArrayList<int[]> stopGo = new ArrayList<int[]>();
            stopGo.add(new int[]{10, 0});
            stopGo.add(new int[]{3, 5});
            stopGo.add(new int[]{2, 5});
            System.out.println(GetPassangger(stopGo));

        }

        public static int GetPassangger(ArrayList<int[]> biskota) {
            return biskota.get(0)[0] - biskota.get(0)[1] + biskota.get(1)[0] - biskota.get(1)[1] + biskota.get(2)[1];
        }
    }
}
