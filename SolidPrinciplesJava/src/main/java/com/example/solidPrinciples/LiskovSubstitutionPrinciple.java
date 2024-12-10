package com.example.solidPrinciples;

// As per liskov substitution principle, a child class object should be able to replace base class object.
// In the below scenario, child class object Rhombus fails the test written to check area functionality.
// Hence, it is a bad practice to extend the class just for sake of saving few lines.
public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {
        Square sq = new Square();
        Rhombus rect = new Rhombus();

        testArea(sq, 4, 4);
        testArea(rect, 3, 4);

    }
    static void testArea(Square sq, int l, int w) {
        // test to check area functionality
        if (sq.area(l, w) == l * w)
            System.out.println("Test case passed");
        else
            System.out.println("Test case failed");
    }

}

class Square {
    int area(int l, int w) {
        return l * w;
    }
}

class Rhombus extends Square {

    @Override
    int area(int d1, int d2) {
        return (d1 * d2) / 2;
    }
}
