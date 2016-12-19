package neworld.lt.mergetest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * @author Andrius Semionovas
 * @since 2016-12-19
 */

public class CustomView extends LinearLayout {
    public CustomView(Context context) {
        this(context, null, 0);
    }

    public CustomView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setOrientation(LinearLayout.VERTICAL);
        LayoutInflater.from(getContext()).inflate(R.layout.custom_view, this, true);

        if (getChildCount() == 1) {
            throw new RuntimeException("Inflated without merge");
        }
    }
}
