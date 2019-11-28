import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.manbis_eventco.R;

public class ImageAdapter extends PagerAdapter {

    private Context mContext;
    private int[] ImageIds = new int[]{}

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }
}
