package org.islimakkaya.samples.application.bottomnavhw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlin.random.Random

class FirstFragment : Fragment() {
    private var randomNum1 = 0
    private var randomNum2 = 0
    private var randomNumsSum = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val design = inflater.inflate(R.layout.fragment_first, container, false)
        setRandomNums()
        setRandomNumsSum()
        design.textViewAddNum1.text = randomNum1.toString()
        design.textViewAddNum2.text = randomNum2.toString()

        design.buttonAdd.setOnClickListener {
            val transition = FirstFragmentDirections.firstFragmentTransition(randomNumsSum.toString())
            Navigation.findNavController(it).navigate(transition)
        }

        return design
    }

    private fun setRandomNums() {
        randomNum1 = Random.nextInt(0, 100)
        randomNum2 = Random.nextInt(0, 100)
    }

    private fun setRandomNumsSum() {
        randomNumsSum =  randomNum1 + randomNum2
    }

}