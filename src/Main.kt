import kotlin.math.pow


fun main(){

    try {

      val empleadoFijo =  EmpleadoFijo("Gamerfriki", "00013", 28833.96 , 14)
        println("El empleado ${empleadoFijo.nombre} con ID-${empleadoFijo.id} tiene un salario de ${"%.2f".format(empleadoFijo.calcularSalario())}")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

}