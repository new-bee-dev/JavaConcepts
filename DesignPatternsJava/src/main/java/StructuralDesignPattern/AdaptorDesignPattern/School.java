package StructuralDesignPattern.AdaptorDesignPattern;

public class School {
    public static void main(String[] args) {
        AssignmentWork aw = new AssignmentWork();
        Pen p = new PenAdaptor();
        aw.setP(p);
        aw.writeAssignment("Complete assignment");
    }
}
