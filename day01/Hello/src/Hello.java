public class Hello {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);
        for (var item:arr) {
            System.out.println(item);
        }

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println("-----------------");
        System.out.println(arr);
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        int[] arr2 = arr;
        arr2[0] = 111;
        arr2[1] = 222;
        arr2[2] = 333;

        System.out.println("-----------------");
        System.out.println(arr);
        for (var item:arr) {
            System.out.println(item);
        }

        for (int i = 0; i < arr.length; i++) {

        }
    }
}
