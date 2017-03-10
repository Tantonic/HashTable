import java.util.*;

public class HashFunction{

    String [] theArray;
    int arraySize;
    int itemsInArray = 0;

    public static void main(String[] args){

        HashFunction theFunc = new HashFunction(30);

        String[] elementsToAdd = {"6","25","3","14","5",};

        theFunc.hashFunction1(elementsToAdd, theFunc.theArray);

        theFunc.displayTheHashTable();

    }

    public void hashFunction1(String[] stringsForArray, String[] theArray){

        for(int n = 0; n <stringsForArray.length; n++){

            String newElementVal = stringsForArray[n];
            theArray[Integer.parseInt(newElementVal)] = newElementVal;
        }

    }

    HashFunction(int size){

        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }

    public void displayTheHashTable() {

        int increment = 0;

        int numberOfRows = (arraySize / 10) + 1;

        for (int m = 0; m < numberOfRows; m++) {
            increment += 10;

                for (int n = 0; n < 71; n++)
                    System.out.print("-");
                System.out.println();

                for (int n = increment - 10; n < increment; n++) {
                    System.out.format("| %3s " + " ", n);
                }

                System.out.println("|");

                for (int n = 0; n < 71; n++)
                    System.out.print("-");
                System.out.println();

                for (int n = increment - 10; n < increment; n++) {

                    if (n >= arraySize)
                        System.out.print("|      ");
                    else if (theArray[n].equals("-1"))
                        System.out.print("|      ");
                    else
                        System.out.print(String.format("| %3s " + " ", theArray[n]));
                        }

                System.out.println("|");

                for (int n = 0; n < 71; n++)
                    System.out.print("-");
                System.out.println();
                    }
                }
}
