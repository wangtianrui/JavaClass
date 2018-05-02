package classfive;

import classfive.factory.Person;
import classfive.factory.PersonMaker;
import classfive.teachers.Common;
import classfive.teachers.JavaTeacher;
import classfive.teachers.PythonTeacher;

public class five {
    public static void main(String[] args) {
        Common javaTeacher = new Common(new JavaTeacher());
        javaTeacher.judge();

        Common pyhonTeacher = new Common(new PythonTeacher());
        pyhonTeacher.judge();

        Person mBoy = PersonMaker.newInstance(PersonMaker.BOYINDEX);
        mBoy.showMe();
        Person mGirl = PersonMaker.newInstance(PersonMaker.GIRLINDEX);
        mGirl.showMe();

        System.out.println("hahah".equals("hahah"));
    }
}
