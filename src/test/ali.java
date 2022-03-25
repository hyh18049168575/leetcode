package test;

public class ali {
    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        for(int i = 0;i < t;i++){
//            int[] nums = new int[5];
//            int res = 0;
//            for (int j = 0; j < 5;j++){
//                nums[j] = scanner.nextInt();
//            }
//            Arrays.sort(nums);
//            res += nums[0];
//            int tmp = nums[0];
//            for (int j = 0;j < 5;j++){
//                if (j != 1)nums[j] -= tmp;
//            }
//            Arrays.sort(nums);
//            res += nums[1];
//            System.out.println(res);
//        }
//    }

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        String[] str = new String[n];
//        for(int i = 0 ; i < n; i++){
//            str[i] = scanner.nextLine();
//        }
//        HashSet<String> hs = new HashSet<String>();
//        for (int i = 0;i < n;i++){
//            if (str[i].length() < 6 || str[i].length() > 12) {
//                System.out.println("illegal length");
//                continue;
//            }
//            if (hs.contains(str[i])){
//                System.out.println("acount existed");
//                continue;
//            }
//            if (!judgeChar(str[i])){
//                System.out.println("illegal charactor");
//                continue;
//            }
//            else {
//                if (!hs.contains(str[i])){
//                    hs.add(str[i]);
//                    System.out.println("registration complete");
//                }
//            }
//        }


//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[][] params = new int[n][3];
//        for (int i = 0; i < n; i++){
//        params[i][0] = scanner.nextInt();
//        params[i][1] = scanner.nextInt();
//        params[i][2] = scanner.nextInt();
//        }
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n ;i++){
//        int a = params[i][0];
//        int b = params[i][1];
//        int c = params[i][2];
//        if (b < 0){
//        a = -a;
//        b = -b;
//        }
//        int gcdXY = gcd(Math.abs(a), Math.abs(b));
//        a /= gcdXY;
//        b /= gcdXY;
//        int key = a + b *20001;
//        map.put(key, map.getOrDefault(key, 0) + 1);
//        }
//        long ans = 0;
//        int kinds = map.size();
//        int[] f = new int[kinds];
//        int cur = 0;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
//        int num = entry.getValue();
//        f[cur++] = num;
//        }
//        Arrays.sort(f);
//        for (int i = 0; i < kinds; i++){
//        int flag = i % 2;
//        for (int j = i + 1; j < kinds;j++){
//        if (j % 2 != flag){
//        ans += f[i] * f[j];
//        }
//        }
//        }
//        System.out.println(ans);
//        }
//static int gcd(int a, int b){
//        return b != 0 ? gcd(b, a % b) : a;
}
