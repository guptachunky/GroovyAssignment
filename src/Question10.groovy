class Question10 {
    static void main(String[] args) {

//        File input = new File("/home/chunky/IdeaProjects/GroovyAssignment/src/outputFile")
//        File outputFile = new File("/home/chunky/IdeaProjects/GroovyAssignment/src/WithoutSpaces")
        File src = new File("/home/chunky/IdeaProjects/GroovyAssignment/src/vk.jpg")

        new File("/home/chunky/IdeaProjects/GroovyAssignment/src/image.jpg").withOutputStream {
            out ->
                out.write(src.readBytes())
        }
    }

}



