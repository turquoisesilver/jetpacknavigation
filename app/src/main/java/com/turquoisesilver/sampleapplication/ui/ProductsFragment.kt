package com.turquoisesilver.sampleapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.turquoisesilver.sampleapplication.R
import com.turquoisesilver.sampleapplication.model.Product
import kotlinx.android.synthetic.main.fragment_categories.*
import kotlinx.android.synthetic.main.fragment_products.*


private const val ARG_PRODUCT_ITEM = "productItem"

class ProductsFragment : Fragment() {

    val args: ProductsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*
        //Bundle
        arguments?.let {
          var catId = it.getInt(ARG_CATEGORY_ID)
        }*/

        // Safe Args
        var catId = args.categoryId
        var product = Product().apply {
            id = 1
            catId = catId
            name = "Huawei Matebook"
            imageUrl = "https://img01.huaweifile.com/eu/tr/huawei/pms/product/6901443385072/428_428_32FFCD37BCEB4A703FB6F8C04EDF8A03D5DEB62C4F74D8E4mp.png"
        }

        txtName.text = "Category Id : $catId"
        btnGotoProductDetail.setOnClickListener {
            findNavController().navigate(ProductsFragmentDirections.actionProductsFragmentToProductDetailFragment(product))

            // Bundle
            //var args = bundleOf(ARG_PRODUCT_ITEM to product)
            //findNavController().navigate(R.id.action_productsFragment_to_productDetailFragment, args)

        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_products, container, false)
    }


}