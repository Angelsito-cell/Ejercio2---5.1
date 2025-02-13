class EmpleadoPorHora(
    nombre:String,
    id: String?,
    val horasTrabajadasAlMes: Double
): Empleado(nombre, id) {
    override fun calcularSalario(): Double {
        return horasTrabajadasAlMes * 12
    }
}