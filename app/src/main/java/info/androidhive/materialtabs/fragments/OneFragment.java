package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment {
    Map<String, String> stringsList = new HashMap();


    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        stringsList.put("00", "НиНтендо");
        stringsList.put("01", "НеКтарин");
        stringsList.put("02", "НЛо");
        stringsList.put("03", "НиТки");
        stringsList.put("04", "НоЧник");
        stringsList.put("05", "НаПерсток");
        stringsList.put("06", "НоЖ");
        stringsList.put("07", "НоСки");
        stringsList.put("08", "НоВогодняя Елка");
        stringsList.put("09", "НуДист");
        stringsList.put("10", "КНига");
        stringsList.put("11", "КаКтус");
        stringsList.put("12", "КоЛье");
        stringsList.put("13", "КоТ");
        stringsList.put("14", "КаЧели");
        stringsList.put("15", "КеПка");
        stringsList.put("16", "КоШелек");
        stringsList.put("17", "КиСть");
        stringsList.put("18", "КоВер");
        stringsList.put("19", "КеДы");
        stringsList.put("20", "ЛиНейка");
        stringsList.put("21", "ЛуК");
        stringsList.put("22", "ЛиЛия");
        stringsList.put("23", "ЛоТок");
        stringsList.put("24", "ЛиЧинка");
        stringsList.put("25", "ЛоПата");
        stringsList.put("26", "ЛоШадь");
        stringsList.put("27", "ЛиСа");
        stringsList.put("28", "ЛеВ");
        stringsList.put("29", "ЛоДка");
        stringsList.put("30", "ЛоДка");
        stringsList.put("31", "ТаНк");
        stringsList.put("31", "ТиКтак");
        stringsList.put("32", "ТюЛень");
        stringsList.put("33", "ТеТрадь");
        stringsList.put("34", "ТоЧилка");
        stringsList.put("35", "ТоПор");
        stringsList.put("36", "ТуШь");
        stringsList.put("37", "ТеСто");
        stringsList.put("38", "ТВорог (пачка)");
        stringsList.put("39", "ТайД");
        stringsList.put("40", "ЧайНик");
        stringsList.put("41", "ЧеКа");
        stringsList.put("42", "ЧуЛок");
        stringsList.put("43", "ЧеТки");
        stringsList.put("44", "ЧуЧело");
        stringsList.put("45", "ЧуПачупс");
        stringsList.put("46", "ЧашКа");
        stringsList.put("47", "ЧаСы");
        stringsList.put("48", "ЧерВяк");
        stringsList.put("49", "ЧуДо (йогурт)");

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        View pl = rootView.findViewById(R.id.button_container);
        for (int i = 0; i < 10; i++) {
            LinearLayout row = new LinearLayout(inflater.getContext());
            row.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            int bound = 5;
            for (int j = 0; j < bound; j++) {

                final Button btnTag = new Button(inflater.getContext());
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f);


                btnTag.setLayoutParams(params);
                String buttonValue = String.valueOf(j) + String.valueOf(i);
                btnTag.setText(buttonValue);
                btnTag.setTag(buttonValue);
                btnTag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView textView = (TextView) rootView.findViewById(R.id.text);
                        textView.setText(String.format("%s: %s", v.getTag(), stringsList.get(v.getTag())));

                    }
                });
                row.addView(btnTag);
            }

            ((LinearLayout) pl).addView(row);
        }

        return rootView;
    }


}

