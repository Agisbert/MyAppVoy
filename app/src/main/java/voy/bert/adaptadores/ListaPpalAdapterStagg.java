package voy.bert.adaptadores;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import voy.bert.myapplication.R;


public class ListaPpalAdapterStagg extends BaseAdapter {
    private List<String> itemDetailsrrayList;


    private LayoutInflater l_Inflater;

    public ListaPpalAdapterStagg(Context context, List<String> results) {
        if (results != null) {
            itemDetailsrrayList = results;
        } else {
            itemDetailsrrayList = new ArrayList<String>();
        }
        l_Inflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return itemDetailsrrayList.size();
    }

    public Object getItem(int position) {
        return itemDetailsrrayList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;


        if (convertView == null) {
            holder = new ViewHolder();
            convertView = l_Inflater.inflate(R.layout.item_list_ppal, null);

            holder.Nombre = (TextView) convertView.findViewById(R.id.textView);
            holder.Nombre.setText(itemDetailsrrayList.get(position));


            convertView.setTag(holder);


        } else {
            holder = (ViewHolder) convertView.getTag();

        }


        return convertView;
    }


    static class ViewHolder {
        TextView Nombre;
    }


}

