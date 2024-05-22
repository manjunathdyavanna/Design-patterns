package org.example;

import design.patterns.builder.Student;
import leetcode.Solution;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int maximumGap(final int[] A) {
        int n = A.length;
        int rmax[] = new int[n];
        int i, j, max = -1;
        // rmax stores the maximum element in the suffix
        for(i = n - 1; i >= 0; i--) {
            rmax[i] = (i == n - 1 || A[i] > rmax[i + 1])? A[i] : rmax[i + 1];
        }
        System.out.print("[");
        for(int k=0; k<A.length; k++){
            System.out.print(rmax[k]+" ");
        }
        System.out.println("]");
        for(i = 0, j = 0; i < n && j < n; ){
            if(A[i] <= rmax[j]){
                if(j - i > max)
                    max = j - i;
                j++;
            } else {
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        //Student s = Student.builder().age(15).build();
        /*int[] A = new int[3];
        A[0] = -2; A[1] = -3; A[2] = -9;// A[3] = 2; A[4] = 2; A[5]= 4; A[6]=7;
        Solution s = new Solution();
        boolean res = s.circularArrayLoop(A);
        System.out.println(res);*/

        /*int[] A = {1,7,11,8,11,7,1};
        int[][] B = {{0,2,4,6}};
        Solution s = new Solution();
        int[] res = s.solve(A, B);
        for(int i : res)
            System.out.println(i);*/

        /*int[] arr = {-5, -4, -4, -3, -2, -1, -1, -1, 0, 0, 0, 1, 1, 1, 3, 4, 4, 5};
        ArrayList<Integer> A = new ArrayList<>();
        for(int i:arr)
            A.add(i);
        Solution s = new Solution();
        ArrayList<java.util.ArrayList<java.lang.Integer>> res = s.threeSum(A);
        for(ArrayList<Integer> i: res){
            System.out.print("[");
            for(int e:i){
                System.out.print(" "+e+" ");
            }
            System.out.println("]");
        }
        System.out.println("");*/
        /*int[] A = {408,478,74,624,74,204,705,624,337,408,478,204};
        int[] A = {186,256,102,377,186,377};
        int[] B = new Solution().twiceTw0(A);
        for(int e:B)
            System.out.println(e);*/
        int[] A = {389,299,65,518,361,103,342,406,24,79,192,181,178,205,38,298,218,143,446,324,82,41,312,166,252,59,91,6,248,395,157,332,352,57,106,246,506,261,16,470,224,228,286,121,193,241,203,36,264,234,386,471,225,466,81,58,253,468,31,197,15,282,334,171,358,209,213,158,355,243,75,411,43,485,291,270,25,100,194,476,70,402,403,109,322,421,313,239,327,238,257,433,254,328,163,436,520,437,392,199,63,482,222,500,454,84,265,508,416,141,447,258,384,138,47,156,172,319,137,62,85,154,97,18,360,244,272,93,263,262,266,290,369,357,176,317,383,333,204,56,521,502,326,353,469,455,190,393,453,314,480,189,77,129,439,139,441,443,351,528,182,101,501,425,126,231,445,155,432,418,95,375,376,60,271,74,11,419,488,486,54,460,321,341,174,408,131,115,107,134,448,532,292,289,320,14,323,61,481,371,151,385,325,472,44,335,431,187,51,88,105,145,215,122,162,458,52,496,277,362,374,26,211,452,130,346,10,315,459,92,531,467,309,34,281,478,477,136,519,196,240,12,288,302,119,356,503,527,22,27,55,343,490,127,444,308,354,278,497,191,294,117,1,396,125,148,285,509,208,382,297,405,245,5,330,311,133,274,275,118,463,504,39,99,442,337,169,140,104,373,221,499,413,124,510,159,465,80,276,83,329,524,255,387,259,397,491,517,23,4,230,48,349,412,142,114,487,381,164,35,67,498,73,440,108,226,96,132,144,207,235,33,69,128,236,364,198,475,173,493,150,90,515,111,68,232,340,112,526,492,512,495,429,146,336,17,350,251,7,184,76,380,359,293,19,49,345,227,212,430,89,474,279,201,398,347,273,37,185,177,102,304,295,422,94,426,514,116,183,180,494,42,305,152,390,30,247,451,32,388,331,78,424,368,394,188,306,449,8,214,120,179,280,511,409,338,153,507,370,461,217,161,483,147,242,86,417,268,71,462,420,167,513,379,307,522,435,113,296,457,525,45,529,423,427,2,438,64,316,46,40,13,516,367,233,110,318,250,283,216,186,310,237,377,365,175,479,378,66,414,473,165,210,50,348,372,363,339,20,168,284,415,505,206,53,223,434,202,123,399,400,135,269,428,219,456,28,464,267,489,98,391,195,366,300,484,533,229,213,149,160,256,303,530,301,29,404,344,401,220,287,9,407,170,450,523,249,72,410,3,21,200,260};
        int[] B = new Solution().repeatedNumber(A);
        for(int e:B)
            System.out.println(e);

    }

    public static void mainB(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        int[] A = new int[5];
        A[0]=5;
        A[1]=-2;
        A[2]=3;
        A[3]=1;
        A[4]=2;
        int B = 3;

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int i=0;
        for(; i<B; i++)
            sum += A[i];
        if(maxSum<sum){
            maxSum = sum;
        }
        i=B-1;
        int j=A.length-1;
        while(i>=0){
            sum -= A[i];
            sum += A[j];
            i--; j--;
            if(maxSum<sum)
                maxSum = sum;
            System.out.println("for i: "+i+" j:"+j+"  sum:"+sum+"  maxSum:"+maxSum);
        }
    }
}