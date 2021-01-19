public class MethodDemo {
    public static void main(String[] args) {
        int max = getMax(12, 45);
        System.out.println(max);

        int[] arr = {10, 20, 30};
        syso("之前：" + arr[1]);
        change(arr);
        syso("之后：" + arr[1]);
    }

    public static int getMax(int a, int b){
        if (a>b){
            return a;
        }else
            return b;
    }

    public static void fn(int a){

    }

    // 报错，形参相同，返回类型不同
//    public static int fn(int b){
//        return b;
//    }

    public static void fn(int a, int b){

    }

    public static void fn(double c){

    }

    public static  void change(int[] arr){
        arr[1] = 200;
    }

    public static void syso(String str){
        System.out.println(str);
    }
}
