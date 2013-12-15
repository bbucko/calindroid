package pl.iogreen.calindroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class BookAdapter extends BaseAdapter {

    private final String[] data;
    private final Context ctx;

    public BookAdapter(String[] data, Context ctx) {
        this.data = data;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return data[position].hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.book_layout, parent, false);
        return convertView;
    }
}
