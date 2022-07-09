package com.speria.tweetapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRvAdapter (var tweetList:List<Tweet>):
    RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_of_item,parent ,false)
        return TweetViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentContact=tweetList.get(position)
        holder.tvName1.text=currentContact.Name1
        holder.tvHarsh1.text=currentContact.Harsh1
        holder.tvTweet1.text=currentContact.Tweet1
        holder.textView.text=currentContact.textView
        holder.textView2.text=currentContact.textView2
        holder.textView3.text=currentContact.textView3


//        holder.imageView.text=currentContact.image

    }

    override fun getItemCount(): Int {
        return tweetList.size

    }
}
class TweetViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var tvName1=itemView.findViewById<TextView>(R.id.tvName1)
    var tvHarsh1=itemView.findViewById<TextView>(R.id.tvHarsh1)
    var tvTweet1=itemView.findViewById<TextView>(R.id.tvTweet1)
    var textView=itemView.findViewById<TextView>(R.id.textView)
    var textView2=itemView.findViewById<TextView>(R.id.textView2)
    var textView3=itemView.findViewById<TextView>(R.id.textView3)



    //    var tvLocation=itemView.findViewById<TextView>(R.id.tvLocation)
    var imageView=itemView.findViewById<ImageView>(R.id.imageView)

}