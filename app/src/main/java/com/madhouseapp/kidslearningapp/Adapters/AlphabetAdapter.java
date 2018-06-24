package com.madhouseapp.kidslearningapp.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.madhouseapp.kidslearningapp.Object.AlphabetItem;
import com.madhouseapp.kidslearningapp.R;

import java.util.List;

/**
 * Created by Younes.
 */

public class AlphabetAdapter extends RecyclerView.Adapter<AlphabetAdapter.AlphabetViewHolder> {

    private Context context;
    private List<AlphabetItem> alphabetItemList;
    private Typeface chalkDuster;

    public class AlphabetViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public AlphabetViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.alphabet_text);
        }
    }

    public AlphabetAdapter(Context context, List<AlphabetItem> alphabetItemList) {
        this.context = context;
        this.alphabetItemList = alphabetItemList;
        chalkDuster = Typeface.createFromAsset(context.getAssets(), "fonts/chalkduster.ttf");
    }

    @Override
    public AlphabetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.alphabet_item, parent, false);
        return new AlphabetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AlphabetViewHolder holder, int position) {
        int pos = position % alphabetItemList.size();

        AlphabetItem item = alphabetItemList.get(pos);
        holder.textView.setText(item.getAlphabet());
        holder.textView.setTypeface(chalkDuster);
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
