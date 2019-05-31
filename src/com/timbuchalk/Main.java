package com.timbuchalk;

public class Main {

    public static void main(String[] args) {
	ArrayClass arrayClass = new ArrayClass(5);

        System.out.println("printing the array list; ");

        arrayClass.printArray();

        arrayClass.insertVariable(0,6);
        arrayClass.insertVariable(1,68);
        arrayClass.insertVariable(2,95);
        arrayClass.insertVariable(3,34);
        arrayClass.insertVariable(4,66);
        arrayClass.printArray();

        arrayClass.returnVariable(3);

        arrayClass.searchVariable(66);


    }
}
