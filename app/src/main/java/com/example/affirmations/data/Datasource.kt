package com.example.affirmations.data
import com.example.affirmations.R
import com.example.affirmations.model.Affrimation


class Datasource {

    fun loadAffirmations(): List<Affrimation>
    {

        return listOf<Affrimation>(
            Affrimation(R.string.affirmation1, R.drawable.image1),
            Affrimation(R.string.affirmation2, R.drawable.image2),
            Affrimation(R.string.affirmation3, R.drawable.image3),
            Affrimation(R.string.affirmation4, R.drawable.image4),
            Affrimation(R.string.affirmation5, R.drawable.image5),
            Affrimation(R.string.affirmation6, R.drawable.image6),
            Affrimation(R.string.affirmation7, R.drawable.image7),
            Affrimation(R.string.affirmation8, R.drawable.image8),
            Affrimation(R.string.affirmation9, R.drawable.image9),
            Affrimation(R.string.affirmation10, R.drawable.image10)


        )
    }


}