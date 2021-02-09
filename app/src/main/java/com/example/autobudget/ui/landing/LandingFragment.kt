package com.example.autobudget.ui.landing

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.autobudget.R
import com.example.autobudget.databinding.FragmentLandingBinding
import kotlinx.android.synthetic.main.fragment_landing.*


private const val REQUEST_CODE = 40



class LandingFragment : Fragment() {

    private lateinit var binding: FragmentLandingBinding



    companion object{
        private const val CAMERA_PERMISSION_CODE = 1
        private const val CAMERA_REQUEST_CODE = 2
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_landing,
            container,
            false
        )
        /**Action to perform for the add receipt botton on the landing screen*/
        fab_add_receipt.setOnClickListener {

            /*//check if permission to use camera is granted
            if (ContextCompat.checkSelfPermission(
                    //get the application context
                    requireContext().applicationContext,
                    Manifest.permission.CAMERA
                    ) == PackageManager.PERMISSION_GRANTED
            ){
                //if permission is granted use camera
                val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                //passing a request code when starting the activity for a result
                startActivityForResult(intent, CAMERA_REQUEST_CODE)
            }else{
                //if we do not have permission, ask for permission
                ActivityCompat.requestPermissions(
                    requireActivity(),
                    arrayOf(Manifest.permission.CAMERA),
                    CAMERA_PERMISSION_CODE
                )
            }*/
        }
        return binding.root
    }


  /*  override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == CAMERA_PERMISSION_CODE){

            if(grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                //if permission is granted use camera
                val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                //passing a request code when starting the activity for a result
                startActivityForResult(intent, CAMERA_REQUEST_CODE)
            }else{
                Toast.makeText(requireActivity(),"Permission to use camera denied!",
                Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            if(requestCode == CAMERA_REQUEST_CODE){
                val thumbnail: Bitmap = data!!.extras!!.get("data") as Bitmap

            }
        }
    }*/

}