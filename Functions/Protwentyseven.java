public class Main {
    static boolean normalHeartRate(int bpm) {
        return bpm >= 60 && bpm <= 100;
    }

    public static void main(String[] args) {
        int bpm = 72;

        if(normalHeartRate(bpm))
            System.out.println("Normal Heart Rate");
        else
            System.out.println("Abnormal Heart Rate");
    }
}
