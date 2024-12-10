package com.example.solidPrinciples;

// in the below example, as the number of devices will grow the implementation of copy method will change.
// Hence, we should create separate abstract class and let each device implement its copy method in it.
// This is called dependency inversion principle. We should not depend on concrete classes but interfaces or abstract classes.
public class DependencyInversionPrinciple {

    void copy(Devices d) {
        if (d == Devices.Printer) {
            writePrinter();
        } else {
            writeDisk();
        }
    }

    private void writeDisk() {
    }

    private void writePrinter() {
    }
}

enum Devices {
    Printer,
    Disk
}
