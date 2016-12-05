package fragment.bwie.com.myimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView mView = (ImageView) findViewById(R.id.image);
        PhotoViewAttacher mPhotoViewAttacher = new PhotoViewAttacher(mView);
    }
}
