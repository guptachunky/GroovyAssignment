class Question6 {

    static void multiplyWay1() {
        int i = 1;
        10.times {
            println("3 * " + i + " = " + (3 * i))
            i++;
        }
    }

    static void multiplyWay2() {
        int i = 1;
        10.times {
            println("3 * " + i + " = " + (3.multiply(i)))
            i++;
        }
    }

    static void multiplyWay3() {
        int i = 1;
        for (int j = 0; j < 10; j++) {
            println("3 * " + i + " = " + (3.multiply(i)))
            i++;
        }
    }

    static void main(String[] args) {
        multiplyWay1()

        println("\n")
        multiplyWay2()
        println("\n")
        multiplyWay3()

    }


}
