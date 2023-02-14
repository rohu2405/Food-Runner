package com.example.foodrunner

class DataSource {

    fun loadProduct():List<Menue> {
        return listOf<Menue>(
            Menue(R.string.product1 , R.string.resturant4 , R.string.price4 , R.drawable.icecream),
            Menue(R.string.product2 , R.string.resturant1 , R.string.price1 , R.drawable.burger),
            Menue(R.string.product3 , R.string.resturant2 , R.string.price2 , R.drawable.dessert),
            Menue(R.string.product4 , R.string.resturant5 , R.string.price5 , R.drawable.pasta),
            Menue(R.string.product5 , R.string.resturant3 , R.string.price3 , R.drawable.coffee),
        )
    }
}