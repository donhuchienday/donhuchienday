public class Student {
    private String name;
    private  int age;
    static int dem;
    Address address;

    public Student(){
        dem+=1;
    }
    public Student(String name, int age, Address address){
        this.name = name;
        this.age = age;
        dem += 1;
        this.address = new Address(address.getDiaChi(),address.getSoNha());
    }
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setTen(String Name){
        this.name =name;
    }
}
