fun main() {

//  val lambda name : (inputType) -> ReturnType = {arguments:InputTyoe -> body}

    repeater(5){index ->
        if (index < 3 ){
//            3 time
            println("hello")
        }else{
//            2 time
            println("goodbey")
        }

    }
}
fun repeater(time:Int,block: (Int) -> Unit){
    repeat(time){index -> block(index)}

}
