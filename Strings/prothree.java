class prothree {
    public static void main(String[] args) {
        String s = "java";
        int v = 0, c = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                v++;
            else
                c++;
        }
        
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }
}
