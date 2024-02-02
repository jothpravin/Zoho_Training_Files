import java.util.*;

class Family {
    int age;
    String name;

    Family(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " " + name;
    }
}

class FamilyComparator implements Comparator<Family> {
    public int compare(Family i, Family j) {
        if (i.age > j.age) {
            return 1;
        } else if (i.age < j.age) {
            return -1;
        } else {
            return 0;
        }
    }
}

class FamilyNameComparator implements Comparator<Family> {
    public int compare(Family i, Family j) {
        if (i.name.length() < j.name.length()) {
            return 1;
        } else if (i.name.length() > j.name.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Comparators {
    public static void main(String[] args) {
        List<Family> l = new ArrayList<>();
        l.add(new Family(22, "Pravin"));
        l.add(new Family(21, "Jai"));
        l.add(new Family(2, "Mubabi"));
        l.add(new Family(1, "Noor"));

        Comparator<Family> com = new FamilyComparator();
        Comparator<Family> com1 = new FamilyNameComparator(); // Use the class that implements Comparator

        Collections.sort(l, com1);

        for (Family f : l) {
            System.out.println(f);
        }
    }
}

