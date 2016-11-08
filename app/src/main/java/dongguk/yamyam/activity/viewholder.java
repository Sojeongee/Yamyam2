package dongguk.yamyam.activity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import dongguk.yamyam.R;
/**
 * Created by ash on 2016-10-29.
 */
public class viewholder extends RecyclerView.ViewHolder {
    TextView contentView;
    TextView titleView;
    ImageView imageView;
    public viewholder(View itemView) {
        super(itemView);
        contentView = (TextView)itemView.findViewById(R.id.titleTextView);
        titleView = (TextView)itemView.findViewById(R.id.contentTextView);
        imageView = (ImageView)itemView.findViewById(R.id.imageView1);
    }
}

