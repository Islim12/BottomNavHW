package org.islimakkaya.samples.application.bottomnavhw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_addition.view.*

class AdditionFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val design = inflater.inflate(R.layout.fragment_addition, container, false)

        val bundle:AdditionFragmentArgs by navArgs()

        val transmittedSum = bundle.sum
        design.textSum.text = "Result:  $transmittedSum"

        return design
    }


}