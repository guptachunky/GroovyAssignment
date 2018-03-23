class Question7 {

   static Closure closure = { List list, int value -> list.contains(value)
    }

    static void main(String[] args) {

        List list = [1, 2, 3, 4, 5, 6, 7, 8, 9]
        int value1 = 5;
        int value2 = 10;
        println(closure(list,value1))

        println(closure(list,value2))
    }
}
