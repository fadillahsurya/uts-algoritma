public class Instagram {
    //atribut
    int likes;
    int komen;

    //methode
    void komen(){
        hasil--;
        if(hasil >10){
            //hasil like berarti tidak sesuai gambar
            kesimpulan++;
            system.out.printIn("like sesuai gambar...");
        }else {
            system.out.printIn("like sedikit tidak sesuai gambar")
        }
    }

    void posting(){
        if(kesimpulan > 0){
            system.out.printIn("tidak dapat memposting karena jumlah like komen sedikit...");
        }else{
            system.out.printIn("dapat memposting...");
        }
    }

    void komen(){
        //dapat memposting
        kesimpulan--;
        hasil--;
        system.out.printIn("komentar naik");
    }
}