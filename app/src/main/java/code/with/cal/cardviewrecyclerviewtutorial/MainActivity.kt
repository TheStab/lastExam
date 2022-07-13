package code.with.cal.cardviewrecyclerviewtutorial

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone
import androidx.recyclerview.widget.GridLayoutManager
import code.with.cal.cardviewrecyclerviewtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), BookClickListener
{
    private lateinit var binding: ActivityMainBinding
    //private lateinit var category: String

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateItems()

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 1)
            adapter = CardAdapter(itemList)
        }

    }
    override fun onClick(item: Item)
    {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        startActivity(intent)
    }

    private fun populateItems() {
        val item1 = Item(
            R.drawable.profile,
            "Belt suit blazer",
            "$120",
            "Category1"
        )
        itemList.add(item1)

        val item2 = Item(
            R.drawable.address,
            "Belt suit blazer",
            "$120",
            "Category2"
        )
        itemList.add(item2)

        val item3 = Item(
            R.drawable.notification,
            "Belt suit blazer",
            "$120",
            "Category3"
        )
        itemList.add(item3)

        val item4 = Item(
            R.drawable.payment,
            "Belt suit blazer",
            "$120",
            "Camping"
        )
        itemList.add(item4)

        val item5 = Item(
            R.drawable.security,
            "Belt suit blazer",
            "$120",
            "Camping"
        )
        itemList.add(item5)

        val item6 = Item(
            R.drawable.language,
            "Belt suit blazer",
            "$120",
            "Camping"
        )
        itemList.add(item6)

        val item7 = Item(
            R.drawable.darkmode,
            "Belt suit blazer",
            "$120",
            "Camping"
        )
        itemList.add(item7)

        val item8 = Item(
            R.drawable.privacy,
            "Belt suit blazer",
            "$120",
            "Camping"
        )
        itemList.add(item8)

        val item9 = Item(
            R.drawable.help,
            "Belt suit blazer",
            "$120",
            "Camping"
        )
        itemList.add(item9)

        val item10 = Item(
            R.drawable.friends,
            "Belt suit blazer",
            "$120",
            "Camping"
        )
        itemList.add(item10)

        val item11 = Item(
            R.drawable.logout,
            "Belt suit blazer",
            "$120",
            "Camping"
        )
        itemList.add(item11)

    }


}