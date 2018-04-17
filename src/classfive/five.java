package classfive;

public class five {
    public static void main(String[] args) {
        Common javaTeacher = new Common(new JavaTeacher());
        javaTeacher.judge();

        Common pyhonTeacher = new Common(new PythonTeacher());
        pyhonTeacher.judge();
    }
}
