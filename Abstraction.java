
class A {
    public static void main(String[] args) {
        Election person1 = new Bjp();
        person1.vote();
    }
}

abstract class Election {
    abstract void vote();
}

class Bjp extends Election {
    void vote() {
        System.out.println("My vote is for BJP");
    }
}

class INC extends Election {
    void vote() {
        System.out.println("My vote is for INC");
    }
}
