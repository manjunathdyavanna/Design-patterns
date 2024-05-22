package leetcode;

import java.util.*;

public class Solution implements Cloneable {
    public boolean circularArrayLoop(int[] nums) {
        int s = 0;
        int f = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("looping for i: " + i);
            s = i;
            f = i;
            k = 0;
            while (k < nums.length) {
                System.out.print("moving index from s: " + s + " with value nums[s]: " + nums[s]);
                s = moveIndex(nums, s);
                System.out.println(" to index s: " + s);
                if (s == -1)
                    break;
                System.out.print("moving index from f: " + f + " with value nums[f]: " + nums[f]);
                f = moveIndex(nums, f);
                System.out.println(" to index f: " + f);
                if (f == -1)
                    break;
                System.out.print("moving index from f: " + f + " with value nums[f]: " + nums[f]);
                f = moveIndex(nums, f);
                System.out.println(" to index f: " + f);
                if (f == -1)
                    break;
                k++;
                if (s == f) {
                    if (k == 1)
                        break;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int moveIndex(int[] nums, int i) {
        boolean p = nums[i] > 0;
        //System.out.println("p is :" + p);
        i = i + nums[i];
        //System.out.println("i after adding :" + i);
        i = (i + nums.length) % nums.length;
        //System.out.println("i after reminder :" + i);
        // System.out.println("p after update :" + (nums[i]>0) + " for num[i]: "+nums[i]);
        if (p != (nums[i] > 0))
            i = -1;
        return i;

    }

    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int pairs = 0;
        int i = 0;
        int j = 1;
        while (j < A.length && A[j] == A[i])
            j += 1;
        while (j < A.length && A[j - 1] == A[j])
            j += 1;
        while (j < A.length) {
            System.out.print("Checking for i:= " + i + " j:= " + j);
            int value = A[j] - A[i];
            System.out.println(" :: " + A[j] + " - " + A[i] + " = " + value);
            if (value > B) {
                i += 1;
                while (i < A.length && A[i - 1] == A[i])
                    i += 1;
            } else if (value < B) {
                j += 1;
                while (j < A.length && A[j - 1] == A[j])
                    j += 1;
            } else {
                pairs += 1;
                i += 1;
                while (i < A.length && A[i - 1] == A[i])
                    i += 1;
                j += 1;
                while (j < A.length && A[j - 1] == A[j])
                    j += 1;
            }

        }
        return pairs;
    }

    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int i = 0;
        while (i < A.size() - 2) {
            int a = A.get(i);
            int j = i + 1;
            int k = A.size() - 1;
            System.out.println("Checking for i:= " + i + " j:= " + j + " k:= " + k);
            while (j < k && k < A.size()) {
                int b = A.get(j);
                int c = A.get(k);
                System.out.println("Checking for i:= " + i + " j:= " + j + " k:= " + k + " || with value A[j]: " + b + " A[k]: " + c + " -A[i]: " + a);
                if ((b + c) > (-a)) {
                    k--;
                } else if ((b + c) < (-a)) {
                    j++;
                } else {
                    ArrayList<Integer> trpls = new ArrayList<>();
                    trpls.add(-a);
                    trpls.add(b);
                    trpls.add(c);
                    res.add(trpls);
                    System.out.println("triplets found for a:= " + (-a) + " b:= " + b + " c:= " + c);
                    while (j < A.size() && A.get(j) == b) j++;
                    while (k < A.size() && A.get(k) == c) k--;
                }
            }
            while (i < A.size() - 2 && A.get(i) == a) i++;
        }
        return res;
    }

    public int[] solve(int[] A, int[][] B) {
        Random rd = new Random();
        HashMap<Integer, Long> map = new HashMap<>();
        HashSet<Long> used = new HashSet<>();
        Long[] psum = new Long[A.length];
        Long rand = rd.nextLong();
        map.put(A[0], rand);
        used.add(rand);
        psum[0] = rand;
        for (int i = 1; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                rand = rd.nextLong();
                while (used.contains(rand)) {
                    rand = rd.nextLong();
                }
                map.put(A[i], rand);
                used.add(rand);
            }
            psum[i] = psum[i - 1] + map.get(A[i]);
        }
        int[] res = new int[B.length + used.size()];
        for (int i = 0; i < B.length; i++) {
            long value1 = psum[B[i][1]] - (B[i][0] == 0 ? 0 : psum[B[i][0]]);
            long value2 = psum[B[i][3]] - (B[i][2] == 0 ? 0 : psum[B[i][2]]);
            res[i] = value1 == value2 ? 1 : 0;
        }
        for (long val : used) {
            System.out.println(val);
        }
        System.out.println("************** END *****************");

        for (long ps : psum) {
            System.out.println(ps);
        }
        System.out.println("************** PS END *****************");
        return res;
    }

    public int[] twiceTw0(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor = xor ^ A[i];
        }
        System.out.println("xor := " + xor);
        int mask = 1;
        System.out.println("While masking");
        while ((xor & 1) == 0) {
            System.out.println("Before masking xor := " + xor + " mask := " + mask);
            xor = xor >> 1;
            mask = mask << 1;
            System.out.println("After masking xor := " + xor + " mask := " + mask);
        }
        System.out.println("After masking");
        System.out.println("mask := " + mask);
        int[] res = new int[2];
        for (int i = 0; i < A.length; i++) {
            if ((A[i] & mask) == 0)
                res[0] = res[0] ^ A[i];
            else
                res[1] = res[1] ^ A[i];
        }
        Arrays.sort(res);
        return res;
    }

    public int[] repeatedNumberA(final int[] A) {
        int xor = 0;
        long sum = 0;
        long sqSum = 0;
        int n = A.length;
        for(int i = 1; i<=n; i++) {
            xor = xor ^ i;
            xor = xor ^ A[i - 1];
            sum += A[i - 1];
            sqSum += Math.pow(A[i - 1], 2);
        }
        System.out.println("sum := "+sum+" sqSum := "+sqSum);
        int[] res = new int[2];
        long actualSum = (n * (n + 1)) / 2;
        long actualSqSum = (n * (n + 1) * ((2 * n) + 1)) / 6;
        long a = actualSqSum - sqSum;
        long b = actualSum - sum;
        long c = a / b;
        res[0]=(int)((c+b)/2);
        res[1]=(int)(res[0]-b);
        return res;
}

    public int[] repeatedNumber(final int[] A) {
        long xor = 0;
        long sum = 0;
        for(int i=1; i<=A.length; i++){
            xor = xor^i;
            xor = xor^A[i-1];
            sum += A[i-1];
        }
        int[] res = new int[2];
        long actualSum = (A.length*(A.length+1))/2;
        //System.out.println("xor := "+xor+" sum:= "+sum+" actualSum:= "+actualSum);
        long b = actualSum - (sum - xor);
        System.out.println("xor := "+xor+" sum:= "+sum+" actualSum:= "+actualSum+" b:= "+b);
        res[0] = (int)xor; res[1] = (int)b;
        return res;
    }
}