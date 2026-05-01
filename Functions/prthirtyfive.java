public class Main {
    static boolean hasDuplicate(String[] files) {
        for(int i = 0; i < files.length; i++) {
            for(int j = i + 1; j < files.length; j++) {
                if(files[i].equals(files[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "App.java", "Main.java"};

        if(hasDuplicate(files))
            System.out.println("Duplicate Found");
        else
            System.out.println("No Duplicates");
    }
          }
