package edu.sjsu.android.fictionalzoo;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//Class implementation for the Customized Adapter
class MyCustomAdapter extends ArrayAdapter<String> {
    Context context;
    int images[];
    String tls[];
    MyCustomAdapter(Context c, String[] titles, int img[]){
        super(c, R.layout.customized_listview, R.id.textView2, titles);
        this.context = c;
        this.images = img;
        this.tls = titles;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.customized_listview, parent, false);

//Setting the background color of the row
        if(position%2==0) {
            row.setBackgroundColor(Color.LTGRAY);
        }
        else{
            row.setBackgroundColor(Color.DKGRAY);
        }

//Getting the reference to the TextView and the ImageView
        ImageView iv = (ImageView) row.findViewById(R.id.imageView);
        TextView tv = (TextView) row.findViewById(R.id.textView2);

//Populating the ImageView and the TextView with appropriate data
        iv.setImageResource(images[position]);
        tv.setText(tls[position]);

        return row;
    }

}