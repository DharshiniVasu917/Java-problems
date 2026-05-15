public class Main {
    static String mostFrequentExt(String[] files) {
        String maxExt = "";
        int maxCount = 0;

        for(int i = 0; i < files.length; i++) {
            String ext = "";
            boolean dotFound = false;

            for(int j = 0; j < files[i].length(); j++) {
                if(files[i].charAt(j) == '.') {
                    dotFound = true;
                    ext = "";
                } else if(dotFound) {
                    ext += files[i].charAt(j);
                }
            }

            int count = 0;

            for(int k = 0; k < files.length; k++) {
                String temp = "";
                boolean found = false;

                for(int j = 0; j < files[k].length(); j++) {
                    if(files[k].charAt(j) == '.') {
                        found = true;
                        temp = "";
                    } else if(found) {
                        temp += files[k].charAt(j);
                    }
                }

                if(ext.equals(temp)) {
                    count++;
                }
            }

            if(count > maxCount) {
                maxCount = count;
                maxExt = ext;
            }
        }

        return maxExt;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "Test.java", "index.html", "App.java"};
        System.out.println(mostFrequentExt(files));
    }
                      }
