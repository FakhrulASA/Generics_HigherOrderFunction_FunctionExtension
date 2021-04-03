fun main() {
//    print(calculate(10,::cal))
calculateGen(true)
}
fun cal(a:Int,b:Int):Int{
    return a*b
}
fun<T> calCom(a:T,b:T):T{
    return a
}
fun calculate(a:Int,funCal:(x:Int,y:Int)->Int):Int{
    return a*funCal(5,2)
}

fun<T> calculateGen(a:T){
    print(a)
}
fun<T> complexSum(comP:(a:T,b:T)->T){

}