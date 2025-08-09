        //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student studentA = new Student("theanh", 19,new Address("12",88));
        int a = Student.dem;
        System.out.println(Student.dem);

        System.out.println(studentA.getName());

        System.out.println(studentA.address.getDiaChi()+ studentA.address.getSoNha());

        Cage cage1 = new Cage(1);
        cage1.addCage(new Pet("haha", 10, "cho"));
        cage1.addCage(new Pet( "ngao", 49,"cho"));
        cage1.addCage(new Pet("theanh",60, "cho"));

    }

}