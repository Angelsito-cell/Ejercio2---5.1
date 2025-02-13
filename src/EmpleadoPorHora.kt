class EmpleadoPorHora(
    nombre:String,
    id: String?,
    val horasTrabajadasAlMes: Double,
    val tarifaPorHora: Int
): Empleado(nombre, id) {
    override fun calcularSalario(): Double {
        return (horasTrabajadasAlMes*tarifaPorHora) * 12
    }
}