class Question9 {
    static void main(String[] args) {

        File input = new File("/home/chunky/IdeaProjects/GroovyAssignment/src/outputFile")
        File outputFile = new File("/home/chunky/IdeaProjects/GroovyAssignment/src/oddLine")
        int i = 1;
        input.eachLine {
            line ->
                if(i % 2 ==1){
                    outputFile << i + line+"\n"
                }
                i++;

        }
    }
}
