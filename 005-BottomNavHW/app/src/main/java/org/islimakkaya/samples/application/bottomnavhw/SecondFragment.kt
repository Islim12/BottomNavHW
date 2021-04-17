package org.islimakkaya.samples.application.bottomnavhw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlin.random.Random


class SecondFragment : Fragment() {
    private var randomNum1 = 0
    private var randomNum2 = 0
    private var randomNumsMultp = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val design = inflater.inflate(R.layout.fragment_second, container, false)
        setRandomNums()
        setRandomNumsMultiplication()
        design.textViewMultNum1.text = randomNum1.toString()
        design.textViewMultNum2.text = randomNum2.toString()

        design.buttonMultiply.setOnClickListener {
            val transition = SecondFragmentDirections.secondFragmentTransition(randomNumsMultp.toString())
            Navigation.findNavController(it).navigate(transition)
        }

        return design
    }

    private fun setRandomNums() {
        randomNum1 = Random.nextInt(1, 100)
        randomNum2 = Random.nextInt(1, 10)
    }

    private fun setRandomNumsMultiplication() {
        randomNumsMultp =  randomNum1 * randomNum2
    }

}