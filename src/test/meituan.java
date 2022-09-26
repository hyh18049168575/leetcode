package test;

import java.util.*;

//public class Main {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            long n = scanner.nextLong();
//            long k = scanner.nextLong();
//            long[] f = new long[(int)n];
//            if (k == 1){
//                System.out.println(n);
//                return;
//            }
//            for (int i = 1;i<n;i++){
//                f[i] = (long)Math.pow(3,i);
//            }
//            int ans = 0;
//            for (int i = (int) (n-1);i>0;i--){
//                if (k<=f[i]){
//                    ans+=1;
//                }else if (k>f[i] * 2){
//                    ans+=2;
//                    k = k - 2 * f[i];
//                }else {
//                    k = k -f [i];
//                }
//            }
//            if (k == 1){
//                ans+=1;
//            }else if (k == 3){
//                ans+=2;
//            }
//            System.out.println(ans);
//        }
//}
//}
//2
//
//    public static String encode(String str) {
//        StringBuilder sb = new StringBuilder();
//        List<Character> list = new ArrayList<>();
//        for (char c : str.toCharArray()){
//            list.add(c);
//        }
//
//        int n = list.size()-1;
//        while (!list.isEmpty()){
//            sb.append(list.get(n / 2));
//            list.remove(n / 2);
//            n--;
//        }
//
//        return sb.toString();
//    }
//
//    public static String decode(String str){
//        Deque<Character> deque = new ArrayDeque<>();
//        for (int i = 0;i < str.length(); i++){
//            if (i % 2 == 0)deque.offerFirst(str.charAt(i));
//            else deque.offerLast(str.charAt(i));
//        }
//        StringBuilder sb = new StringBuilder();
//        while (!deque.isEmpty()) sb.append(deque.pollFirst());
//
//        return sb.toString();
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt(),ops = scanner.nextInt();
//        scanner.nextLine();
//
//        String str = scanner.nextLine();
//
//        if (ops == 1) System.out.println(encode(str));
//        else System.out.println(decode(str));
//    }


    //1

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] ori = new int[n];
//        int[] sale = new int[n];
//        for (int i = 0;i<n;i++){
//            ori[i] = scanner.nextInt();
//        }
//        for (int i = 0;i<n;i++){
//            sale[i] = scanner.nextInt();
//        }
//        int m = scanner.nextInt();
//        int[] top = new int[m];
//        int[] less = new int[m];
//        for (int i = 0;i < m;i++){
//            top[i] = scanner.nextInt();
//        }
//        for (int i = 0;i < m;i++){
//            less[i] = scanner.nextInt();
//        }
//        StringBuilder sb = new StringBuilder();
//        int total = 0;
//        int forSale = 0;
//        int forLess = Integer.MAX_VALUE;
//        for (int i = 0;i < n;i++){
//            total += ori[i];
//            forSale += sale[i];
//            for (int j = 0;j < m;j++){
//                if (total > top[j])forLess = Math.min(forLess, total-less[j]);
//            }
//            if (forSale == forLess){
//                sb.append("B");
//            }
//            if (forSale > forLess){
//                sb.append("M");
//            }
//            if (forSale < forLess){
//                sb.append("Z");
//            }
//        }
//        String res = sb.toString();
//        System.out.println(res);
//    }

//3
//public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    int n = in.nextInt();
//    int m1 = in.nextInt();
//    int m2 = in.nextInt();
//    int[][] v1 = new int[m1][2];
//    for (int i = 0;i < m1;i++){
//        v1[i][0] = in.nextInt();
//    }
//    for (int i = 0;i < m1;i++){
//        v1[i][1] = in.nextInt();
//    }
//    int[][] v2 = new int[m2][2];
//    for (int i = 0;i < m2;i++){
//        v2[i][0] = in.nextInt();
//    }
//    for (int i = 0;i < m2;i++){
//        v2[i][1] = in.nextInt();
//    }
//    v1 = merge(v1);
//    v2 = merge(v2);
//    int[][] ans = intervalInsert(v1, v2);
//    int cnt = 0;
//    for (int[] tem:ans){
//        cnt += tem[1] - tem[0] + 1;
//    }
//    System.out.println(cnt);
//}
//    static int[][] merge(int[][] intervals){
//        Queue<int[]> que = new PriorityQueue<>((x,y) -> x[0] - y[0]);
//        for (int[] item : intervals){
//            que.offer(item);
//        }
//        List<int[]> ans = new ArrayList<>();
//        while (!que.isEmpty()){
//            int[] first = que.poll();
//            if (!que.isEmpty() && first[1] >= que.peek()[0]){
//                int[] temp = que.poll();
//                que.offer(new int[]{first[0], Math.max(temp[1], first[1])});
//            }else {
//                ans.add(first);
//            }
//        }
//        int [][] res = new int[ans.size()][2];
//        int cur = 0;
//        for (int[] item : ans){
//            res[cur++] = item;
//        }
//        return res;
//    }
//
//    static int[][] intervalInsert(int[][] first, int[][] second){
//        List<int[]> ans = new ArrayList<>();
//        int i = 0,j = 0;
//
//        while (i < first.length && j < second.length){
//            int a = Math.max(first[i][0],second[j][0]);
//            int b = Math.min(first[i][1],second[j][1]);
//            if (a <= b)ans.add(new int[]{a, b});
//            if (first[i][1] < second[j][1])i++;
//            else j++;
//        }
//        int[][] res = ans.toArray(new int[ans.size()][]);
//        return res;
//    }




//线程
//3



//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if (n > Math.pow(10,9)){
//            System.out.println(0);
//        }
//        char c ;
//                for (int i = 0 ; i < str.length();i++){
//                while (j < str.length()){
//                c = str.charAt(j);
//                if (map.containsKey(c))map.put(c, map.get(c)+1);
//                else {
//                if (map.size() == k)break;
//                map.put(c , 1);
//                }
//                j++;
//                }
//                res = Math.max(res , j - i);
//                c = str.charAt(i);
//                if (map.containsKey(c)){
//                int cnt = map.get(c);
//                if (cnt > 1)map.put(c, cnt-1);
//                }else map.remove(c);
//                }
//        String str = String.valueOf(n);
//        for (int i = 0; i < str.length(); i++){
//            for (int num = 0; num <= 9 ;num++){
//                if (i == 0 && num == 0){
//                    continue;
//                }
//                String temp = str.substring(0 ,i) + num + str.substring(i);
//                if ( Long.valueOf(temp) % 7 == 0){
//                    System.out.println(temp);
//                    return;
//                }
//            }
//        }

//    Scanner scanner = new Scanner(System.in);
//
//    String str = scanner.nextLine();
//    char[] chars = str.toCharArray();
//    int n = chars.length;
//    int[] q = new int[n];
//        for(int i = 0; i < q.length; i++){
//        q[i] = chars[i] - '0';
//        }
//
//        int[] a1 = new int[n];
//        int[] a2 = new int[n];
//
//        for (int i = 0;i < n; i++){
//        a1[i] = i % 2 == 0 ? 0 : 1;
//        a2[i] = i % 2 == 0 ? 1 : 0;
//        }
//
//        int cs1 = 0, cs2 = 0;
//        for (int i = 0; i < n; i++){
//        if (q[i] != a1[i])cs1 += i + 1;
//        if (q[i] != a2[i])cs2 += i + 1;
//        }
//        int res = Math.min(cs1, cs2);
//        System.out.println(res);



//


//    Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        List<Integer> list = new ArrayList<>();
//        int x = n;
//        while ( n > 0 ){
//            int c = n % 10;
//            list.add(c);
//            n /= 10;
//        }
//        int len = list.size();
//
//        for (int i = 0;i <= len; i++){
//            for (int cur = 0;cur <= 9; cur++){
//                int temp = check(i, x, cur);
//                if (temp % 7 == 0){
//                    System.out.println(temp);
//                    return;
//                }
//            }
//        }
//    }
//    static int check(int i, int n, int num){
//        int dig = (int)Math.pow(10, i);
//        int ans = dig * num;
//        int pre = n / dig;
//        int sub = n - pre * dig;
//        ans = ans + pre * 10 +sub;
//        return ans;


//3
//        int res = 0;
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//        scanner.nextLine();
//        String str = scanner.nextLine();
//        res = maxLen(k, str);
//        System.out.println(res);
//    }
//    static int maxLen(int k, String s){
//        int res = 0;
//        char c ;
//        Map<Character, Integer> map = new HashMap<Character, Integer>();
//        int i, j = 0;
//        for (i = 0; i < s.length(); i++){
//            while (j < s.length()){
//                c = s.charAt(j);
//                if (map.containsKey(c)){
//                    map.put(c, map.get(c) + 1);
//                }else {
//                    if (map.size() == k)break;
//                    map.put(c, 1);
//                }
//                j++;
//            }
//
//            res = Math.max(res, j - i);
//            c = s.charAt(i);
//            if (map.containsKey(c)){
//                int cnt = map.get(c);
//                if (cnt > 1){
//                    map.put(c, cnt - 1);
//                }else {
//                    map.remove(c);
//                }
//            }
//        }
//        return res;


//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt(), m = scanner.nextInt(), q = scanner.nextInt();
//        char[][] martix = new char[m][n];
//        scanner.nextLine();
//        for(int i = 0 ; i < n ; i++){
//            String str = scanner.nextLine();
//            for (int j = 0 ; j < m ; j++){
//                martix[i][j] = str.charAt(j);
//            }
//        }
//        int N = 1005;
//        int[][] rec = new int[N][N];
//        while (q --> 0){
//            String[] str1 = scanner.nextLine().split(" ");
//            int x1 = Integer.parseInt(str1[0]);
//            int y1 = Integer.parseInt(str1[1]);
//            int x2 = Integer.parseInt(str1[2]);
//            int y2 = Integer.parseInt(str1[4]);
//            compare(rec, x1, y1, x2, y2);
//        }
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= m; j++){
//                rec[i][j] += rec[i][j-1] + rec[i-1][j] - rec[i-1][j-1];
//                System.out.println(rec[i][j] % 2 == 0 ? martix[i-1][j-1] : change(martix[i-1][j-1]));
//            }
//            System.out.println("\n");
//        }
//    }
//    static char change(char c){
//        if ( c - 'a' >= 0 && c - 'a' < 26){
//            return Character.toUpperCase(c);
//        }else {
//            return Character.toLowerCase(c);
//        }
//    }
//    static void compare(int[][] marx, int x1, int y1, int x2, int y2){
//        marx[x1][y1] += 1;
//        marx[x2 + 1][y1] -= 1;
//        marx[x1][y2 + 1] -= 1;
//        marx[x2 + 1][y2 + 1] +=1;