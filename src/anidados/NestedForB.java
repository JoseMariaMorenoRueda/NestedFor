package anidados;

public class NestedForB {
    public static void printPatternM(int size) {
        System.out.println("Model M");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void printPatternN(int size) {
        System.out.println("Model N");
        int counter = size;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < counter; k++) {
                System.out.print(k + 1 +" ");
            }
            counter--;
            System.out.println();
        }
    }

    public static void printPatternO(int size) {
        System.out.println("Model O");
        int counter = size -1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print("  ");
            }
            int counter2 = i + 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(counter2 + " ");
                counter2--;
            }
            counter--;
            System.out.println();
        }
    }

    public static void printPatternP(int size) {
        System.out.println("Model P");
        for (int i = size - 1; i >= 0; i--) {
            int counter = i + 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(counter + " ");
                counter--;
            }
            System.out.println();
        }
    }

    public static void printPatternQ(int size) {
        System.out.println("Model Q");
        int counter = size -1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(k + 1 + " ");
            }
            int counter2 = i;
            for (int l = 1; l <= i; l++) {
                System.out.print(counter2 + " ");
                counter2--;
            }
            counter--;
            System.out.println();
        }
    }

    public static void printPatternR(int size) {
        System.out.println("Model R");
        int counter = size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < counter; k++) {
                System.out.print(k + 1 + " ");
            }
            int counter2 = counter - 1;
            for (int l = 2; l <= counter; l ++) {
                System.out.print(counter2 + " ");
                counter2--;
            }
            counter--;
            System.out.println();
        }
    }

    public static void printPatternS(int size) {
        System.out.println("Model S");
        int counter = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                if (j != 7) {
                    System.out.print(j + 1 + " ");
                }
            }
            for (int j = 0; j < counter; j++) {
                if (j != counter - 1) {
                    System.out.print("  ");
                }
            }
            for (int k = 0; k < counter; k++) {
                System.out.print("  ");
            }
            int counter2 = i + 1;
            for (int l = 0; l <= i; l++) {
                System.out.print(counter2 + " ");
                counter2--;
            }
            counter--;
            System.out.println();
        }
    }

    public static void printPatternT(int size) {
        System.out.println("Model T");
        int counter = size - 1;
        int counter2 = 0;
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (j != 7) {
                    System.out.print(j + 1 + " ");
                }
            }
            for (int k = 0; k < counter2; k++) {
                if (k != counter2 -1) {
                    System.out.print("  ");
                }
            }
            for (int l = 0; l < counter2; l++) {
                System.out.print("  ");
            }
            for (int m = counter; m >= 0; m--) {
                System.out.print(m + 1 +" ");
            }
            counter--;
            counter2++;
            System.out.println();
        }
    }

    public static void printPatternU(int size) {
        System.out.println("Model U");
        int counter1 = size -1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < counter1; j++) {
                System.out.print("  ");
            }
            int counter2 = i + 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(counter2+ " ");
                if (counter2 > 8) {
                    counter2 = 0;
                } else {
                    counter2++;
                }
            }
            int counter3 = i * 2;
            for (int l = 1; l <= i; l++) {
                if (counter3 == 10) {
                    System.out.print(0 + " ");
                } else {
                    if (counter3 == 11) {
                        System.out.print(1 + " ");
                    } else {
                        if (counter3 == 12) {
                            System.out.print(2 + " ");
                        } else {
                            if (counter3 == 13) {
                                System.out.print(3 + " ");
                            } else {
                                if (counter3 == 14) {
                                    System.out.print(4 + " ");
                                } else {
                                    System.out.print(counter3 + " ");
                                }
                            }
                        }
                    }
                }
                counter3--;
            }
            counter1--;
            System.out.println();
        }
    }

    public static void main(String[] argv) {
        printPatternM(8);
        printPatternN(8);
        printPatternO(8);
        printPatternP(8);
        printPatternQ(8);
        printPatternR(8);
        printPatternS(8);
        printPatternT(8);
        printPatternU(8);
    }
}


