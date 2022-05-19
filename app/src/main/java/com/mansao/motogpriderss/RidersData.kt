package com.mansao.motogpriderss

object RidersData {
    private val ridersName = arrayOf(
        "Marc Marquez",
        "Pol Espargaro",
        "Fabio Quartararo",
        "Maveric Vinales",
        "Alex Rins",
        "Joan Mir",
        "Jack Miller",
        "Johann Zarco",
        "Alex Marquez",
        "Valentino Rossi"
    )

    private val ridersDesc = arrayOf(
        "Marc Márquez Alentà is a Spanish Grand Prix motorcycle road racer and one of the most successful motorcycle racers of all time, with eight Grand Prix world championships to his name – six of which are in the premier MotoGP class. Márquez races for Honda's factory team since his MotoGP debut in 2013",
        "Pol Espargaró Villà merupakan rider MotoGP asal Spanyol yang musim ini membela tim Pabrikan Redbull KTM. Pol adalah adik dari Aleix Espargaró.",
        "Fabio Quartararo is a French Grand Prix motorcycle rider racing in MotoGP for Monster Energy Yamaha MotoGP. Prior to his Grand Prix career, Quartararo won six Spanish championship titles, including successive CEV Moto3 titles in 2013 and 2014.",
        "Maverick Viñales Ruiz is a Spanish Grand Prix motorcycle racer and former Moto3 World Champion taking the title in 2013",
        "Álex Rins Navarro is a Spanish Grand Prix motorcycle racer, Rins was the 2011 FIM CEV International Championship winner of the Spanish 125GP series, having made his début in the Moto3 World Championship, in the 2012 season",
        "Joan Mir Mayrata is a Spanish Grand Prix motorcycle racer, currently riding for Team Suzuki Ecstar. He won the 2017 Moto3 World Championship with Leopard Racing and the 2020 MotoGP World Championship with Suzuki",
        "Jack Peter Miller is an Australian Grand Prix motorcycle racer who rides for Ducati Lenovo Team. Previously with Pramac in MotoGP, in 2020 he signed a factory contract to ride a Ducati Desmosedici machine for the for 2021 and 2022 seasons.",
        "Johann Zarco adalah pembalap motor Prancis, yang meraih dua gelar juara dunia Moto2 pada tahun 2015 dan 2016. Mulai musim 2017 dia akan menjalani debutnya di kelas MotoGP bersama tim Monster Yamaha Tech 3. Reale Avintia Ducati ",
        "Álex Márquez Alentà is a road racer of solo motorcycles at Grand Prix level from Spain. Since the 2020 season he has competed in MotoGP. Álex is the younger brother of Marc Márquez, who also competes at Grand Prix level",
        "Valentino Rossi is an Italian professional motorcycle road racer and multiple time MotoGP World Champion. Rossi is widely considered to be one of the greatest motorcycle racers of all time, with nine Grand Prix World Championships to his name – seven of which are in the premier class"

    )

    private val ridersImage = intArrayOf(
        R.drawable.marc,
        R.drawable.pol,
        R.drawable.fabio,
        R.drawable.vinales,
        R.drawable.rins,
        R.drawable.mir,
        R.drawable.miller,
        R.drawable.zarco,
        R.drawable.alex,
        R.drawable.vale
    )

    val listData: ArrayList<Riders>
        get() {
            val list = arrayListOf<Riders>()
            for (position in ridersName.indices) {
                val riders = Riders()
                riders.name = ridersName[position]
                riders.desc = ridersDesc[position]
                riders.image = ridersImage[position]
                list.add(riders)
            }
            return list

        }
}