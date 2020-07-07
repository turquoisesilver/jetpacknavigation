package com.turquoisesilver.sampleapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.turquoisesilver.sampleapplication.R
import com.turquoisesilver.sampleapplication.util.downloadImage
import kotlinx.android.synthetic.main.fragment_product_detail.*

private const val ARG_PRODUCT_ITEM = "productItem"

class ProductDetailFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product_detail, container, false)
    }

    val args: ProductDetailFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Bundle
        /*arguments?.let {
           var productItem = it.getSerializable(ARG_PRODUCT_ITEM) as Product
           downloadImage(imgProductDetail, productItem?.imageUrl)*/


        var productItem = args.productItem
        txtName.text = productItem?.name

        downloadImage(imgProductDetail, productItem?.imageUrl)

    }
}