package com.example.sellemi.miniprojetandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.sellemi.miniprojetandroid.R.id.listabsent;


public class AppelEtudiantActivity extends Activity {

    Button btnValider;
    ListView list,listab;


    ArrayAdapter ada,adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appel_etudiant);
        btnValider=(Button)findViewById(R.id.idEnreglist);


        list = (ListView) findViewById(R.id.listetudiant);
        listab=(ListView)findViewById(listabsent);

        final ArrayList<Etudiant> where = new ArrayList<>();
        Etudiant e1=new Etudiant("Emna","Sellemi");
        Etudiant e2=new Etudiant("Ahmed","Balti");
        where.add(e1);
        where.add(e2);
        ada = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, where);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list.setAdapter(ada);




        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int posi, long l) {

                          SparseBooleanArray checked = list.getCheckedItemPositions();


                            if(checked.get(posi)) {
                                Toast.makeText(getApplicationContext(), where.get(posi) + "present", Toast.LENGTH_SHORT).show();
                            }
                            else{

                                        ArrayList<Etudiant>listabsent=new ArrayList<>();
                                        listabsent.add(where.get(posi));
                                        listabsent.add(where.get(posi));

                                adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, listabsent);

                                listab.setAdapter(adapter);

                                Toast.makeText(getApplicationContext(), "ajouter", Toast.LENGTH_SHORT).show();


                                Toast.makeText(getApplicationContext(), where.get(posi) + "absent", Toast.LENGTH_SHORT).show();
                            }


                            }










                });

btnValider.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    }
});
}}