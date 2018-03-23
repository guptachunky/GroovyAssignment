class Question3 {
    static void main(String[] args) {

        int i = 1;

        Scanner scanner = new Scanner(System.in)
        println("Enter Number Of lines")
        int n = scanner.nextInt();


        n.times {
            i.times {
                print("* ")
            }
            println()
            i = i * 2;
        }

    }
}
