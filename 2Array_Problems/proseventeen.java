class proseventeen {
    public static void main(String[] args) {
        int[][] a = {
            {1,3,5},
            {7,9,11},
            {13,15,17}
        };

        int key = 9;
        int n = a.length, m = a[0].length;
        int low = 0, high = n*m-1;

        while(low<=high){
            int mid = (low+high)/2;
            int val = a[mid/m][mid%m];

            if(val==key){
                System.out.println("Found");
                return;
            }
            else if(val<key) low = mid+1;
            else high = mid-1;
        }
        System.out.println("Not Found");
    }
}
