public class PlusOne {
    public static void main(String[] args) {
        new PlusOne();
    }

    public PlusOne() {
        int[] arr = new int[]{9, 9, 9};
        int[] arr1 = plusOne(arr);
        int arrLen = arr1.length;
        for (int i = 0; i < arrLen; i++) {
            System.out.println(arr1[i]);
        }
    }

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int index = len - 1;

        for (int i = index; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] arr = new int[len + 1];
        arr[0] = 1;
        return arr;
    }
}
