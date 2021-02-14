package anidados;

public class NestedForA {
    public static void printPatternA(int size) {
        System.out.println("Model A");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void printPatternB(int size) {
        System.out.println("Model B");
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void printPatternC(int size) {
        System.out.println("Model C");
        int counter = size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < counter; k++) {
                System.out.print("# ");
            }
            counter--;
            System.out.println();
        }
    }

    public static void printPatternD(int size) {
        System.out.println("Model D");
        int counter = size -1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("# ");
            }
            counter--;
            System.out.println();
        }
    }

    public static void printPatternE(int size) {
        System.out.println("Model E");
        for (int j = 0; j < size; j++) {
            System.out.print("# ");
                for (int k = 0; k < size - 2; k++) {
                    if (j == 0 || j == size -1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            System.out.print("# ");
            System.out.println();
        }
    }

    public static void printPatternF(int size) {
        System.out.println("Model F");
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                if (j == 0 || j == size -1) {
                    System.out.print("# ");
                } else {
                    if (j == k) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void printPatternG(int size) {
        System.out.println("Model G");
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                if (j == 0 || j == size -1) {
                    System.out.print("# ");
                } else {
                    if (j == size - (k + 1)) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void printPatternH(int size) {
        System.out.println("Model H");
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                if (j == 0 || j == size -1) {
                    System.out.print("# ");
                } else {
                    if (j == k || j == size - (k + 1)) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void printPatternI(int size) {
        System.out.println("Model I");
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                if (k == 0 || k == size -1 || j == 0 || j == size -1) {
                    System.out.print("# ");
                } else {
                    if (j == k || j == size - (k + 1)) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void printPatternJ(int size) {
        System.out.println("Model J");
        int counter = size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < counter; k++) {
                System.out.print("# ");
            }
            for (int l = 2; l <= counter; l ++) {
                System.out.print("# ");
            }
            counter--;
            System.out.println();
        }
    }

    public static void printPatternK(int size) {
        System.out.println("Model K");
        int counter = size -1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("# ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("# ");
            }
            counter--;
            System.out.println();
        }
    }

    public static void printPatternL(int size) {
        System.out.println("Model L");
        int counter = size -1;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("# ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("# ");
            }
            counter--;
            System.out.println();
        }
        counter = size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < counter; k++) {
                System.out.print("# ");
            }
            for (int l = 2; l <= counter; l ++) {
                System.out.print("# ");
            }
            counter--;
            System.out.println();
        }
    }

    public static void main(String[] argv) {
        printPatternA(8);
        printPatternB(8);
        printPatternC(8);
        printPatternD(8);
        printPatternE(7);
        printPatternF(7);
        printPatternG(7);
        printPatternH(7);
        printPatternI(7);
        printPatternJ(6);
        printPatternK(6);
        printPatternL(6);
    }
}


