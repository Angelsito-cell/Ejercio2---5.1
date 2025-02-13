import java.util.Locale

abstract class Empleado(
    nombre:String,
    id: String?
) {

    var nombre: String = nombre
        set(value) {
            if (value.isBlank()) {
                throw IllegalArgumentException("El nombre no puede estar vacio")
            }
        }
    var id: String = id.toString()
        set(value) {
            if (!value.matches(Regex("\\d{4}"))) {
                throw IllegalArgumentException("El ID no puede más de 4 dígitos")
            }
        }

    abstract fun calcularSalario(): Double


}