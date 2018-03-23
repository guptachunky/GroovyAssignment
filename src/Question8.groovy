class Question8 {

    static void main(String[] args) {

        File outputFile=new File("/home/chunky/IdeaProjects/GroovyAssignment/src/outputFile");
        new File("/home/chunky/IdeaProjects/GroovyAssignment/src/files").eachFile() { file->
            outputFile << file.text
        }
        println outputFile.text
    }
}
