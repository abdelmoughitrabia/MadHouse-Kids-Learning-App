package com.ipmapp.kidzyapp.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ipmapp.kidzyapp.Helper.TypeWriterTextView;
import com.ipmapp.kidzyapp.Object.AlphabetItem;
import com.madhouseapp.kidslearningapp.R;

import java.util.List;

/**
 * Created by Younes on 11-10-2017.
 */

public class SpellingAdapter extends RecyclerView.Adapter<SpellingAdapter.SpellingViewHolder> {

    private Context context;
    private List<AlphabetItem> alphabetItemList;
    private Typeface jellyCrazies;

    public class SpellingViewHolder extends RecyclerView.ViewHolder {
        private TypeWriterTextView textView;

        public SpellingViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.spelling_text);
        }
    }

    public SpellingAdapter(Context context, List<AlphabetItem> alphabetItemList) {
        this.context = context;
        this.alphabetItemList = alphabetItemList;
        jellyCrazies = Typeface.createFromAsset(context.getAssets(), "fonts/jelly_crazies.ttf");
    }

    @Override
    public SpellingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.spelling_item, parent, false);
        return new SpellingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SpellingViewHolder holder, int position) {
        int pos = position % alphabetItemList.size();
        AlphabetItem item = alphabetItemList.get(pos);
        holder.textView.setText("");
        holder.textView.setTypeface(jellyCrazies);
        holder.textView.setCharacterDelay(500);
        holder.textView.displayTextWithAnimation(item.getAlphabet());
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}