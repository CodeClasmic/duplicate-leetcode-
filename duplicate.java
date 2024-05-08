class duplicate {
    public static void main(String[] args) 
        {
            int[] a = { 1,1,2 };
            int c = 0;
            System.out.println();
            for (int x = 0; x < a.length; x++) {
                if (x != a.length-1) {
                    if (a[x] == a[x + 1]) {
                        c = c + 1;
                        continue;
                    } else {
                        System.out.print(a[x] + ",");
                    }
                }
                else{
                    System.out.print(a[x]);
                    break;
                }
            }
            System.out.println();
            System.out.println(a.length - c);
        }
    
}