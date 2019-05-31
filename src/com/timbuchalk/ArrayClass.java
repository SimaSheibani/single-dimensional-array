package com.timbuchalk;

public class ArrayClass {

    int [] listArray;

    public ArrayClass (int sizeArray){

        listArray = new int [sizeArray];
    }

    public boolean printArray () {

        for(int i = 0; i < listArray.length; i ++){

            System.out.println("The array is = " + listArray[i]);
            //return true;
        }
        return false;
    }

    public void insertVariable(int index, int variable){

        this.listArray [index] = variable;
        System.out.println("the transaction done" + index + " = " + variable);

    }

    public void returnVariable ( int index){

        System.out.println( listArray [index] ) ;

    }

    public boolean searchVariable ( int search){

        for ( int i = 0; i < listArray.length; i ++){

            if ( listArray[i ] == search){
                System.out.println("data was found.");
                return true;
            }
        }
            System.out.println("data wasn't found");

        return false;
    }

    public void deletValue ( int index, int value){


    }



}
