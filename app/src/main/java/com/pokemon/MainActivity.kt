package com.pokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pokemons = mutableListOf<Pokemon>()
        pokemons.add(Pokemon("Bulbasur", "bulbasur"))
        pokemons.add(Pokemon("Caterpie", "caterpie"))
        pokemons.add(Pokemon("Charmander", "charmander"))
        pokemons.add(Pokemon("Diglett", "diglett"))
        pokemons.add(Pokemon("Jigglypuff", "jigglypuff"))
        pokemons.add(Pokemon("Nidoqueen", "nidoqueen"))
        pokemons.add(Pokemon("Pidgey", "pidgey"))
        pokemons.add(Pokemon("Pikachu", "pikachu"))
        pokemons.add(Pokemon("Rattata", "rattata"))
        pokemons.add(Pokemon("Squirtle", "squirtle"))

        rv.layoutManager = LinearLayoutManager(this)
        var adapter = PokemonAdapter(pokemons)
        rv.adapter = adapter
    }
}
