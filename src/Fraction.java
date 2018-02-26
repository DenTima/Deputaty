import java.util.*;

public class Fraction {
    public static ArrayList<Deputat> deputats = new ArrayList();

    public Fraction() {
    }

    public Fraction(ArrayList deputats) {
        this.deputats = deputats;
    }

    public ArrayList getDeputats() {
        return deputats;
    }

    public void setDeputats(ArrayList deputats) {
        this.deputats = deputats;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "deputats=" + deputats +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }



    public static void addDep(){
        Deputat dep = new Deputat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        dep.name=scanner.next();
        System.out.println("Enter surname");
        dep.surname=scanner.next();
        System.out.println("Enter your age");
        dep.age=scanner.nextInt();
        System.out.println("Is this deputat habarnuk?");
        dep.habarnuk=scanner.nextBoolean();
        System.out.println("Enter value of habar");
        dep.habar=scanner.nextInt();
        System.out.println("Enter weight");
        dep.weight=scanner.nextInt();
        System.out.println("Enter height");
        dep.height=scanner.nextInt();
        deputats.add(dep);
        System.out.println("The deputy has been added");
    }

    public static void delDep (){
        System.out.println("Delete deputat. Enter the name:");
        Scanner scanner = new Scanner(System.in);
        String deleteName = scanner.next();
        Iterator iterator = deputats.iterator();
        while (iterator.hasNext()){
            Deputat deputat = (Deputat) iterator.next();
            if (deputat.name.equals(deleteName))
                iterator.remove();
        }
    }

    public static void delNegidnuk (){
        Iterator iterator = deputats.iterator();
        while (iterator.hasNext()){
            Deputat deputat = (Deputat) iterator.next();
            if (Objects.equals(deputat.habarnuk, true)) {
                iterator.remove();
            }
        }
    }

    public static void theBestHabar () {
        Iterator iterator = deputats.iterator();
        while (iterator.hasNext()) {
            Deputat deputat = (Deputat) iterator.next();

           }
        }

    public static void soutAll(){
        System.out.println(deputats);
    }

    public static void delAll (){
        Iterator iterator = deputats.iterator();
        while (iterator.hasNext()){
            Deputat deputat = (Deputat) iterator.next();
            iterator.remove();
        }
    }

    public static void sumOfhabar(){
        Iterator iterator = deputats.iterator();
        int sum=0;
        while (iterator.hasNext()){
            Deputat deputat = (Deputat) iterator.next();
            sum+=deputat.habar;
        }
        System.out.println(sum);
    }

}
