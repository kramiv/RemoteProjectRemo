package DemoLambda

class DemoLambda {
  
    //tutorial: https://youtu.be/HQmnndjA6PI
    //goal: execute a method of some class in AWS
    //since I am using VSCode, I had to google a different way to create a JAR
    //honestly, I just used chatgpt to figure it out. prompt: "How do I create a jar file in VsCode using scala?"

    def execute(): Int = {
        println("I am running on AWS")
        42
    }
}
