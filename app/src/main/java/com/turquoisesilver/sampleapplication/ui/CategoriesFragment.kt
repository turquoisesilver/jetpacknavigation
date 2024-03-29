package com.turquoisesilver.sampleapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.turquoisesilver.sampleapplication.R
import kotlinx.android.synthetic.main.fragment_categories.*



private const val ARG_CATEGORY_ID = "categoryId"
class CategoriesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categories, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnGotoProducts.setOnClickListener {
            var categoryId = 1

            // Safe Args - is strongly recommended for navigating and passing data, because it ensures type-safety
            val action = CategoriesFragmentDirections.actionCategoriesFragmentToProductsFragment(categoryId)
            findNavController().navigate(action)

            // Bundle
            //var args = bundleOf(ARG_CATEGORY_ID to categoryId)
            //findNavController().navigate(R.id.action_categoriesFragment_to_productsFragment, args)
        }
    }
}