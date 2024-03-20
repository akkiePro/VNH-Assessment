public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 32, 41, 55, 82};
        int element = 55;
        int position = BSearch(arr, element, 0, arr.length-1);
        if(position == -1)
            System.out.println("not found");
        else
            System.out.println("element is at position = " + (position + 1));
    }

    private static int BSearch(int[] arr, int element, int i, int j) {
        if(j >= 1) {
            int mid = i + (j-i) / 2;
            if(arr[mid] == element)
                return mid;
            if(element > arr[mid])
                return BSearch(arr, element, mid+1, j);
            return BSearch(arr, element, i, mid-1);
        }
        return -1;
    }
}
