class Human(private  val name: String, private val nim: String):identityMhs(name,nim)  {

fun setMajorMhs(major: String){
    this.major = major
}

//
//    override fun available(): Boolean {
//        return super.available()
//
//    }

    override fun available(): Boolean{
        return if (major == "Ilmu Komputer"){
            true
        } else{
            super.available()
        }
    }
    override fun nilaiJava(): Int{
        return 87
    }
}


class Human2(private  val name: String, private val nim: String):identityMhs(name,nim)  {

    override fun available(): Boolean {
        return false

    }
    override fun nilaiJava(): Int{
        return 93
    }
}

class Human3(private  val name: String, private val nim: String):identityMhs(name,nim)  {

  override fun TempatLahir(tmptLahir: String) {
      var tmptLahir = ""
      println("Aku lahir di $tmptLahir")
  }

    fun TempatLahir(){
        val tglLahir =""
        println("Aku lahir di $tglLahir")
    }
}

