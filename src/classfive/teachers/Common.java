package classfive.teachers;

public class Common {
    private Teacher teacher;

    public Common(Teacher teacher) {
        this.teacher = teacher;
    }
    public void judge(){
        this.teacher.judge();
    }
}
