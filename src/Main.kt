fun main{
    try {
        // Crear un empleado fijo con datos válidos
        val empleadoFijo = EmpleadoFijo("Carlos", "1234", 30000.0, 12)

        println("${empleadoFijo.nombre} con ID-${empleadoFijo.id} tiene un salario de ${"%.2f".format(empleadoFijo.calculaSalario())} al mes.")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }


}