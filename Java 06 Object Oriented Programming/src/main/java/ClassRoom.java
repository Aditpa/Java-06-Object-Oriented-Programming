public class ClassRoom {

    public static void main(String[] args) {
    Wilder student = new Wilder("Adit");
    Wilder student2 = new Wilder("Adi");
    Wilder student3 = new Wilder("Alberto");
    Wilder student4 = new Wilder("Kim");
        System.out.println(student.whoAmI(true));
        System.out.println(student2.whoAmI(false));
        System.out.println(student3.whoAmI(true));
        System.out.println(student4.whoAmI(false));

    }

}
