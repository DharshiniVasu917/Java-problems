public class Main {
    static boolean allUnique(String[] files) {
        for(int i = 0; i < files.length; i++) {
            for(int j = i + 1; j < files.length; j++) {
                if(files[i].equals(files[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "App.java", "Index.html"};

        if(allUnique(files))
            System.out.println("All Unique");
        else
            System.out.println("Duplicates Found");
    }
}
