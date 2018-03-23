class HourMinutes {
    int hour;
    int minutes;


}


class Question5 {
    static void main(String[] args) {

        if ("test") {
            println("test is evaluated to true inside if")
        } else {
            println("test is evaluated to false inside if")
        }

        if ("null") {
            println("null is evaluated to true inside if")
        } else {
            println("null is evaluated to false inside if")
        }

        if (null) {
            println("@null is evaluated to true inside if")
        } else {
            println("@null is evaluated to false inside if")
        }

        if (100) {
            println("100 is evaluated to true inside if")
        } else {
            println("100 is evaluated to false inside if")
        }

        if (0) {
            println("0 is evaluated to true inside if")
        } else {
            println("0 is evaluated to false inside if")
        }

        List list = []
        if (list) {
            println("List =" + list)
            println("list is evaluated to true inside if")
        } else {

            println("List =" + list)
            println("list  is evaluated to false inside if")
        }

        List list1 = new ArrayList()
        list1.addAll([null, null, null])
        if (list1) {
            println("List =" + list1)
            println("list is evaluated to true inside if")
        } else {

            println("List =" + list1)
            println("list  is evaluated to false inside if")
        }


    }
}
