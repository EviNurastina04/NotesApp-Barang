package com.example.NotesApp

class Barang {

    var id: Int? = null
    //berfungsi sebagai primary key dan akan terhubung pada database pada saat dijalankan
    var name: String? = null
    //menambahkan nama
    var jenis: String? = null
    // menambahkan jenis barang
    var harga: String? = null
    //menambahkan harga barang

    constructor(id: Int, name: String, jenis: String, harga:String){
        this.id = id
        this.name = name
        this.jenis = jenis
        this.harga = harga
    }
}
