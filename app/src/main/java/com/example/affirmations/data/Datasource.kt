package com.example.affirmations.data
import com.example.affirmations.R
import com.example.affirmations.model.Affrimation


class Datasource {

    fun loadAffirmations(): List<Affrimation>
    {

        return listOf<Affrimation>(
            Affrimation(R.string.affirmation1),
            Affrimation(R.string.affirmation2),
            Affrimation(R.string.affirmation3),
            Affrimation(R.string.affirmation4),
            Affrimation(R.string.affirmation5),
            Affrimation(R.string.affirmation6),
            Affrimation(R.string.affirmation7),
            Affrimation(R.string.affirmation8),
            Affrimation(R.string.affirmation9),
            Affrimation(R.string.affirmation10)


        )
    }
}