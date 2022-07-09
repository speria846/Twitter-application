package com.speria.tweetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.speria.tweetapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displatContacts()
    }
    fun displatContacts(){
        var tweet1=Tweet("Niwemesiga Speria","#seria","Hello, today is a very great day of uganda martrys at namugongo","","6 likes","4 retweets","5 shares")
        var tweet2=Tweet("Breria Akan","#peeeia","Hello,this is speria from uganda, and am open to work ,you may find me on my email niwenyesigasperia@gmail.com. ","","8 likes","8 retweets","7 shares")
        var tweet3=Tweet("Dallen abinsinguza","#speria","Happy birthy day dear Dallen,wish you well ,more years to fly","","4 retweets","5 shares","5 shares")
        var tweet4=Tweet("Bridget akam","#seia","Hello, today is a very great day of uganda martrys at namugongo","","3 likes","9 retweets","9 shares")
        var tweet5=Tweet("queen amutuheire","#seria","Happy birthy day dear Queen,wish you well ,more years to fly","","3 likes","9 retweets","9 shares")
        var tweet6=Tweet("Brezia akan","#seria","Hello, today is a very great day of uganda martrys at namugongo","","3 likes","9 retweets","9 shares")

        var Contact = listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6)

        var TweetAdapter=TweetRvAdapter(Contact)
        binding.rvTweets.layoutManager= LinearLayoutManager(this)
        binding.rvTweets.adapter=TweetAdapter

    }
}