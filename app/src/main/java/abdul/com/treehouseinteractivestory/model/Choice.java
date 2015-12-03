package abdul.com.treehouseinteractivestory.model;
import abdul.com.treehouseinteractivestory.R;
/**
 * Created by Guest on 12/2/15.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage ){
        mText = text;
        mNextPage = nextPage;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }
}
