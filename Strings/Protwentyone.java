public class Main {
    public static void main(String[] args) {
        String str = "aabbbcc";
        int[] freq = new int[26];

        for(int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        int first = 0, second = 0;

        for(int i = 0; i < 26; i++) {
            if(freq[i] > first) {
                second = first;
                first = freq[i];
            } else if(freq[i] > second && freq[i] != first) {
                second = freq[i];
            }
        }

        for(int i = 0; i < 26; i++) {
            if(freq[i] == second) {
                System.out.println((char)(i + 'a'));
                break;
            }
        }
    }
                  }
