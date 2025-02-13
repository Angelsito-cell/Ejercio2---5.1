class EmpleadoFijo(
    nombre:String,
    id: String?,
    private val SalarioAnual: Double,
    private val numPagas: Int
): Empleado(nombre, id) {

    override fun calcularSalario(): Double {
        if (SalarioAnual < 0) {
            throw IllegalArgumentException("El salario no puede ser negativo")
        }
        if (numPagas <= 0) {
            throw IllegalArgumentException("El Numero de pagas debe ser mayor a 0")
        }
        return SalarioAnual / numPagas
    }
}