package com.munawirfikri.submission_aplikasisederhana

object CrewData {
    private val crewJapaneseNames = arrayOf(
            "モンキー・Dディー・ルフィ",
            "ロロノア・ゾロ",
            "ナミ",
            "ウソップ",
            "サンジ",
            "トニートニー・チョッパー",
            "ニコ・ロビン",
            "フランキー",
            "ブルック",
            "ジンベエ")

    private val crewNames = arrayOf(
        "Monkey D. Luffy",
        "Roronoa Zoro",
        "Nami",
        "Usopp",
        "Sanji",
        "Tony Tony Chopper",
        "Nico Robin",
        "Franky",
        "Brook",
        "Jinbe")

    private val crewDetails = arrayOf(
            "Monkey D. Luffy, juga dikenal sebagai Topi Jerami Luffy dan umumnya sebagai Topi Jerami, adalah protagonis utama dari manga dan anime, One Piece. Dia adalah pendiri dan kapten Bajak Laut Topi Jerami yang semakin terkenal dan kuat, serta salah satu dari empat petarung top. Impian seumur hidupnya adalah menjadi Raja Bajak Laut dengan menemukan harta karun legendaris yang ditinggalkan oleh Raja Bajak Laut yang terlambat, Gol D. Roger. Dia percaya bahwa menjadi Raja Bajak Laut berarti memiliki kebebasan terbanyak di dunia. Setelah invasi Totto Land dan tindakannya melawan Yonko Big Mom, dia saat ini dianggap oleh pers global untuk menjadi Kaisar Kelima.",
            "Roronoa Zoro juga dikenal sebagai Pemburu Bajak Laut Zoro adalah seorang bajak laut dan ahli pedang dari kelompok Bajak Laut Topi Jerami dan merupakan salah satu karakter utama dalam cerita One Piece. Ia adalah orang pertama yang ditawari Monkey D. Luffy untuk bergabung dengannya. Impiannya adalah menjadi pendekar pedang nomor satu di dunia dengan mengalahkan Shichibukai Dracule Mihawk.",
            "Nami si Kucing Pencuri (ナミ Nami) adalah seorang bajak laut dan navigator dari kelompok Bajak Laut Topi Jerami. Dia di besarkan di Desa Cocoyasi di East Blue dan menjadi anggota ketiga kru topi jerami setelah kekalahan Arlong. Sebelum bergabung, Nami dikenal sebagai pencuri yang ulung. Impiannya adalah untuk dapat memetakan seluruh dunia.",
            "Usopp adalah penembak jitu dari Bajak Laut Topi Jerami dan mantan Kapten dari Bajak Laut Usopp. Ia dilahirkan di Desa Syrup dan pertama kali disebutkan oleh Yasopp, ayahnya. Meskipun pengecut yang normal, Usopp bermimpi menjadi seorang pejuang pemberani laut seperti ayahnya dan hidup setiap hari dalam mengejar hidup sampai mimpi ini.",
            "Sanji (黒脚・サンジ Kuro ashi no Sanji?) adalah seorang bajak laut merangkap koki dari kelompok Bajak Laut Topi Jerami. Ia merupakan anggota kelima yang bergabung menjadi anggota kru saat kru topi jerami berlabuh di restoran terapung Baratie. Meski bergabung dan dibesarkan di East Blue, Sanji aslinya dilahirkan di North Blue sehingga ia adalah anggota kru topi jerami pertama yang tidak berasal dari East Blue. Impian Sanji adalah untuk dapat menemukan All Blue, sebuah lautan dimana East Blue, West Blue, North Blue dan South Blue saling bertemu dan menghasilkan bahan-bahan masakan terbaik yang merupakan surga bagi para koki.",
            "Tony Tony Chopper adalah seorang dokter bajak laut dari kelompok Bajak Laut Topi Jerami. Ia aslinya seekor rusa yang dapat bertransformasi menjadi manusia setelah tanpa sengaja memakan Buah Iblis Hito Hito no Mi.",
            "Nico Robin (ニコ・ロビン Niko Robin?) adalah mantan Baroque Works yang bergabung menjadi anggota kru ketujuh kelompok Bajak Laut Topi Jerami. Ia seorang arkeolog dari pulau Ohara, dan menjadi buronan pemerintah sejak berumur 8 tahun berkat kemampuannya membaca poneglyph",
            "Franky adalah anggota kru Bajak Laut Topi Jerami yang bertugas sebagai mekanik kapal Thousand Sunny. Pertama kali muncul sebagai pemimpin Keluarga Franky, sebuah genk bawah tanah yang menguasai jalanan Water 7. Ia bernama asli Cutty Flam namun kemudian diganti karena permintaan Iceburg. Ia awalnya menjadi musuh kru topi jerami, namun berubah menjadi teman setelah perkembangan situasi memaksa mereka berbalik mendukung kru topi jerami. ",
            "Brook (ブルック Burukku) adalah seorang bajak laut dan musisi dari kelompok Bajak Laut Topi Jerami. Ia menjadi kru kesembilan yang bergabung setelah ditemukan tanpa sengaja di atas kapalnya yang karam di lautan misterius Segitiga Florian.",
            "Jinbe ( ジンベエ Jinbē? ) adalah seorang mermen spesies hiu paus, mantan Shichibukai dan kapten kedua kelompok Bajak Laut Matahari setelah Fisher Tiger. Gelar Shichibukainya dicabut karena menolak ikut serta dalam perang melawan Shirohige, serta secara terang-terangan membantu Monkey D. Luffy dan Bajak Laut Whitebeard.")

    private val crewImages = intArrayOf(
            R.drawable.luffy,
            R.drawable.zoro,
            R.drawable.nami,
            R.drawable.usopp,
            R.drawable.sanji,
            R.drawable.chopper,
            R.drawable.robin,
            R.drawable.franky,
            R.drawable.brook,
            R.drawable.jinbe
    )

    private val crewBounty = intArrayOf(
            R.drawable.luffy_bounty,
            R.drawable.zoro_bounty,
            R.drawable.nami_bounty,
            R.drawable.usopp_bounty,
            R.drawable.sanji_bounty,
            R.drawable.chopper_bounty,
            R.drawable.robin_bounty,
            R.drawable.franky_bounty,
            R.drawable.brook_bounty,
            R.drawable.jinbe_bounty
    )

    private val crewUrutan = arrayOf(
        "Pertama",
        "Kedua",
        "Ketiga",
        "Keempat",
        "Kelima",
        "Keenam",
        "Ketujuh",
        "Kedelapan",
        "Kesembilan",
        "Kesepuluh"
    )

    val listData: ArrayList<Crew>
        get() {
            val list = arrayListOf<Crew>()
            for (position in crewNames.indices) {
                val crew = Crew()
                crew.order = crewUrutan[position]
                crew.name = crewNames[position]
                crew.japaneseName = crewJapaneseNames[position]
                crew.detail = crewDetails[position]
                crew.photo = crewImages[position]
                crew.photoBounty = crewBounty[position]
                list.add(crew)
            }
            return list
        }
}