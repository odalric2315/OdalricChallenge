import sun.audio.AudioPlayer

fun main (args: Array<String>) {
    val start = "terminal : ~terminal$ \n"
    val middle1 = "==========================\n"
    val middle2 = "GAME SUIT TERMINAL VERSION\n by Odalric\n"
    val end = "=========================="
    val result = start + middle1 + middle2 + end
    println(result)

//Inisialisasi pilihan
    val pilihan = arrayOf("gunting", "batu", "kertas")

//    Masukkan nama player1
    println("Masukkan nama pemain1 = ")
    var namaPlayer1 = readLine()
    println("Hello, $namaPlayer1 !! Selamat Datang di GAME SUIT TERMINAL VERSION")

//    Menangkap pilihan player1
    println("Masukan Pilihan Anda (Gunting,Batu,Kertas) = ")
    print("Input : ")

    var pemain1 = readLine()!!

//    Masukkan nama player2
    println("Masukkan nama pemain2 = ")
    var namaPlayer2 = readLine()
    println("Hello, $namaPlayer2 !! Selamat Datang di GAME SUIT TERMINAL VERSION")

//    Menangkap pilihan player2
    println("Masukan Pilihan Anda (Gunting,Batu,Kertas) = ")
    print("Input : ")

    var pemain2: String = readLine()!!
    var status = false

//    Menentukan peraturan
    if (pemain1!!.toLowerCase().equals(pemain2.toLowerCase())) {
        println("Seri! $namaPlayer2 dengan $namaPlayer1")
    } else if (pemain1.toLowerCase().equals("batu")) {
        if (pemain2.toLowerCase().equals("gunting")) {
            status = true
            hasil(status, pemain1, pemain2)
        } else {
            status = false
            hasil(status, pemain1, pemain2)
        }
    } else if (pemain1.toLowerCase().equals("gunting")) {
        if (pemain2.toLowerCase().equals("kertas")) {
            status = true
            hasil(status, pemain1, pemain2)
        } else {
            status = false
            hasil(status, pemain1, pemain2)
        }
    } else if (pemain1.toLowerCase().equals("kertas")) {
        if (pemain2.toLowerCase().equals("batu")) {
            status = true
            hasil(status, pemain1, pemain2)
        } else {
            status = false
            hasil(status, pemain1, pemain2)
        }
    }
}
fun hasil(status: Boolean, namaPlayer1: String, namaPlayer2: String)
{if (status)  {
    println("Kamu Menang!! $namaPlayer1 mengalahkan $namaPlayer2")
} else {
    println("Kamu Kalah!! $namaPlayer2 mengalahkan $namaPlayer1")
}
}
