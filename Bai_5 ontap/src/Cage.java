import java.util.ArrayList;

public class Cage {
    private String caseCode;
    ArrayList<Pet>pets;
    private static int currentPetCount;
    static  int totalCages;
    static final int MAX_CAPACITY = 3;
    public Cage(){

    }

    public Cage(String caseCode , ArrayList<Pet>pets ){
        this.caseCode= caseCode;
        this.pets =new ArrayList<>();
        totalCages += 1;
    }
    public void addCage(Pet pet){
        if(currentPetCount < MAX_CAPACITY){
            pets.add(pet);
            currentPetCount += 1;
        }
        else{
            System.out.println("Long khong the chua them");
        }
    }
}
