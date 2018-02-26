public class Deputat extends Human{
    public String surname;
    public String name;
    public int age;
    public boolean habarnuk;
    public int habar;

    public Deputat() {
    }

    public Deputat(int weight, int height) {
        super(weight, height);
    }

    public Deputat(String surname, String name, int age, boolean habarnuk, int habar) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.habarnuk = habarnuk;
        this.habar = habar;
    }

    public Deputat(int weight, int height, String surname, String name, int age, boolean habarnuk, int habar) {
        super(weight, height);
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.habarnuk = habarnuk;
        this.habar = habar;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHabarnuk() {
        return habarnuk;
    }

    public void setHabarnuk(boolean habarnuk) {
        this.habarnuk = habarnuk;
    }

    public int getHabar() {
        return habar;
    }

    public void setHabar(int habar) {
        this.habar = habar;
    }

    @Override
    public String toString() {
        return "Deputat{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", habarnuk=" + habarnuk +
                ", habar=" + habar +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public void chekDep(){
        if (habarnuk==false && habar<5000)
            System.out.println("Deputat vidmovuvsya");
        else if (habarnuk== false && habar>5000)
            System.out.println("Deputat dymae");
        else System.out.println("Davai bablo");
    }


}
