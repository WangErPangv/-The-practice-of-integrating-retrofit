package wby.laowang.threetest.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import butterknife.BindView;
import butterknife.ButterKnife;
import wby.laowang.threetest.R;


public class MyHolderone extends RecyclerView.ViewHolder {

    @BindView(R.id.one_img)
    SimpleDraweeView oneImg;
    @BindView(R.id.one_text)
    TextView oneText;

    public MyHolderone(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);

    }
}
