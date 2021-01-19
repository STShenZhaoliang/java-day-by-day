import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    private static ArrayList arrStu = new ArrayList();

    public static void main(String[] args) {

        Boolean flag = true;
        while (flag) {
            sop("---- 欢迎来到学生管理系统 ----");
            sop("1.添加学生");
            sop("2.删除学生");
            sop("3.修改学生");
            sop("4.查看所有学生");
            sop("5.退出");

            Scanner sn = new Scanner(System.in);
            if (!sn.hasNextInt()){
                sop("输入错误，请重新输入");
                continue;
            }
            int num = sn.nextInt();
            switch (num){
                case 1:addStu();break;
                case 2:deleteStu();break;
                case 3:changeStu();break;
                case 4:printStu();break;
                case 5:flag = logout();break;
            }
            sop("num = " + num);
        }
    }
    public static void sop(String str){
        System.out.println(str);
    }

    // 添加学生
    public static void addStu(){
        while (true) {
            Scanner sn = new Scanner(System.in);
            Student st = new Student();

            sop("请输入姓名");
            if (!sn.hasNext()){
                sop("输入错误，请重新输入");
                continue;
            }else{
                st.name = sn.next();
            }

            sop("请输入年龄");
            if (!sn.hasNextInt()){
                sop("输入错误，请重新输入");
                continue;
            }else{
                st.age = sn.nextInt();
                arrStu.add(st);
                sop("添加完成");
                break;
            }
        }
    }

    // 删除学生
    public static void deleteStu(){
        while (true) {
            sop("共" + arrStu.size() +"个, 请选择合适位置删除");

            Scanner sn = new Scanner(System.in);
            if (!sn.hasNextInt()){
                sop("输入错误，请重新输入");
                continue;
            }else{
                int num = sn.nextInt();
                if (num >= arrStu.size()){
                    sop("输入数超过最大数量，请重新输入");
                    continue;
                }else {
                    arrStu.remove(num);
                    sop("删除完成");
                    break;
                }
            }
        }
    }

    // 修改学生
    public static void changeStu(){
        while (true) {
            sop("共" + arrStu.size() +"个, 请选择合适位置修改");

            Scanner sn = new Scanner(System.in);
            if (!sn.hasNextInt()){
                sop("输入错误，请重新输入");
                continue;
            }else{
                int num = sn.nextInt();
                if (num >= arrStu.size()){
                    sop("输入数超过最大数量，请重新输入");
                    continue;
                }else {
                    Student st = (Student) arrStu.get(num);
                    while (true) {
                        sop("请输入新姓名");
                        if (!sn.hasNext()){
                            sop("输入错误，请重新输入");
                            continue;
                        }else{
                            st.name = sn.next();
                        }

                        sop("请输入新年龄");
                        if (!sn.hasNextInt()){
                            sop("输入错误，请重新输入");
                            continue;
                        }else{
                            st.age = sn.nextInt();
                            sop("修改完成");
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    // 查看所有学生
    public static void printStu(){
        for (Object st: arrStu
             ) {
            System.out.println(st);
        }
    }

    // 退出
    public static boolean logout(){
        return false;
    }
}
