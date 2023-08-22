public class Main { 
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.searchInsert(new int[] { 1, 3, 5, 6 }, 5));
        System.out.println(sol.searchInsert(new int[] { 1, 3, 5, 6 }, 2));
        System.out.println(sol.searchInsert(new int[] {1, 3, 5, 6}, 7));
    }
}
