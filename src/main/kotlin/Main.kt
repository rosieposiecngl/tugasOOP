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
    println("---------------------")

    println("Menghitung Bangun Datar")
    val persegi = Persegi()
    val persegiPanjang = PersegiPanjang()
    val segitiga = Segitiga()
    val belahKetupat = BelahKetupat()
    val trapesium = Trapesium()
    val jajarGenjang = JajarGenjang()

    println("=======================")
    println("MENGHITUNG PERSEGI")
    persegi.luas()
    persegi.keliling()
    println("=======================")

    println("=======================")
    println("MENGHITUNG PERSEGI PANJANG")
    persegiPanjang.luas()
    persegiPanjang.keliling()
    println("=======================")

    println("=======================")
    println("MENGHITUNG Segitiga")
    segitiga.luas()
    segitiga.keliling()
    println("=======================")

    println("=======================")
    println("MENGHITUNG Belah Ketupat")
    belahKetupat.luas()
    belahKetupat.keliling()
    println("=======================")

    println("=======================")
    println("MENGHITUNG Trapesium")
    trapesium.luas()
    trapesium.keliling()
    println("=======================")

    println("=======================")
    println("MENGHITUNG Jajar Genjang")
    jajarGenjang.luas()
    jajarGenjang.keliling()
    println("=======================")

}

open class BangunDatar(){
    open fun luas(){

    }
    open fun keliling(){

    }
}

class Persegi(): BangunDatar(){
    var sisi = 11
    override fun luas(){
        println("Hitung Luas Persegi = ${sisi*sisi}")
    }

    override fun keliling() {
        println("Hitung Keliling Persegi = ${sisi*4}")
    }
}
class PersegiPanjang(): BangunDatar(){
    var panjang = 13
    var lebar = 17
    override fun luas(){
        println("Hitung Luas Persegi = ${panjang*lebar}")
    }

    override fun keliling() {
        println("Hitung Keliling Persegi = ${2*panjang+2*lebar}")
    }
}

class Segitiga(): BangunDatar(){
    var tinggi =3
    var alas = 8
    var sisi3 = 19
    override fun luas(){
        println("Hitung Luas Persegi = ${alas*tinggi/2}")
    }

    override fun keliling() {
        println("Hitung Keliling Persegi = ${alas+tinggi+sisi3}")
    }
}

class BelahKetupat(): BangunDatar(){
    var diagonal1 = 18
    var diagonal2 = 22
    var sisi4 = 18
    override fun luas(){
        println("Hitung Luas Persegi = ${diagonal1*diagonal2/2}")
    }

    override fun keliling() {
        println("Hitung Keliling Persegi = ${4*sisi4}")
    }
}

class Trapesium(): BangunDatar(){
    var alas1 = 11
    var alas2 = 6
    var tinggi2 = 9
    var a = 11
    var b = 16
    var c = 19
    var d = 22
    override fun luas(){
        println("Hitung Luas Persegi = ${(alas1+alas2)*tinggi2/2}")
    }

    override fun keliling() {
        println("Hitung Keliling Persegi = ${a+b+c+d}")
    }
}

class JajarGenjang(): BangunDatar(){
    var alasJ = 13
    var tinggiJ = 7
    var panjangJ = 8
    var lebarJ = 23
    override fun luas(){
        println("Hitung Luas Persegi = ${alasJ*tinggiJ}")
    }

    override fun keliling() {
        println("Hitung Keliling Persegi = ${2*panjangJ+2*lebarJ}")
    }
}
