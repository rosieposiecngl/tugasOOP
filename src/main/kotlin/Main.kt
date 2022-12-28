import Human

open class Anuin{

    protected val alamat = "Jalan Seto Lrg.Sipirok No.23"

}


class Binar:Anuin(){
    fun alamat(): String{
        return  alamat
    }

}

class Mahasiswa {
    var nama: String =""
    var NIM : String =""
    var jurusan: String =""
    private var pesan: String = "Halo Perkenalkan Aku.... "

    fun printMsg(){
        print(pesan)
    }

}
open class identityMhs(
    private val name: String,
    private val nim: String,
    protected var major: String = "No Major"
){
    private var isAvailable:Boolean = true
    private var nilaiPemrogramanJava: Int = 100

    init{
        isAvailable = available()
        nilaiPemrogramanJava = nilaiJava()
    }


    open fun available(): Boolean {
        return false
    }
    open fun nilaiJava(): Int{
      return 87
    }
   open fun TempatLahir(tmptLahir: String){
       println("Tempat Lahir: $tmptLahir")
   }
    open fun TanggalLahir(tglLahir: Int){
        println("Tanggal Lahir: $tglLahir")
    }
    open fun AnuNilaiMean(){
        println("Nilai Meannya adalah")
    }

}
fun main(args: Array<String>){
    val mhs = Mahasiswa()
    val niko = Human(
        name = "Okin",
        nim = "181401033",
    )

    mhs.nama ="Cindy Nainggolan"
    mhs.NIM = "181401036"
    mhs.jurusan = "Ilmu Komputer 2018"

    val msg = Mahasiswa()
    msg.printMsg()
    println("")
    println("Nama : ${mhs.nama}")
    println("NIM : ${mhs.NIM}")
    println("Jurusan :${mhs.jurusan}")
    var address = Binar()
    var alamat = address.alamat()
    print("$alamat")
    println("\n")

    println("Apakah Niko ada di Kelas: ${niko.available()}")
    println("Nilai Pemrograman Java Niko : ${niko.nilaiJava()}")
    niko.setMajorMhs("Perpajakan")
    niko.TempatLahir("Medan")
    niko.TanggalLahir(12)
    println("")

}

