package com.example.belajarrecycler

class SumberData {
    companion object {
        fun buatSetData(): ArrayList<listobjDosen> {
            val list = ArrayList<listobjDosen>()
            list.add(
                listobjDosen(
                    "Indah Lestari, M.Sc.",
                    "Data Structures & Algorithms (Java), Software Engineering",
                    "https://pcr.ac.id/assets/images/pegawai/IDI20211215072827.JPG",
                    "20101010",
                    "Workshop Pemrograman Mobile",
                    "201"
                )
            )
            list.add(
                listobjDosen(
                    "Muhammad Mahrus Zain, S.S.T., M.T.I",
                    "IoT, Application Development, Data Science",
                    "https://pcr.ac.id/assets/images/pegawai/MMZ20211215073029.JPG",
                    "20101011",
                    "Workshop Pemrograman Framework",
                    "202"
                )
            )
            list.add(
                listobjDosen(
                    "Profil Dr.Dadang Syarif Sihabudin Sahid, S.Si,M.Sc.",
                    "Web Programming, System Development and Aplication, IT Project Management",
                    "https://pcr.ac.id/assets/images/pegawai/DDS20211215072937.jpg",
                    "20101012",
                    "KTI",
                    "203"
                )
            )
            list.add(
                listobjDosen(
                    "Dini Hidayatul Qudsi, S.S.T., M.I.T.",
                    "Database, Data Mining, Android Programming",
                    "https://pcr.ac.id/assets/images/pegawai/DHQ20211215072931.jpg",
                    "20101013",
                    "Big Data",
                    "204"
                )
            )
            list.add(
                listobjDosen(
                    "Heni Rachmawati, S.T.,M.T.",
                    "Software Engineering , Data Structure, Cryptography",
                    "https://pcr.ac.id/assets/images/pegawai/HNI20211215072835.JPG",
                    "20101014",
                    "Basis Data",
                    "205"
                )
            )
            return list
        }
    }
}



