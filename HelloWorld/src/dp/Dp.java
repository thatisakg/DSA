package dp;
public class Dp {
    public static void main(String[] args) {
        // long startTime = System.currentTimeMillis();
        // int n = 5;
        // int[] strg = new int[n + 1];
        // System.out.println(fibBtr(n,strg));
        // long endTime = System.currentTimeMillis();

        // long timeElapsed = endTime - startTime;
        // System.out.println(timeElapsed);
        // System.out.println(climbDown(n));
        // System.out.println(climbDownMem(n, strg));
        // System.out.println(climbDownTabulation(n));
        // System.out.println(countMazePath(2,2));
        // System.out.println(countMazePath2(2,2));

        // int[][] mine = {{10, 33, 13, 15},
        // {22, 21, 04, 1},
        // {5, 0, 2, 3},
        // {0, 6, 14, 2}};
        // System.out.println(goldMine(mine));

        // int[] arr = {3,2,0,2,3,1,0,1,2,0,1};
        // System.out.println(minJumps(arr));
        // int[] ans = { 10, 22, 9, 33, 21, 50, 40, 60, 80 };
        // System.out.println(LIS(ans));
        // int[] arr = { 0, 3, 5, 6, 15, 10, 25, 12, 24 };
        // System.out.println(rodCutting(arr));
        // int[] arr = { 2, 3, 1, 5, 6 };
        // System.out.println(TargetSumSubset(arr, 20));
        // int[] arr = { 2, 3, 5 };
        // System.out.println(coinChangePermutation(arr, 7));
        // System.out.println(coinChangeCombination(arr,7));
        // int[] arr = { 2, 1, 2, 2 };
        // maxSumNoAdjacentElement(arr);
        // String str1 = "AGGTAB";
        // String str2 = "GXTXAYB";
        // Lcs(str1,str2);
        // longestPalindromicSubstring("Geeks");
        // minCutPalindrome("abccbc");
        int eggs = 2;
        int floors = 100;
        System.out.println(eggDrop(eggs,floors,new int[eggs+1][floors+1]));
    }

    public static int fib(int n) {

        if (n == 1 || n == 2) {
            return n - 1;
        }
        int fbn1 = fib(n - 1);
        int fbn2 = fib(n - 2);

        int fibn = fbn1 + fbn2;
        return fibn;
    }

    public static int fibBtr(int n, int strg[]) {

        if (n == 1 || n == 2) {
            return n - 1;
        }

        if (strg[n] != 0) {
            return strg[n];
        }
        int fbn1 = fibBtr(n - 1, strg);
        int fbn2 = fibBtr(n - 2, strg);

        int fibn = fbn1 + fbn2;
        strg[n] = fibn;
        return fibn;
    }

    public static int climbDown(int n) {
        if (n < 0) {
            return 0;
        }

        if (n == 1 || n == 0) {
            return 1;
        }
        return climbDown(n - 1) + climbDown(n - 2) + climbDown(n - 3);
    }

    public static int climbDownMem(int n, int[] strg) {
        if (n < 0) {
            return 0;
        }

        if (n == 1 || n == 0) {
            return 1;
        }

        if (strg[n] != 0) {
            return strg[n];
        }
        return strg[n] = climbDownMem(n - 1, strg) + climbDownMem(n - 2, strg) + climbDownMem(n - 3, strg);
    }

    public static int climbDownTabulation(int n) {
        int[] strg = new int[n + 1];

        strg[0] = 1;
        strg[1] = 1;
        strg[2] = 2;
        for (int i = 3; i <= n; i++) {
            strg[i] = strg[i - 1] + strg[i - 2] + strg[i - 3];
        }

        return strg[n];
    }

    public static int countMazePath(int dr, int dc) {
        int[][] strg = new int[dr + 1][dc + 1];
        for (int i = dr; i >= 0; i--) {
            for (int j = dc; j >= 0; j--) {
                if (i == dr && j == dc) {
                    strg[dr][dc] = 1;
                } else if (i == dr) {
                    strg[i][j] = strg[i][j + 1];
                } else if (j == dc) {
                    strg[i][j] = strg[i + 1][j];
                } else {
                    strg[i][j] = strg[i + 1][j] + strg[i][j + 1];
                }
            }
        }

        return strg[0][0];
    }

    public static int countMazePath2(int dr, int dc) {
        int[][] strg = new int[dr + 1][dc + 1];
        for (int i = 0; i <= dr; i++) {
            for (int j = 0; j <= dc; j++) {
                if (i == 0 && j == 0) {
                    strg[0][0] = 1;
                } else if (i == 0) {
                    strg[i][j] = strg[i][j - 1];
                } else if (j == 0) {
                    strg[i][j] = strg[i - 1][j];
                } else {
                    strg[i][j] = strg[i - 1][j] + strg[i][j - 1];
                }
            }
        }

        return strg[dr][dc];
    }

    public static int goldMine(int[][] gold) {
        int rowMax = gold.length - 1;
        int colMax = gold[0].length - 1;
        int[][] costs = new int[rowMax + 1][colMax + 1];

        for (int i = 0; i <= rowMax; i++) {
            costs[i][colMax] = gold[i][colMax];
        }

        for (int j = colMax - 1; j >= 0; j--) {
            for (int i = 0; i <= rowMax; i++) {
                if (i == 0) {
                    int max = Math.max(costs[i + 1][j + 1], costs[i][j + 1]);
                    costs[i][j] = gold[i][j] + max;
                } else if (i == rowMax) {
                    int max = Math.max(costs[i - 1][j + 1], costs[i][j + 1]);
                    costs[i][j] = gold[i][j] + max;
                } else {
                    int max = Math.max(costs[i + 1][j + 1], Math.max(costs[i - 1][j + 1], costs[i][j + 1]));
                    costs[i][j] = gold[i][j] + max;
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <= rowMax; i++) {
            if (costs[i][0] > ans) {
                ans = costs[i][0];
            }
        }

        return ans;
    }

    public static int minJumps(int[] arr) {
        int[] jumps = new int[arr.length];
        jumps[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (arr[j] >= i - j) {
                    min = Math.min(min, jumps[j] + 1);
                }
            }
            jumps[i] = min;
        }

        return jumps[jumps.length - 1];

    }

    public static int LIS(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = 1;
        for (int i = 1; i < res.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    max = Math.max(res[j], max);
                }
            }

            res[i] = max + 1;
        }

        int ans = Integer.MIN_VALUE;
        for (int val : res) {
            ans = Math.max(val, ans);
        }

        System.out.println(ans);
        return ans;
    }

    public static int rodCutting(int[] rod) {
        int[] strg = new int[rod.length];

        strg[0] = rod[0];
        strg[1] = rod[1];

        for (int i = 2; i < rod.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 1, c = i - 1; j <= c; j++, c--) {
                max = Math.max(max, strg[j] + strg[c]);
            }

            if (rod[i] > max) {
                max = rod[i];
            }

            strg[i] = max;
        }

        return strg[strg.length - 1];
    }

    public static boolean TargetSumSubset(int[] arr, int target) {
        boolean[][] strg = new boolean[arr.length + 1][target + 1];
        for (int i = 0; i < strg.length; i++) {
            for (int j = 0; j < strg[0].length; j++) {
                if (i == 0 && j == 0) {
                    strg[i][j] = true;
                } else if (i == 0) {
                    strg[i][j] = false;
                } else if (j == 0) {
                    strg[i][j] = true;
                } else {
                    if (strg[i - 1][j]) {
                        strg[i][j] = true;
                    } else {
                        if (j - arr[i - 1] >= 0) {
                            strg[i][j] = strg[i - 1][j - arr[i - 1]];
                        }
                    }
                }
            }
        }

        return strg[strg.length - 1][strg[0].length - 1];
    }

    public static int coinChangePermutation(int[] arr, int target) {
        int[] strg = new int[target + 1];

        strg[0] = 1;
        for (int i = 0; i < strg.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i - arr[j] >= 0) {
                    strg[i] += strg[i - arr[j]];
                }
            }
        }

        return strg[strg.length - 1];
    }

    public static int coinChangeCombination(int[] arr, int target) {
        int[] strg = new int[target + 1];

        strg[0] = 1;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < strg.length; i++) {
                if (i - arr[j] >= 0) {
                    strg[i] += strg[i - arr[j]];
                }
            }
        }

        return strg[strg.length - 1];
    }

    public static void maxSumNoAdjacentElement(int[] arr) {
        int exclude = 0;
        int include = arr[0];

        for (int j = 1; j < arr.length; j++) {
            int temp = Math.max(include, exclude);
            include = exclude + arr[j];
            exclude = temp;
        }

        System.out.println(Math.max(include, exclude));
    }

    public static void Lcs(String first, String second) {
        int[][] strg = new int[first.length() + 1][second.length() + 1];

        for (int i = 0; i < strg.length; i++) {
            for (int j = 0; j < strg[0].length; j++) {
                if (i == 0) {
                    strg[i][j] = 0;
                } else if (j == 0) {
                    strg[i][j] = 0;
                } else {
                    if (first.charAt(i - 1) == second.charAt(j - 1)) {
                        strg[i][j] = strg[i - 1][j - 1] + 1;
                    } else {
                        strg[i][j] = Math.max(strg[i - 1][j], strg[i][j - 1]);
                    }
                }
            }
        }

        System.out.println(strg[strg.length - 1][strg[0].length - 1]);
    }

    public static boolean[][] longestPalindromicSubstring(String str) {
        boolean[][] strg = new boolean[str.length()][str.length()];

        int longestPalinSubstrLen = 0;

        for (int gap = 0; gap < str.length(); gap++) {
            for (int i = 0, j = gap; j < str.length(); i++, j++) {
                if (gap == 0) {
                    strg[i][j] = true;
                    longestPalinSubstrLen = 1;
                } else if (gap == 1) {
                    if (str.charAt(i) == str.charAt(j)) {
                        strg[i][j] = true;
                        longestPalinSubstrLen = 2;
                    }
                } else {
                    if (str.charAt(i) == str.charAt(j)) {
                        strg[i][j] = strg[i + 1][j - 1];
                        if (strg[i + 1][j - 1] == true) {
                            longestPalinSubstrLen = j - i + 1;
                        }

                    }
                }
            }
        }
        System.out.println(longestPalinSubstrLen);
        return strg;
    }

    public static void minCutPalindrome(String str) {
        int[][] strg = new int[str.length()][str.length()];

        // boolean[][] isPalin = longestPalindromicSubstring(str);
        for (int gap = 0; gap < str.length(); gap++) {
            for (int i = 0, j = gap; j < str.length(); j++, i++) {
                if (gap == 0) {
                    strg[i][j] = 0;
                } else if (gap == 1) {
                    if (str.charAt(i) == str.charAt(j)) {
                        strg[i][j] = 0;
                    } else {
                        strg[i][j] = 1;
                    }
                } else {
                    if (str.charAt(i) == str.charAt(j) && strg[i + 1][j - 1] == 0) {
                        strg[i][j] = 0;
                    } else {
                        int min = Integer.MAX_VALUE;
                        for (int idash = i + 1, jdash = j - gap; jdash < j; idash++, jdash++) {
                            min = Math.min(min, strg[i][jdash] + strg[idash][j] + 1);
                        }

                        strg[i][j] = min;
                    }
                }
            }
        }
        System.out.println(strg[0][strg.length - 1]);
    }

    public static int eggDrop(int e, int f, int[][] strg) {
        if (f == 1) {
            return 1;
        }

        if (e == 1) {
            return f;
        }

        if (f == 0) {
            return 0;
        }

        if (strg[e][f] != 0) {
            return strg[e][f];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= f; i++) {
            min = Math.min(min, Math.max(eggDrop(e - 1, i - 1, strg), eggDrop(e, f - i, strg)));
        }

        return strg[e][f] = min + 1;
    }
}