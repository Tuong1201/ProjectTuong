package ProjectTuong;

class FreshJuice {

    enum FreshJuiceSize {
        SMALL, MEDIUM, LARGE
    }

    FreshJuiceSize size;
}

public class FreshJuiceTest {

    public static void main(String args[]) {
        System.out.println("Hello mấy cưng");
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Size: " + juice.size);
        System.out.println("Kết thúc bài tập");
        System.out.println("ik");
    }
}