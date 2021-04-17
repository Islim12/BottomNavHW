package org.islimakkaya.samples.application.bottomnavhw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_multiplication.view.*

class MultiplicationFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val design = inflater.inflate(R.layout.fragment_multiplication, container, false)

        val bundle:MultiplicationFragmentArgs by navArgs()

        val transmittedMultp = bundle.multp

        design.textMultiplication.text = "Result:  $transmittedMultp"

        return design
    }


}