package id.calocallo.cloneui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import id.calocallo.cloneui.databinding.ActivityChallengeBinding
import id.calocallo.cloneui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.button.text = "-"
//        binding.button2.text = "+"
//        binding.textView.text = "0"
//        val tambah = 1
//        var curr = 0
//        total = 0
//        binding.button2.setOnClickListener {
//            total += 1
//            Log.e("tambah", "$total")
//            binding.textView.text = total.toString()
//        }
//        binding.button.setOnClickListener {
//            total -= 1
//            Log.e("tambah", "$total")
//            binding.textView.text = total.toString()
//        }
    }
}