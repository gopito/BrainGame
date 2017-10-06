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


public class TwoFragment extends Fragment {
    Map<String, String> stringsList = new HashMap();


    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        stringsList.put("50", "ПеНь");
        stringsList.put("51", "ПауК");
        stringsList.put("52", "ПуЛя");
        stringsList.put("53", "ПеТух");
        stringsList.put("54", "ПЧела");
        stringsList.put("55", "ПаПугай");
        stringsList.put("56", "ПуШка");
        stringsList.put("57", "ПиСьмо");
        stringsList.put("58", "ПаВлин");
        stringsList.put("59", "ПеДаль");
        stringsList.put("60", "ШиНа");
        stringsList.put("61", "ШКаф");
        stringsList.put("62", "ШиЛо");
        stringsList.put("63", "ШТаны");
        stringsList.put("64", "ИШаЧок");
        stringsList.put("65", "ШПага");
        stringsList.put("66", "ШиШка");
        stringsList.put("67", "ШеСт");
        stringsList.put("68", "ШВабра");
        stringsList.put("69", "ШеДевр");
        stringsList.put("70", "СеНо");
        stringsList.put("71", "СоК");
        stringsList.put("72", "СЛон");
        stringsList.put("73", "СиТо");
        stringsList.put("74", "СаЧок");
        stringsList.put("75", "СаПог");
        stringsList.put("76", "СуШки");
        stringsList.put("77", "СоСиска");
        stringsList.put("78", "СоВа");
        stringsList.put("79", "СеДло");
        stringsList.put("80", "ВиНоград");
        stringsList.put("81", "ВоК");
        stringsList.put("82", "ВиЛка");
        stringsList.put("83", "ВеТка");
        stringsList.put("84", "ВеЧернее Платье");
        stringsList.put("85", "ВеПрь");
        stringsList.put("86", "ВеШалка");
        stringsList.put("87", "ВеСы");
        stringsList.put("88", "ВыВеска");
        stringsList.put("89", "ВеДро");
        stringsList.put("90", "ДеНьги");
        stringsList.put("91", "ДиКобраз");
        stringsList.put("92", "ДеЛьфин");
        stringsList.put("93", "ДяТел");
        stringsList.put("94", "ДиЧь");
        stringsList.put("95", "ДуПло (в дереве сухом)");
        stringsList.put("96", "ДуШ");
        stringsList.put("97", "ДоСка");
        stringsList.put("98", "ДВерь");
        stringsList.put("99", "ДуДочка");


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
            int bound = 10;
            for (int j = 5; j < bound; j++) {

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

