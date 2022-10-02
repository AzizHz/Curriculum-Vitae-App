package com.example.cv

import android.annotation.SuppressLint
import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Patterns.EMAIL_ADDRESS
import android.widget.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






    }

    fun onClick(view: View) {
        val fullname= findViewById<EditText>(R.id.editTextTextPersonName2).text.toString().trim()
        val email=findViewById<EditText>(R.id.editTextTextEmailAddress2).text.toString().trim()
        val age=findViewById<EditText>(R.id.editTextNumberDecimal).text.toString().trim()
        val Android=findViewById<SeekBar>(R.id.seekBar).getProgress()
        val iOS= findViewById<SeekBar>(R.id.seekBar2).getProgress()
        val Flutter=findViewById<SeekBar>(R.id.seekBar3).getProgress()




        if (fullname.isEmpty() ||email.isEmpty()||age.isEmpty()){
            Toast.makeText(this,"all field are req",Toast.LENGTH_SHORT).show()
        }
        else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Toast.makeText(this,"please enter a valid email adresse ",Toast.LENGTH_SHORT).show()

        }
        else if(Android>80||iOS>80||Flutter>80){
            if(Android>80&&Android>iOS&&Android>Flutter){
                Toast.makeText(this,"You are skilled in Android",Toast.LENGTH_SHORT).show()
            }
            else if(iOS>80&&iOS>Android&&iOS>Flutter){
                Toast.makeText(this,"You are skilled in iOS",Toast.LENGTH_SHORT).show()
            }
            else if(Flutter>80&&Flutter>Android&&Flutter>iOS){
                Toast.makeText(this,"You are skilled in Flutter ",Toast.LENGTH_SHORT).show()
            }
        }
        else if(Android<31&&iOS<31&&Flutter<31){
            Toast.makeText(this,"You need to work more on your skills",Toast.LENGTH_SHORT).show()

        }
        else{
            Toast.makeText(this,"You have a good skills ",Toast.LENGTH_SHORT).show()
        }

        //Toast.makeText(this,"Button is clicked",Toast.LENGTH_LONG).show()
    }


    fun reset(view: View) {
        val fullname= findViewById<EditText>(R.id.editTextTextPersonName2)
        val email=findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val age=findViewById<EditText>(R.id.editTextNumberDecimal)
        val Android=findViewById<SeekBar>(R.id.seekBar)
        val iOS= findViewById<SeekBar>(R.id.seekBar2)
        val Flutter=findViewById<SeekBar>(R.id.seekBar3)
        val grp=findViewById<RadioGroup>(R.id.grp)
        val male=findViewById<RadioButton>(R.id.radioButton)


        fullname.text.clear()
        age.text.clear()
        email.text.clear()
        Flutter.progress = 0
        Android.progress=0
        iOS.progress=0
        male.id=0
        grp.check(0)


    }


}