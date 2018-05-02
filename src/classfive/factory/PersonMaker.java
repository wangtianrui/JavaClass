package classfive.factory;

public class PersonMaker {
    public static int BOYINDEX = 0;
    public static int GIRLINDEX = 1;

    private PersonMaker() {

    }

    public static Person newInstance(int index) {
        switch (index) {
            case 0:
                return new Boy();
               // break;
            case 1:
                return new Girl();
               // break;
            default:
                System.out.println("请输入正确的编号，0是boy，1是girl");
                return null;
        }
    }
}
