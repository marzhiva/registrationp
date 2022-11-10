package com.example.registration2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var surname: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var checkbox: CheckBox
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name=findViewById(R.id.name)
        surname=findViewById(R.id.surname)
        email=findViewById(R.id.email)
        password=findViewById(R.id.password)
        checkbox=findViewById(R.id.checkBox)
        button=findViewById(R.id.button)

        button.setOnClickListener(){

            if (name.text.toString().length>=3 && surname.text.toString().length>=5 ){
                if ( email.text.toString().contains('@') && email.text.toString().contains('.')) {
                    if (email.text.toString().indexOf('@') < email.text.toString().lastIndexOf('.')){
                            if (password.text.toString().length >= 8 && password.text.toString().any{it.isDigit()} ) {
                                if (checkbox.isChecked) {
                                    Toast.makeText(this, "მიმდინარეობს გადახდა", Toast.LENGTH_SHORT).show()
                                }
                            }
                    }
                }
            }
        }

    }
}