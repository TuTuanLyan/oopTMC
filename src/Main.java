//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persion gvTranManhCuong = new Persion();
        gvTranManhCuong.setName("Tran Manh Cuong");
        gvTranManhCuong.setBirthYear(2000);

        Persion htChuDucTrinh = new Persion();
        htChuDucTrinh.setName("Chu Duc Trinh");
        htChuDucTrinh.setBirthYear(1960);

        Student maomao = new Student();
        maomao.setName("Pham Huu Manh");
        maomao.setBirthYear(2006);
        maomao.setID("23020548");

        System.out.println(gvTranManhCuong.getName() + " " + gvTranManhCuong.getBirthYear());
        System.out.println(htChuDucTrinh.getName() + " " + htChuDucTrinh.getBirthYear());
        System.out.println(maomao.getName() + " " + maomao.getBirthYear() + " " + maomao.getID());

    }
}