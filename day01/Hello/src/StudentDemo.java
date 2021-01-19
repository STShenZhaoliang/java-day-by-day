public class StudentDemo {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println("name:" + st.name + "; age:" + st.age);

        st.name = "qw";
        st.age = 12;
        System.out.println("name:" + st.name + "; age:" + st.age);

        Student s1 = st;
        s1.name = "as";
        s1.age = 123;
        System.out.println("name:" + st.name + "; age:" + st.age);
    }
}
