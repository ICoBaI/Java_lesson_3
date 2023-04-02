public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 99);   
        }

        printArray("Данн массив:", arr);
        arr = deleteEvenElement(arr);
        printArrayf("Результат:", arr);
    }

    public static void printArray(String text, int[] arr) {
        System.out.print(text + " [");
        for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    public static void printArrayf(String text, int[] arr) {
        System.out.print(text + " [");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]%2 != 0) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    public static int[] deleteEvenElement(int[] arr) {
        int[] result = new int[arr.length];
        int i;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]%2 != 0){
                result[i] = arr[i];
            }
        }
        return result;
    }
}