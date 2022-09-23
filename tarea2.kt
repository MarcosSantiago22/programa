fun main() {
    val nombre_usuario : String = "Marcos"
    val contrasena_usuario : String = "13579"

    println("Ingrese su usuario")
    val usuario = readLine()
    println("Ingrese su contraseña")
    val contrasena = readLine()

    if (nombre_usuario == usuario && contrasena_usuario == contrasena) {
        println("Bienvenido")
    } else {
        println("Usuario y/o contraseña incorrectos")
    }
}